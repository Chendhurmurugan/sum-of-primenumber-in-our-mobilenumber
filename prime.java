import java.util.Scanner;

public class prime
{

	public static void main(String[] args) 
	{
		int result=0; int count=0;
		Scanner Scan= new Scanner(System.in);
		
		int arr[]=new int[10];
		System.out.print("Type Your Mobile number");
		for(int i=0;i<10;i++)
		{
			arr[i]=Scan.nextInt();
			System.out.print("");
		}
		for(int k:arr)
		{
			System.out.print(k);
		}
		System.out.println();
		for(int j=0;j<10;j++)
		{
	
			if(arr[j]%2==0 && arr[j]!=2){
				
			}
			else{
					result +=arr[j];
					count++;
			}
		}
		System.out.println("Sum Of Prime Number in our Mobile Number is :"+result);
		System.out.println("Total prime number counts in our Mobile Number digits is :"+count);
	}
}
		
		



