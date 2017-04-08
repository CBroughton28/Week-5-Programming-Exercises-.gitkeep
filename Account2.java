	import java.text.NumberFormat;
	import java.util.ArrayList;
	import java.util.Date;
	

	public class Account2
	{
		private int id;
		private double balance;
		private double annualInterestRate;
		private Date dateCreated = new Date();
		private String name;
		private ArrayList<Transaction> Transactions = new ArrayList<Transaction>();
	

		public Account2()
		{
			id = 0;
			balance = 0;
			annualInterestRate = 0;
		}
	

		public Account2(int _id, int _balance)
		{
			id = _id;
			balance = _balance;
		}
	

		public Account2(String _name, int _id, int _balance)
		{
			name = _name;
			id = _id;
			balance = _balance;
		}
	
		public int getId()
		{
			return id;
		}
	

		public void setId(int NewId)
		{
			id = NewId;
		}
	
		public double getBalance()
		{
			return balance;
		}
	

		public void setBalance(double NewBalance)
		{
			balance = NewBalance;
		}
	
		public double getAnnualInterestRate()
		{
			return annualInterestRate;
		}
	

		public void setAnnualInterestRate(double NewAnnualInterestRate)
		{
			annualInterestRate = NewAnnualInterestRate;
		}
	

		public Date getDateCreated()
		{
			return dateCreated;
		}
		
		public String getName()
		{
			return name;
		}

		public double getMonthlyInterestRate()
		{
			return annualInterestRate / 12.0;
		}
	
		public double getMonthlyInterest()
		{
			double monthlyInterest = balance * (getMonthlyInterestRate() / 100);
			return monthlyInterest;
		}
	
		public void withdraw(double WithdrawAmount)
		{
		
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
			
			balance -= WithdrawAmount;
			Transactions.add(new Transaction(new Date(), 'W', WithdrawAmount, balance, "Withdrew " + currencyFormat.format(WithdrawAmount)));
		}
	

		public void deposit(double DepositAmount)
		{
			NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
			
			balance += DepositAmount;
			Transactions.add(new Transaction(new Date(), 'D', DepositAmount, balance, "Deposited " + currencyFormat.format(DepositAmount)));
		}
		
		public ArrayList<Transaction> getTransactions()
		{
			return Transactions;
		}
	
		@Override
		public String toString()
		{
			return "Account for " + name;
		}
	}
	

	class Transaction
	{
		private Date date;
		private char type;
		private double amount;
		private double balance;
		private String description;
	

		public Transaction(Date _date, char _type, double _amount, double _balance, String _description)
		{
			date = _date;
			type = _type;
			amount = _amount;
			balance = _balance;
			description = _description;
		}
	
		public Date getDate()
		{
			return date;
		}
		
		public char getType()
		{
			return type;
		}
		
		public double getAmount()
		{
			return amount;
		}
		
		public double getBalance()
		{
			return balance;
		}
		
		public String getDescription()
		{
			return description;
		}
	}
