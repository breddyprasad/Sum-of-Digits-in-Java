import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter the value ");
	int add=sc.nextInt();
	int a=0;
	int b=add;
	while(b !=0){
		int sum = b%10;
		a += sum;
		b /= 10;
		
		
	}
	System.out.println("value of ="+a);
	
	
	
}
}
