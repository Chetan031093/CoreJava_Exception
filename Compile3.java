
public class Compile3
{
	void test2()
	{
		System.out.println("chetan");
		try
		{	
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie.getMessage());
			}
			System.out.println("prakash");
			Thread.sleep(3000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("handled..1");
		}
		System.out.println("salve");	
	}

}
