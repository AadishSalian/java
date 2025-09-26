package a;

import java.util.*;

class Array
{
	int arr[]=new int[20];
	int n;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	int small()
	{
		int small=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]<small)
				small=arr[i];
		}
		return small;
	}
	void  divide()
	{
		for(int i=0;i<n;i++)
		{
			int div=arr[1]/small();
		}
		System.out.println("Division successful");
	}
	void getelement()
	{
		System.out.println("Enter the index of the element");
		Scanner sc=new Scanner(System.in); 
		int i=sc.nextInt();
		System.out.println("The accessed element="+arr[i]);
	}
}
public class MultiCatchDemo {
	public static void main(String[] args) {
	   Array a1=new Array();
	   try
	   {
		   a1.read();
		   a1.divide();
		   a1.getelement();
		   int m=Integer.parseInt("123");
	   }
	   catch(ArithmeticException ex)
	   {
		   System.out.println("ArithmeticException Caught");
	   }
	   catch(NumberFormatException ex)
	   {
		   System.out.println("NumberFormatException Caught");
	   }
	   catch(InputMismatchException ex)
	   {
		   System.out.println("InputMismatchException Caught");
	   }
	   catch(ArrayIndexOutOfBoundsException ex)
	   {
		   System.out.println("ArrayIndexOutOfBoundsException Caught");
	   }
	   System.out.println("Remaining code.....");
	}
}