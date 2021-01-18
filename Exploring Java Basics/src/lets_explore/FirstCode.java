package lets_explore;

public class FirstCode 
{
	public static void main(String args[])
	{	
		String i = "adc";
		
		switch(i) {
			case "abc": 
				System.out.println("One");
				break;
			case "acb": 
				System.out.println("Two");
				break;
			case "acc": 
				System.out.println("Three");
				break;
			case "acd": 
				System.out.println("Four");
				break;
			case "ace": 
				System.out.println("Five");
				break;
			default: 
				System.out.println("String is greater than abc");
				break;
		}

	}
	
}

