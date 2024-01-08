package digits;

import java.util.Arrays;

public class Smallest_even_num_array {

	public static void main(String[] args) {

		int[] a = { 1, 9, 8, 2, 3, 6, 5, 0 };

		// 1st logic
		// int smallestEvenNum=Integer.MAX_VALUE;
		//
		// for (int i = 0; i < a.length; i++) {
		//
		// if(smallestEvenNum>a[i] && a[i]%2==0)
		// smallestEvenNum=a[i];
		// }
		// System.out.println(smallestEvenNum);

		// logic 2nd Java 8 logic
		int smallestEvenNum = Arrays.stream(a).filter((i) -> i % 2 == 0).min().orElse(Integer.MAX_VALUE);

		System.out.println(smallestEvenNum);
	}
}
