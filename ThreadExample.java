class ThreadExample extends Thread
{
	
	public void run()
	{
		
		
		for(int i=1; i<=100; i++)
		{
			System.out.println("Vicky Singh");
			
		}
	}
	public static void main(String[] args) 
	{
		ThreadExample t=new ThreadExample();
		t.start();
		
		
	}
}