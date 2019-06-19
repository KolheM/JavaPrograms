import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPrograms {

	public static void searchElement(int num) {
		int[] abc = { 10, 8, 5, 50, 82, 10, 5 };
		// First Option
		Arrays.sort(abc);
		int value = Arrays.binarySearch(abc, num);
		if (value >= 0 && abc[value] == num)
			System.out.println(abc[value] + " Element found at " + value + " index.");
		else
			System.out.println(num + " Element not found in the array.");

		// Second Option
		List<Integer> test = Arrays.stream(abc).boxed().collect(Collectors.toList());
		if (test.contains(num))
			System.out.println(num + " Element found in the array.");
		else
			System.out.println(num + " Element not found in the array.");

		// Third Option Using Linear Search
	}

	// Count occurence of elements
	public static void countEachElement() {
		int[] abc = { 10, 8, 5, 10, 82, 10, 5 };
		int[] newArray = new int[abc.length];
		int counter;
		int visited = -1;
		for (int i = 0; i < abc.length; i++) {
			counter = 1;
			for (int j = i + 1; j < abc.length; j++) {
				if (abc[i] == abc[j]) {
					counter++;
					newArray[j] = visited;
				}
			}
			if (newArray[i] != visited)
				newArray[i] = counter;
		}
		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] != visited)
				System.out.println("    " + abc[i] + "    |    " + newArray[i]);
		}
	}

	public static void printDuplicateElements() {
		int[] abc = { 10, 8, 5, 50, 82, 10, 5 };
		for (int i = 0; i < abc.length; i++) {
			for (int j = i + 1; j < abc.length; j++) {
				if (abc[i] == abc[j])
					System.out.println("Element is: " + abc[j]);
			}
		}
	}

	public static void printElementsInReverseOrder() {
		int[] abc = { 10, 8, 5, 50, 82, 10, 5 };
		System.out.println("Original Order:");
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
		}
		System.out.println("\nReverse Order:");
		for (int i = abc.length - 1; i >= 0; i--) {
			System.out.print(abc[i] + " ");
		}
	}

	public static void printElementsPresentAtEventPosition() {
		int[] abc = { 10, 8, 5, 50, 82, 10, 5, 7, 9 };

		System.out.println("Even Position Elements:");
		for (int i = 1; i < abc.length; i++) {
			if (i % 2 != 0)
				System.out.print(abc[i] + " ");
		}
		// For Even Position Elements we can also do by initializing i value by 1 & i =
		// i+2

		System.out.println("\nOdd Position Elements:");
		for (int i = 0; i < abc.length; i++) {
			if (i % 2 == 0)
				System.out.print(abc[i] + " ");
		}
		// For Odd Position Elements we can also do by initializing i value by 0 & i =
		// i+2
	}

	public static void findLagestAndSamllestElementInArray() {
		int[] abc = { 10, 8, 5, 50, 82, 3, 5, 7, 9 };
		int max = abc[0], min = abc[0];

		System.out.println("Array Elements Are:");
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
		}

		for (int i = 0; i < abc.length; i++) {
			if (abc[i] > max) {
				max = abc[i];
			}

			if (abc[i] < min) {
				min = abc[i];
			}
		}
		System.out.print("\nLargest Number From Array is: " + max);
		System.out.print("\nSmallest Number From Array is: " + min);
	}

	public static void calculateSumOfArray() {
		int[] abc = { 10, 8, 5, 50, 82, 3, 5, 7, 9 };
		int sum = 0;
		System.out.println("Array Elements Are:");
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
		}

		for (int i = 0; i < abc.length; i++) {
			sum = sum + abc[i];
		}
		System.out.print("\nSum Of Array is: " + sum);
	}

	public static void sortingOfArray() {
		int[] abc = { 10, 8, 0, 3, 5, 1 };
		int temp;
		for (int i = 0; i < abc.length; i++) {
			for (int j = i + 1; j < abc.length; j++) {
				if (abc[i] > abc[j]) {
					temp = abc[i];
					abc[i] = abc[j];
					abc[j] = temp;
				}
			}
		}
		for (int i = 0; i < abc.length; i++) {
			System.out.print(abc[i] + " ");
		}
	}

	public static void addTwoMatrices() {
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };
		int c[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void multiplyTwoMatrices() {
		int a[][] = { { 5, 5, 5 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int c[][] = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sumOfEachRowAndColumnOfMatrices() {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a.length; j++) {
				sum = sum + a[i][j];
			}
			System.out.println("Sum Of " + i + " row is: " + sum);
		}
		int j;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (j = 0; j < a.length; j++) {
				sum = sum + a[j][i];
			}
			System.out.println("Sum Of " + j + " column is: " + sum);
		}
	}

	public static void main(String[] args) {
		// searchElement(5);
		 countEachElement();
		// printDuplicateElements();
		// printElementsInReverseOrder();
		// printElementsPresentAtEventPosition();
		// findLagestAndSamllestElementInArray();
		// calculateSumOfArray();
		// sortingOfArray();
		// addTwoMatrices();
		// multiplyTwoMatrices();
		//sumOfEachRowAndColumnOfMatrices();
	}

}
