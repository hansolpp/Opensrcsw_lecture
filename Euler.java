package homework2;

public class Euler {

	public static void main(String[] args) {
		double num = 0, answer = 0, temp = 1;
		
		while(num < 9999999) {
			answer += 1/Math.pow(temp,2);
			temp++;
			num++;
		}
		
		answer *= 6;
		answer = Math.sqrt(answer);
		System.out.println(answer);
	}

}
