package Raghu1;

import java.util.Scanner;

public class Dec11homework {
public static void main(String[] args) {
	
	int n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	n=sc.nextInt();
	int s[]=new int[n];
	System.out.println("enter the elements in array : ");
	for(int i=0;i<n;i++)	
	{
		s[i]=sc.nextInt();
		sum=sum+s[i];
		}
	System.out.println("sum= " +sum);

}

}
