package in.ineuron.test;



public class FindAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numbers = {1,2};
		
		float average = 0.0f;
		
		int i =0, sum =0;
		
		do {
		
			if(numbers.length == 0) {
				
				break;
			}
			
			sum = sum + numbers[i];
			
			i++;
			
		}while(i<numbers.length);
		
		average = sum / numbers.length;
		
		System.out.println("Average Of Numbers is :: " + average);
	
	}

}
