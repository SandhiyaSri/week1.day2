package week1.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		int n=123;
		int temp;
		int sum=0;
		int rem;
		
		temp=n;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrome Number.");
		}
		else
		{
			System.out.println(temp+" is not a palindrome Number.");
		}
	}

}
