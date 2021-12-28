package week1.day2;

public class ArmStrongNumber {
public static void main(String[] args) {
	int number=246;
	int result=0;
	int originalNumber=number;
	 
	while(number>0)
	{
		int temp;
		int cube;
		
		temp=number%10;
		cube=temp*temp*temp;
		result=result+cube;
		number=number/10;
		
		
	}
	if(result==originalNumber)
	{
		System.out.println(originalNumber +" Its a armstrong number");;
	}
	else
	{
		System.out.println(originalNumber +" Its not a  armstrong number");;
	}
	
}
}
