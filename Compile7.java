
public class Compile7 
{
	public static void main(String[] args)
	{
		System.out.println("mme");
		
		try 
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
	}

}
