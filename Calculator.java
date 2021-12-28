package week1.day2;

public class Calculator {
	public static void main(String[] args) {
		
		int num1,num2,additionResult,divideResult;
		double num3,num4,subResult,mulResult;
		
		num1=10;
		num2=5;
		num3=10.5;
		num4=6.3;
		
		Calculator cal=new Calculator();
		additionResult= cal.add(num1, num2);
		System.out.println("Addition="+additionResult);
		
		subResult=cal.sub(num3, num4);
		System.out.println("Subtraction="+subResult);
		
		mulResult=cal.mul(num3, num4);
		System.out.println("Multiplication="+mulResult);
		
		divideResult=cal.div(num1, num2);
		System.out.println("Division="+divideResult);
	}
	
	public int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	public double sub(double a,double b)
	{
		double res=a-b;
		return res;
	}
	public double mul(double a,double b)
	{
		double res=a*b;
		return res;
	}
	public int div(int a,int b)
	{
		int result=a/b;
		return result;
	}
}
