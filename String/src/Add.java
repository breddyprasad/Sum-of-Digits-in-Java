import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		
		
		
//		 int sum = 0;
//		 int n = 123456;
//		 while (n > 9) {
//		     int rem;
//		     rem = n % 10;
//		     sum = sum + rem;
//		     n = n / 10;
//		 }
//		 n = sum;
//		 System.out.println(sum);

			
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the value ");
		int num=sc.nextInt();
		int sum = 0;
		int input =num; 
		while (input != 0) {
			int lastdigit = input % 10; 
			sum += lastdigit;
			input /= 10; 
			} 
		System.out.printf("Sum of digits of number ="  +sum); 

		sc.close();
	}

}
