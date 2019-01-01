package session5;

public class DemoEmployee {

	public static void main(String[] args) 
	{
		Employee shankar; //shankar will have everything which have Employee class - declare a variable
		
		//shankar will become non primitive data type
		
		//Instantiating and Initializing variable
		shankar = new Employee();
		
		shankar.salary = 100000;
		
		shankar.bonus = 10000;
	
		shankar.CalculateSalary();
	}

}
