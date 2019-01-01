package learningjava;

public class VariableExamples 
{
	public static void main(String[] args) 
	{
		int myVar; //int and long are reserved keywords
		
		myVar = 10;
		
		int num2 = 45;
		
		System.out.println("Sum: "+ (myVar + num2));
		System.out.println("Sub: "+ (myVar - num2));
		System.out.println("Remainder: "+ (num2 % myVar));
		
		long longvar = 2395758445l;
		
		float myFloatVar = 8345.59834873f;
		
		System.out.println("My Var value is: "+ myVar);
		
		System.out.println("My long var value is: "+ longvar);
		
		System.out.println("My float value is: "+ myFloatVar);
		
		boolean var = false;
		
		System.out.println("My boolean value is: "+ var);
	}
}
