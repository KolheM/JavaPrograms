
public class Pattern {

	/**
	 * 5432* 543*1 54*21 5*321 *4321
	 */

	public static void testPattern_1(int line) {

		for (int i = 1; i <= line; i++) {
			for (int j = line; j >= 1; j--) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_1*****************");
	}

	public static void testPattern_2(int len) {
		int i, j;
		for (i = 1; i <= len; i++) {
			for (j = 1; j <= len; j++) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print("0");
			}
			j--;
			System.out.print("*");
			while (j >= 1) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print("0");
				j--;
			}
			System.out.println("");
		}
		System.out.println("\n****************testPattern_2*****************");
	}

	public static void testPattern_3(int line) {

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_3*****************");
	}

	public static void testPattern_4(int lines) {
		int i, j;
		for (i = 0; i < lines; i++) {

			for (j = 1; j <= lines; j++) {
				if (j <= (lines - i))
					System.out.print(j);
				else
					System.out.print("*");
			}
			j--;
			while (j > 0) {
				if (j > lines - i)
					System.out.print("*");
				else
					System.out.print(j);
				j--;
			}
			System.out.println("");
		}
		System.out.println("\n****************testPattern_4*****************");
	}

	public static void testPattern_5(int lines) {
		int i, j;
		int count;
		for (i = 1; i <= lines; i++) {// this loop is used to print lines
			count = 0;
			for (j = 1; j < lines; j++) {// this loop is used to print numbers in a line
				if (count < i - 1) {
					if (!(j < lines - i + 1)) {
						System.out.print(j);
						count++;
					}
				}
			}
			System.out.print("0");
			count = 0;
			for (--j; j >= 1; j--) {// this loop is used to print j and increment count
				if (count < i - 1) {
					System.out.print(j);
					count++;
				}
			}
			System.out.println("");
		}
		System.out.println("\n****************testPattern_5*****************");
	}

	public static void testPattern_6(int line) {

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_6*****************");
	}

	public static void testPattern_7(int line) {
		for (int i = 0; i <= line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("" + (char) (65 + i));
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_7*****************");
	}

	public static void testPattern_8(int line) {
		int alphabate = Character.hashCode('A');
		for (int i = 0; i <= line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("" + (char) (alphabate));
				alphabate++;
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_8*****************");
	}

	public static void testPattern_9(int line) {

		for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				if (i == 1 || i == line || j == 1 || j == line)
					System.out.print(" 1");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_9*****************");
	}

	public static void testPattern_10(int line) {

		for (int i = line; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_10*****************");
	}

	public static void testPattern_11(int size) {

		for (int i = size; i != 0; i--) {
			for (int j = 0; j < size - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_11*****************");
	}

	public static void testPattern_12(int size) {
		int n = 1;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_12*****************");
	}

	public static void testPattern_13(int size) {

		for (int i = 1; i < size; i++) {
			for (int j = size-i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n****************testPattern_13*****************");
	}

	public static void main(String[] args) {
		// testPattern_1(5);
		// testPattern_2(5);
		// testPattern_3(10);
		// testPattern_4(4);
		// testPattern_5(10);
		// testPattern_6(7);
		// testPattern_7(5);
		// testPattern_8(5);
		// testPattern_9(10);
		// testPattern_11(5);
		// testPattern_12(5);
		testPattern_13(5);
	}
}
