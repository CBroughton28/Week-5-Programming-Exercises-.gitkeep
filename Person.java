import java.util.Date;

		public class Person
		{
			String name;
			String address;
			String phoneNumber;
			String emailAddress;

			public Person()
			{
				name = "";
				address = "";
				phoneNumber = "";
				emailAddress = "";
			}

			public Person(String Name, String Address, String PhoneNumber, String EmailAddress)
			{
				name = Name;
				address = Address;
				phoneNumber = PhoneNumber;
				emailAddress = EmailAddress;
			}

			@Override
			public String toString()
			{
				return "Person " + name;
			}
		}

		class Student extends Person
		{
			final String CLASS_STATUS;

			public Student()
			{
				CLASS_STATUS = "N/A";
			}

			public Student(String Name, String Address, String PhoneNumber, String EmailAddress, String classStatus)
			{
				name = Name;
				address = Address;
				phoneNumber = PhoneNumber;
				emailAddress = EmailAddress;
				CLASS_STATUS = classStatus;
			}

			@Override
			public String toString()
			{
				return "Student " + name;
			}
		}

		class Employee extends Person
		{
			String office;
			int salary;
			Date dateHired;

			public Employee()
			{
				office = "";
				salary = 0;
				dateHired = new Date();
			}

			public Employee(String Name, String Address, String PhoneNumber, String EmailAddress, String Office, int Salary,
					Date DateHired)
			{
				name = Name;
				address = Address;
				phoneNumber = PhoneNumber;
				emailAddress = EmailAddress;
				office = Office;
				salary = Salary;
				dateHired = DateHired;
			}

			@Override
			public String toString()
			{
				return "Employee " + name;
			}
		}

		class Faculty extends Employee
		{
			int officeHourStart;
			int officeHourEnd;
			String rank;

			public Faculty()
			{
				officeHourStart = 0;
				officeHourEnd = 0;
				rank = "";
			}

			public Faculty(String Name, String Address, String PhoneNumber, String EmailAddress, String Office, int Salary,
					Date DateHired, int OfficeHourStart, int OfficeHourEnd, String Rank)
			{
				name = Name;
				address = Address;
				phoneNumber = PhoneNumber;
				emailAddress = EmailAddress;
				office = Office;
				salary = Salary;
				dateHired = DateHired;
				officeHourStart = OfficeHourStart;
				officeHourEnd = OfficeHourEnd;
				rank = Rank;
			}

			@Override
			public String toString()
			{
				return "Faculty " + name;
			}
		}

		class Staff extends Employee
		{
			String title;

			public Staff()
			{
				title = "";
			}

			public Staff(String Name, String Address, String PhoneNumber, String EmailAddress, String Office, int Salary,
					Date DateHired, String Title)
			{
				name = Name;
				address = Address;
				phoneNumber = PhoneNumber;
				emailAddress = EmailAddress;
				office = Office;
				salary = Salary;
				dateHired = DateHired;
				title = Title;
			}

			@Override
			public String toString()
			{
				return "Staff " + name;
			}
		}