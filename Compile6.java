
public class Compile6 
{
	void add(int a,int b) 
	{
		System.out.println("running add mthd");
		System.out.println("addition result is : "+(a+b));
	}
	
	void div(int a,int b) 
	{
		System.out.println("division  mthd");
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ae is handled" );
		}
		add(a, b);
		
	}

	void sub(int a,int b)
	{
		System.out.println("running sub mthd");
		System.out.println("sub result is : "+(a-b));
		div(a,b);
	}
}
