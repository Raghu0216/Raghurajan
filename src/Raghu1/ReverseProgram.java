package Raghu1;

public class ReverseProgram {
public static void main(String[] args) {
	String a="RaghU";
	System.out.println("reverse of the string is: ");
	char ch[]=a.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.println(ch[i]);
	}
}
}
