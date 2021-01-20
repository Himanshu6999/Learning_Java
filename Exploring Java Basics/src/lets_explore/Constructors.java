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
	*/
	
	public calc()					
	{
		num1 = 7;
		num2 = 2;
	}
	
}

public class Constructors {

		public static void main(String args[])
		{
			calc c1 = new calc(); 		// c1 is the #object which is used as #reference to the class.
			c1.sum();
			c1.sub();
			c1.mul();
			System.out.println("mul = " + c1.result);
						
		}
}
