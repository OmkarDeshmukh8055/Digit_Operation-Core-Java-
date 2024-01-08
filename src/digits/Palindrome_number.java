package digits;

public class Palindrome_number {

	public static void main(String[] args) {

		int num = 123;

		int sum = 0, temp = num, div = 0;

		while (num > 0) {

			div = num % 10;
			sum = (sum * 10) + div;
			num = num / 10;

		}
		if (num == sum)
			System.out.println("It's a palindrome Number");
		else
			System.out.println("It's not a palindrome Number");
	}
}
