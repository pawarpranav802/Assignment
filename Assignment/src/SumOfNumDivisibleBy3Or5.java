import java.util.Scanner;
public class SumOfNumDivisibleBy3Or5 {

	static int calculateSum(int num) {
		 int sum = 0;
		 if(num % 5==0 || num%3==0) {
			 sum +=num;
		 }
		 return sum;
		 
		 
	 }
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number");
		 int num = sc.nextInt();
		 System.out.println("Sum is : "+calculateSum(num));;
	}

}

