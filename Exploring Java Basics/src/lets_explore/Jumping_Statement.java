package lets_explore;

public class Jumping_Statement {

		public static void main(String args[])
		{
			
			// Jumping Statement 
			// continue
			System.out.println("continue");
			for(int i=1; i <= 7; i++)
			{
				if(i == 4)
				{
					continue;				// exits from particular condition.
				}
				
				System.out.println("Value is " + i);
			}
		
			System.out.println("break");
			
			// break
			
			for(int i=1; i <= 7; i++)
			{
				if(i == 4)
				{
					break;					// exits from whole loop and not run the code for remaining condition.
				}
				System.out.println("Value is " + i);
			}
		
		}
}
