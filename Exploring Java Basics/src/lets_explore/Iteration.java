package lets_explore;

public class Iteration
	{
	
		public static void main(String args[])
		{
			/*
		// While Loop 
		
		int i = 1;			// initiation
		
		while(i<5) 			// condition
		{
			System.out.println("This is while loop");
			i++;			// increment
		}
		
		int j = 5;			// initiation
		
		// do While Loop
		
		do
		{
			System.out.println("This is do while loop");
			j++;			// increment
			
		}while(j<5); 		// condition
		
		// for Loop
		
		for(int k = 1; k<=3; k++)
		{
			System.out.println(k);
		}
		
		// for-each Loop
		
		
		for(int k = 1; k<=3; k++)
			{
				System.out.println(k);
			}
			*/
		
		/*
		 	1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5 
			1 2 3 4 5 6 
		 */
//		
//		for(int i = 1; i <= 6; i++)
//		{
//			for(int j = 1; j <= i; j++)
//			{
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
		
		/*
		 
	 	A
		A B 
		A B C

	   */
//		
//		for(char i = 65; i <= 67; i++)
//		{
//			for(char j = 65; j <= i; j++)
//			{
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
//

		/*
		 
	 	$ $ $ $
		$     $
		$     $
		$ $ $ $

	    */
		
		for(int i = 1; i <= 4; i++)
		{
			if(i > 1 && i < 4)
			{
				for(int j = i-1; j <= 5; j+=3)
				{
					System.out.print("$ ");
					System.out.print("    ");
				}
				System.out.println(); 					
			}
			else
			{
			for(int j = 1; j <= 4; j++)
				{
					System.out.print("$ ");
				}
				System.out.println(); 		
			}
		}
			
		
		
	}
}
