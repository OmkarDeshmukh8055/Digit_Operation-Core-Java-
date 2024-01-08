package digits;

public class Armstrong_number {
	public static void main(String[] args) {

		int num = 912985152;
		int temp = num;
		int isArmStrong = 0;

		int totalDigit = 0;
		int num_digit_cnt = num;

		while (num_digit_cnt > 0) {
			int sum = num_digit_cnt % 10;
			totalDigit++;
			num_digit_cnt = num_digit_cnt / 10;
		}

		while (num > 0) {
			int sum = num % 10;

			int multi = 1;
			for (int i = 0; i < totalDigit; i++) {
				multi = multi * sum;

			}

			isArmStrong = isArmStrong + multi;
			num = num / 10;
		}

		if (isArmStrong == temp)
			System.out.println(isArmStrong + " is aramstrong number");
		else
			System.out.println(isArmStrong + " is not aramstrong number");
	}
}
