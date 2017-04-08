import java.util.Scanner;

public class PerfectSquare
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer m: ");

		int inputM = setInt(input);

		System.out.println("The smallest number n for m * n to be a perfect square is " + findN(inputM));
		System.out.println("m * n is " + inputM * findN(inputM));
	}

	private static int setInt(Scanner input)
	{
		while (!input.hasNextInt())
		{
			System.out.println("Error:  Not an integer.  Try again.");
			input.next();
		}
		return input.nextInt();
	}

	private static int findN(int m)
	{
		int n = 0;
		int originalM = m;

		boolean isFound = false;

		while (!isFound)
		{
			n++;

			m = originalM * n;

			int squareRoot = (int)Math.sqrt(m);
			
			if (squareRoot * squareRoot == m)
			{
				return n;
			}
		}
		
		return -1;
	}

}