package Raghu1;

import java.util.Scanner;

public class Dec5 {
	public static void main(String[] args) {
		int cutoff;
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter ur choice : ");
		n=sc.next();
		switch(n) {
		case "A":
			System.out.println("medeical");
			int a,b,c;
			System.out.print("enter physics mark : ");
			a=sc.nextInt();
			System.out.print("enter chemistry mark : ");
			b=sc.nextInt();
			System.out.print("enter bio mark :");
			c=sc.nextInt();
			cutoff=(a/4)+(b/4)+(c/2);
			System.out.println("cutoff percentage = "+cutoff);
			if(cutoff>=60 && cutoff<=120)
			{
				System.out.print("can apply for arts");
			}
			else if (cutoff>=121 && cutoff<=180)
			{
				System.out.print("can apply for engg");
			}
			else if (cutoff>181 && cutoff<=200)
			{
				System.out.print("can apply for medical");
			}
			else
			{
				System.out.println("invalid mark");
				
			}
			break;
		case "B":

			System.out.println("Engineering");
			int d,e,f;
			System.out.print("enter physics mark : ");
			d=sc.nextInt();
			System.out.print("enter chemistry mark : ");
			e=sc.nextInt();
			System.out.print("enter cse mark :");
			f=sc.nextInt();
			cutoff=(d/4)+(e/4)+(f/2);
			System.out.println("cutoff percentage = "+cutoff);
			if(cutoff>=60 && cutoff<=120)
			{
				System.out.print("can apply for arts");
			}
			else if (cutoff>=121 && cutoff<=180)
			{
				System.out.print("can apply for engg");
			}
			else if (cutoff>181 && cutoff<=200)
			{
				System.out.print("can apply for medical");
			}
			else
			{
				System.out.println("invalid mark");
			
		}
			break;
		default:
		{
			System.out.println(" invalid input ");
		}
		
}
	}
}

