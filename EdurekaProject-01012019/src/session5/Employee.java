package session5;

public class Employee {

		int salary, bonus;
		
		public void CalculateSalary()
		{
			int totalsalary;
			
			totalsalary = salary + bonus;
			
			System.out.println("Total Salary is: "+ totalsalary);
		}
}
