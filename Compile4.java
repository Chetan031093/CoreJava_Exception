
public class Compile4 
{
	void testt() throws InterruptedException
	{
		System.out.println("my name is chetan ");
		Thread.sleep(3000);
		System.out.println("surname is salve");
	}

}


class Compile44 extends Compile4
{
	@Override
	void testt() throws InterruptedException 
	{
		super.testt();
		Thread.sleep(3000);
		System.out.println("my name is akshay");
		Thread.sleep(3000);
		System.out.println("surname is salve");
	}
}

/*
my name is chetan 
3sec gap
suranme is salve
3sec gap
my name is akshay
3sec gap
surname is salve

*/