import java.util.Date;

public class Account
{
	protected int Id;
	protected double Balance;
	protected double AnnualInterestRate;
	protected Date DateCreated = new Date();

	public Account()
	{
		Id = 0;
		Balance = 0;
		AnnualInterestRate = 0;
	}

	public Account(int id, int balance)
	{
		Id = id;
		Balance = balance;
	}

	public int getId()
	{
		return Id;
	}

	public void setId(int newId)
	{
		Id = newId;
	}

	public double getBalance()
	{
		return Balance;
	}

	public void setBalance(double newBalance)
	{
		Balance = newBalance;
	}

	public double getAnnualInterestRate()
	{
		return AnnualInterestRate;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate)
	{
		AnnualInterestRate = newAnnualInterestRate;
	}
	
	public Date getDateCreated()
	{
		return DateCreated;
	}

	public double getMonthlyInterestRate()
	{
		return AnnualInterestRate / 12.0;
	}

	public double getMonthlyInterest()
	{
		double monthlyInterest = Balance * (getMonthlyInterestRate() / 100);
		return monthlyInterest;
	}

	public void withdraw(double withdrawAmount)
	{
		Balance -= withdrawAmount;
	}

	public void deposit(double depositAmount)
	{
		Balance += depositAmount;
	}


	@Override
	public String toString()
	{
		return "Account";
	}
}

class CheckingAccount extends Account
{
	int OverdraftLimit;

	public CheckingAccount()
	{
		OverdraftLimit = 0;
	}

	public CheckingAccount(int id, int balance, int overdraftLimit)
	{
		Id = id;
		Balance = balance;
		OverdraftLimit = overdraftLimit;
	}

	
	@Override
	public void withdraw(double withdrawAmount)
	{
		double tempBalance = Balance;
		tempBalance -= withdrawAmount;

		if (tempBalance >= -OverdraftLimit)
		{
			Balance = tempBalance;
		}
	}

	@Override
	public String toString()
	{
		return "CheckingAccount";
	}

}

class SavingsAccount extends Account
{
	public SavingsAccount(int id, int balance)
	{
		Id = id;
		Balance = balance;
	}

	@Override
	public void withdraw(double withdrawAmount)
	{
		double tempBalance = Balance;
		tempBalance -= withdrawAmount;

		if (tempBalance >= 0)
		{
			Balance = tempBalance;
		}
	}

	@Override
	public String toString()
	{
		return "SavingsAccount";
	}
}