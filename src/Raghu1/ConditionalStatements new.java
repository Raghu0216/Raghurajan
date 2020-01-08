package Raghu1;

public class ConditionalStatements {
public static void main(String[] args) {
	int Eng=65;
	int Mat=75;
	int Chem=75;
	int Phy=80;
	int Tamil=75;
	
	int Total= Eng+Mat+Chem+Phy+Tamil;
	System.out.println("total mark"+ Total);
	 int ava=Total/5;
	 System.out.println("ava rank"+ ava);
	 
	if(ava>=50 && ava<=60)
	{
		System.out.println("c grade");
	}
	else if(ava>=61 && ava<=80)
	{
		System.out.println("B grade");
	}
	else if(ava>=90 && ava<=100)
	{
		System.out.println("A grade");
	}
}
	
	}
