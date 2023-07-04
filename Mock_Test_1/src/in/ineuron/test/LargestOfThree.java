package in.ineuron.test;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The 1st Number :: ");
		
		int num1 = scanner.nextInt();
		
		System.out.println("Enter The 2nd Number :: ");
		
		int num2 = scanner.nextInt();
		
		
		System.out.println("Enter The 3rd Number :: ");
		
		int num3 = scanner.nextInt();
		
		
		if(num1 >num2 && num1 >num3) {
			
			System.out.println("Number 1 is Greatest");
		}else if( num2 > num3) {
			
			System.out.println("Number 2 is Greatest");
		}else {
			
			System.out.println("Number 3 is Greatest");
		}
		
		
		scanner.close();

	}

}
