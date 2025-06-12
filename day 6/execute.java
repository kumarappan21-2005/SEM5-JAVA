 class Multith1 extends Thread{

	private String name;
	Multith1(String name)
	{
		super(name);
		this.name=name;
	}
		public void run()
		{
		for(int i=0;i<=5;i++)
		System.out.println(name);
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}

}
public class execute
{
	public static void main(String[] args) {
		Multith1 m = new Multith1("Thread-1");
		Multith1 m1= new Multith1("Thread-2");
		m.start();
		m1.start();
	}
}
