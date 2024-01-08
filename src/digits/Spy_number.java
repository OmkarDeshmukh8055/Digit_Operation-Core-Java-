package digits;

public class Spy_number {
	public static void main(String[] args) {

		int num = 132;

		int multiplication = 1, sum = 0;

		while (num > 0) {

			sum = sum + (num % 10);
			multiplication = multiplication * (num % 10);

			System.out.println(sum + " " + multiplication);

			num = num / 10;
		}

		if (sum == multiplication)
			System.out.println("It's a Spy number");
		else
			System.out.println("It's not a Spy  number");

	}
}
