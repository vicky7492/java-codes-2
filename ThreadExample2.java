class ThreadExample2 extends Runnable
{
	
	public void run()
	{
		
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("Vicky Singh");
			
            try {
                   Thread.sleep(1000);
		}
           catch(Exception e){}
	}
	public static void main(String[] args) 
	{
		Example t1=new Example();
                Thread t2=new Thread(t1);
		t2.start();
		
		
	}
}