package Raghu1;

public class SumofEvenNewandOddNew {
public static void main(String[] args) {
	int a=2,sum=,count=0,b=2;
	while(a<=10)
	{
		if(a%2==0)
		{
			sum=sum+a;
		}
		a++;
	}
	System.out.println(("Sum of Even ")+sum);
	while(b<=10)
	{
		if(b%2!=1)
		{
			sum=sum+b;
		}
		b++;
	}
	System.out.println("sum of odd "+sum);
}
}
