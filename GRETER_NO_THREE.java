package MARCH_16;
import java.util.*;
public class GRETER_NO_THREE 
{
	int a,b,c;
	Scanner s=new Scanner(System.in);
    
	void print()
	{
	System.out.println("enter no1:");
	a=s.nextInt();
	System.out.println("enter no2:");
	b=s.nextInt();
	System.out.println("enter no3:");
	c=s.nextInt();
	}
	
	void logic()
	{
		if(a>b && a>c)
			System.out.println(a+" is greater than "+b+" and "+c);		
		
		else if(b>c && b>a)
			System.out.println(b+" is greater than "+a+" and "+c);	
		else
			System.out.println(c+" is greater than "+b+" and "+a);	
	}
	
	public static void main(String args[])
	{
		GRETER_NO_THREE m=new GRETER_NO_THREE ();
		m.print();
		m.logic();
	}
}
