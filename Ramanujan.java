package homework2;

public class Ramanujan {

	public static void main(String[] args) {
		double answer = Math.sqrt((double)8) / (double)(9801);
		double rest = demoninator_sum(10);
		answer = 1 / (answer * rest);
		
		System.out.println(answer);
	}
	
	public static double factorial(int n) {
		
		double answer = 1;
		
		if(n == 0) return 1;
		
		for(int i = 1; i <= n; i++) {
			answer *= i;
		}
		
		return answer;
	}
	
	public static double demoninator_sum(int n) {
		
		double answer = 0;
		
		for(int i = 0; i <= n; i++) {
			double temp = 1;
			temp *= factorial(4 * i) * (double)(1103 + (26390 * i));
			temp /= (double)Math.pow(factorial(i), 4) * (double)Math.pow(396, 4 * i);
			answer += temp;			
		}
		
		return answer;
	}

}
