package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,7,9,3,7};
		int count;
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);	
			}
			
		}
	}

}
