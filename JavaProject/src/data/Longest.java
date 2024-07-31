package data;
import java.util.*;

public class Longest {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] s=new String[n];
		int i;
		for(i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(i=0;i<n;i++)
		{
			char[] c=s[0].toCharArray();
			char a=' ';
			for(int j=0;j<s[0].length();j++)
			{
				a=c[j];
				
				
			
			for(i=1;i<n;i++)
			{
				char[] ch=s[i].toCharArray();
				for(int k=0;k<s[i].length();k++)
				{
					if(ch[k]==a)
					{
						System.out.print(c[k]);
						
						
					}
					
					
				}
				//a=' ';
			
			}
			}
			
		}
		
		}
		
	}
	
	
		


 
	
