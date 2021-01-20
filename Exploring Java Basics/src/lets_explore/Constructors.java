package lets_explore;

class calc{
	
	int num1, num2, result;
	
	public void sum()
	{
		result = num1 + num2;
		System.out.println("sum = " + result);
	}
	public void sub()
	{
		result = num1 - num2;
		System.out.println("sub = " + result);
	}
	public void mul()
	{
		result = num1 * num2;
		
	}
	
	/*
	  Constructor have the name same as class name. 
	  It's get called automatically, when the object is created.
	  Constructor : Never return anything. {No return type}
	  Constructors are of following types:
	  	1. Default Constructors 		2. Parameterized Constructors 		3. Copy Constructors
	*/
	
	public calc()								// Default Constructors 
	{
		num1 = 7;
		num2 = 2;
		System.out.println("In Default Constructor");
	}
	
	public calc(int a,int b)					// Parameterized Constructors	
	{
		System.out.println("In Parameterizd Constructor");
		num1 = a;
		num2 = b;

	}
	
}

public class Constructors {

		public static void main(String args[])
		{
			calc c1 = new calc();				// Default Constructor
			c1.sum();
			calc c2 = new calc(15,9); 			// Parameterized Constructor
			c2.sub();	
			System.out.println("In Default Constructor"); 	// Since, C1 object is called, which is a default constructor.
			c1.mul();
			System.out.println("mul = " + c1.result);
						
		}
}
