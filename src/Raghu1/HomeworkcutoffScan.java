package Raghu1;

import java.util.Scanner;

public class HomeworkcutoffScan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,cutoff;
		System.out.println("maths mark : ");
		a=sc.nextInt();
		System.out.println("physics mark : ");
		b=sc.nextInt();
		System.out.println("chemistry mark : ");
		c=sc.nextInt();
		cutoff=(a/2)+(b/4)+(c/4);
		System.out.println("cutoff marks ="+cutoff);
		if(cutoff<=90)
		{
			System.out.println("can apply for arts");
		}
		else if(cutoff >=91 && cutoff<=180)
		{
			System.out.println("can apply for engg");
		}
		else if (cutoff>=181 && cutoff<=200)
		{
			System.out.println("can appaly for medical");
		}
	}
	

}
