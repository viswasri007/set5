import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("no");
		}
		else if(n%2!=0)
		{
			System.out.println("no");
			n=n/2;
		}
		else
		{
		System.out.println("yes");
		}
	}
}
