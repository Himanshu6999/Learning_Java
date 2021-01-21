package lets_explore;

/*
 
  Method or Function Overloading is when we define many methods/functions with same name. 
  All the method with same name must have different parameters or return type.
  Like in the below example:  
  
 */

class area1
{
	public double ar_c(double r)
	{
		double res_c = 3.14 * r *r;
		System.out.println("area of circle \n= " + res_c);
		return res_c;
	}
	public int ar_rect(int l, int b)							// having 2 parameters with integer return type.
	{   
		int res_rect = l * b;
		System.out.println("area of rectangle \n= " + res_rect);
		return res_rect;
	}
	public double ar_tri(double l, double b)					// having 2 parameters with double return type.
	{   
		double res_rect = l * b;
		System.out.println("area of rectangle" + res_rect);
		return res_rect;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args)
	{
		area1 ar = new area1();
		ar.ar_c(3.5);
		ar.ar_rect(2,3);
	}

}
