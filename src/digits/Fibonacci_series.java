package digits;

public class Fibonacci_series {
	public static void main(String[] args) {

		int num = 11;

		int c = 0, a = 0, b = 1;

		for (int i = 0; i <= num; i++) {

			c = a + b;
			System.out.println(c);
			b = a;
			a = c;

		}
	}
}
