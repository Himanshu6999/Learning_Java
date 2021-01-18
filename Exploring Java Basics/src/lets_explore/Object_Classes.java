package lets_explore;

class calculator{
	
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
	
}

public class Object_Classes {

		public static void main(String args[])
		{
			calculator c1 = new calculator(); 		// c1 is the object which is used as reference to the class.
			c1.num1 = 5;
			c1.num2 = 3;
			c1.sum();
			c1.sub();
			c1.mul();
			System.out.println("mul = " + c1.result);
						
		}
}
