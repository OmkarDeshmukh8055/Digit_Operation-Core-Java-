package digits;

public class Automorphic_number {

	public static void main(String[] args) {

		int num = 76;
		int temp = num, cnt = 0;
		int compareWith = 0;

		while (temp > 0) {
			compareWith = compareWith * 10 + temp % 10;
			temp = temp / 10;
			cnt++;
		}
		System.out.println(compareWith);
		int square = num * num;
		int sum = 0;

		while (cnt > 0) {

			int mod = square % 10;
			sum = (sum * 10) + mod;
			square = square / 10;
			cnt--;

		}

		if (compareWith == sum)
			System.out.println(num + " It's a Automorphic number");
		else
			System.out.println(num + " It's not a Automorphic number");

	}
}
