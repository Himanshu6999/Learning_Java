package lets_explore;

class calci
{
	
	int num1, num2 = 24;
	

	/*
		THIS Keyword is used to call the current object. 
		It is used to differentiate between the INSTANCE Variable and LOCAL Variable ... if both have same names.
	*/

	
	public calci(int num2)					
	{
		this.num2 = num2;					// assigning value to instance variable by calling values from current object
		
	}
	
}

public class ThisKeyword 
{

		public static void main(String args[])
		{
			calci This_K = new calci(11);
			System.out.println("Value of num2 Instance using THIS Keyword \n" + This_K.num2);
			
						
		}
}
