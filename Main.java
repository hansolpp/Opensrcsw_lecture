package homework2;

public class Main {

	public static void main(String[] args) {
		double pi = 1, temp = 3, p = -1, num = 1;
		
		while(num < 9999999) {
			pi +=  p * (1.0/temp);
			temp += 2;
			p *= -1;
			num++;
		}
		// ������������ ���� ����
		pi *= 4;
		System.out.println(pi);
	}

}
