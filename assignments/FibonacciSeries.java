package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0; 
		int num2=1;
		int num3;
		for (int i=0;i<8;i++)
		{
			System.out.print(num1 + ",");
			num3=num1+num2;
			num1=num2;
			num2=num3;
				
			
		}
		 

	}

}
