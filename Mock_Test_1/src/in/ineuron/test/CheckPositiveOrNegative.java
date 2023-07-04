package in.ineuron.test;

import java.util.Scanner;

public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = scanner.nextInt();
		
		if( num > 0 ) {
			
			System.out.println("Given Number is Positive Number");
		}else if( num < 0) {
			
			System.out.println("Given Number is Negative Number");
			
		} else {
			
			System.out.println("Number is Zero");
		}
		
		
		scanner.close();

	}

}
