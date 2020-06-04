
class Compile1
{
	void view() throws InterruptedException
	{
		System.out.println("chetan");
		Thread.sleep(2000);
		System.out.println("salve");
	}
}

public class Compile 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Compile1 c1 = new Compile1();
		c1.view();	
	}
}
