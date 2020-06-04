
public class Compile2 
{
	void test1()
	{
		System.out.println("chetan");
		
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException ie)
		{
			System.out.println("exception handled");
		}
		System.out.println("prekash");
	}
}
