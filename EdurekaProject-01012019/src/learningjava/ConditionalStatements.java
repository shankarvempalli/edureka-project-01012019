package learningjava;

public class ConditionalStatements {
	
	public static void main(String[] args)
	{
		//Greatest of 2 numbers
		
		int num1 = 10, num2 = 12;
		
		if(num1 > num2)
		{
			System.out.println("Number 1 is greater...");
			
		}
		
		else if(num2 > num1)
		{
			System.out.println("Number 2 is greater...");
		}
		
		else
		{
			System.out.println("Both are equal");
		}
	}

}
