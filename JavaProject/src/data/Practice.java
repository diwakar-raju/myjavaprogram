package data;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int d=0;
		int min=0;
		
		while(n!=0)
		{
			d=n%10;
			if(min<d)
			{
				min = d;
			}
			n=n/10;
		}
		int min1=0;
		while(n1!=0)
		{
			d=n1%10;
			if(min1<d)
			{
				min1 = d;
			}
			n1=n1/10;
		}
		int min2=0;
		while(n2!=0)
		{
			d=n2%10;
			if(min2<d)
			{
				min2 = d;
			}
			n2=n2/10;
		}
		int sum=min+min1+min2;
		//System.out.println(sum);
		
		int max=9;
		while(n!=0)
		{
			d=n%10;
			if(max>d)
			{
				max=d;
			}
			n=n/10;
		}
		int max1=9;
		while(n1!=0)
		{
			d=n1%10;
			if(max1>d)
			{
				max1=d;
			}
			n1=n1/10;
		}
		int max2=9;
		while(n2!=0)
		{
			d=n2%10;
			if(max2>d)
			{
				max2=d;
			}
			n2=n2/10;
		}
		int sum1=(max+max1+max2)+(min+min1+min2);
		
		System.out.println(sum1);
	}
}
