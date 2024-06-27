package weekendassignments;

public class PalindromeChecker {

	public static void main(String[] args) {
		int input1 = 121; 
		int input2 = 12345;

		// reverse the digits of the input number
		int output1 = 0;
		for (int i = input1; i!= 0; i /= 10) {
			output1 = output1 * 10 + i % 10;
		}

		int output2 = 0;
		for (int i = input2; i!= 0; i /= 10) {
			output2 = output2 * 10 + i % 10;
		}

		// check if the input is a palindrome
		if (input1 == output1) {
			System.out.println(input1 + " is a Palindrome");
		} else {
			System.out.println(input1 + " is not a Palindrome");
		}

		if (input2 == output2) {
			System.out.println(input2 + " is a Palindrome");
		} else {
			System.out.println(input2 + " is not a Palindrome");
		}

}
}
