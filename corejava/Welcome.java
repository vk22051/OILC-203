package corejava;

public class Welcome 
{
	//instance variable
	public int b=50;
	
	//static variable
	public static int c=100;
	
	public static void main(String[] args)
	{
		//local variable
		int a=25;
		Welcome object=new Welcome();
		System.out.println("A= "+a);
		System.out.println("B= "+object.b);
		System.out.println("C= "+c);
		
	}
}  