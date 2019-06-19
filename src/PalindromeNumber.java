
public class PalindromeNumber {

	public static boolean isPalindromeNumber(int n) {
		int r, rev = 0, temp;
		temp = n;
		if (n < 0) {
			System.out.println(n + " is not a palindrome because it is a negative number");
			return false;
		}
		while (temp > 0) {
			r = temp % 10;
			rev = (rev * 10) + r;
			temp = temp / 10;
		}
		if (n == rev)
			return true;
		else
			return false;
	}

	public static void getpalindromeNumber(int num) {
		if (num < 0) {
			System.out.println(" Can not get palindrome for " + num + " because it is a negative number.");
		}
		for (int i = 0; i <= num; i++) {
			if (isPalindromeNumber(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// System.out.println("-232 is a palindrome :" + isPalindromeNumber(-232));
		// System.out.println("0 is a palindrome :" + isPalindromeNumber(0));
		getpalindromeNumber(-50);
	}

}
