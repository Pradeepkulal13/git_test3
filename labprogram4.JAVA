import java.util.Scanner;
public class labprogram4
{ 
	public static void main (String[]args)
	{
		Scanner s= new Scanner(System.in);
		int i,fac=1,n;
		System.out.print("Enter the number:");
		n = s.nextInt();
		for(i=1;i<=n;i++)
		{
			fac= fac*i;
		}
		System.out.println("the factorial of the given number is:"+fac);
	}
}
