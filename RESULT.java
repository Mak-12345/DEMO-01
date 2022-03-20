package MARCH_16;
import java.util.*;
public class RESULT 
{
	public static void main(String args[])
	{
		int marks;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter marks:");
		marks=s.nextInt();
		
		if(marks>80)
            System.out.println("congraulations..! A GRADE");	
		
		else if(marks>60 && marks<80)
			System.out.println("congraulations..! B GRADE");
		
		else if(marks>50 && marks<60)
			System.out.println("congraulations..! C GRADE");
		
		else
			System.out.println("sorry..! FAIL");				
					
	}
}
