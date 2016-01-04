import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original, reverse = "";

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the string..");

		original = in.nextLine();

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("Entered string are palindrome");
		} else {
			System.out.println("Entered string are not palindrome");
		}

	}

}
