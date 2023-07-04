package in.ineuron.test;

import java.util.Scanner;

public class FibbonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Number :: ");
		
		int num = scanner.nextInt();
		
		int x =0,y=1,z=0;
		
		for(int i=0;i<=num;i++) {
			
			System.out.print(z + " ");
			
			x = y;
			
			y = z;
			
			z = x + y;
			
			
		}
		
		scanner.close();
		
		
	}

}
