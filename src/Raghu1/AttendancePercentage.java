package Raghu1;

public class AttendancePercentage {
	public static void main(String[] args)
	{
	float tod=110;
	float nop=100;
	float avgdays=((nop/tod)*100);
	System.out.println("Attendance Peercentage ="+avgdays);
if(avgdays>75)
	{
		System.out.println("can allow for exam");
	}
	else if(avgdays>=60 && avgdays<=75)
{
	System.out.println("Shud Pay Penalty of rs5000");
}
	else
{
	System.out.println("cannot able to atten the exam");
	}
}
	
}

