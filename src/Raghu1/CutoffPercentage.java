package Raghu1;

public class CutoffPercentage {
	public static void main(String[] args) {
		int Mat=189;
		int Science=198;
		int Bio=198;
		int Cutoff=(Mat/4)+(Science/4)+(Bio/2);
		System.out.println("the Marks is "+ Cutoff);
		
		if(Cutoff<=100) {
			System.out.println("Is Eligible for Arts");
		}
		else if(Cutoff>=101&&Cutoff<=150){
			System.out.println("Is Eligible for Engg");
		}
		else if(Cutoff>=151&&Cutoff<=200) {
			System.out.println("Is Eligible for Medicine");
		}
	}

}
