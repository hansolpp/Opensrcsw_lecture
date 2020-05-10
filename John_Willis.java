package homework2;

public class John_Willis {

	public static void main(String[] args) {
		double num = 0, answer = 1, numerator = 1, denominator = 2;
		double numerator_counter = 1, denominator_counter = 0;
		
		while(num < 9999999) {
			answer *= numerator / denominator;
			
			numerator_counter++;
			denominator_counter++;
			
			// 분모
			if(numerator_counter == 2) {
				numerator_counter = 0;
				numerator += 2;
			}
			// 분자
			if(denominator_counter == 2) {
				denominator_counter = 0;
				denominator += 2;
			}
			num++;
		}
		
		answer = 2 * (1 / answer);
		System.out.println(answer);
	}
}
