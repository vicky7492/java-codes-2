import java.util.*;

class HelloWorld
{
	int x,y;
	HelloWorld()
	{
		x=5;
		y=6;
	}
}

class CollectionCloneMethod
{
	public static void main(String[] args)
	{
		HelloWorld ob1=new HelloWorld();
		System.out.println(ob1.x+" "+ob1.y);
		HelloWorld ob2=ob1;
		ob2.x=10;
		System.out.println(ob1.x+" "+ob1.y);
		System.out.println(ob2.x+" "+ob2.y);
	}
}