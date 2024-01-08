package digits;

public class Neon_number {

	public static void main(String[] args) {

		int num = 45;

		int square = num * num;

		int sum = 0;

		while (square > 0) {
			sum = sum + (square % 10);
			square = square / 10;
		}

		if (sum == num)
			System.out.println(num + " It's a Neon number");
		else
			System.out.println(num + " It's not a Neon number");
	}
}
