package guviii;
import java.util.*;
public class hunter41 {
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n=s.nextInt();
			int sum=0;
			System.out.println("Enter the elements");
			int[] a=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=s.nextInt();
			}
			for(int j=0;j<n;j++)
			{
				if(a[j]>0)
				{
					sum=sum+a[j];
				}
			}
	System.out.println("The result is "+sum);
}
}
