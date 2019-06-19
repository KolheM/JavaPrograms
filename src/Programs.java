import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Programs {

	// Find given number is Even or Odd
	public static void identifyEvenOddNumber(int num) {
		if (num % 2 == 0)
			System.out.println(num + ": Number is Even.");
		else
			System.out.println(num + ": Number is Odd.");
	}

	// Print Even numbers from Object List
	public static void findAndPrintEvenOddNumberFromList(List<Object> numbers) {

		int tempInt = 0;
		Double tempDouble = 0.0;
		Float tempFloat = 0f;
		List<Object> evenNumbers = new ArrayList<Object>();
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i).getClass().equals(Integer.class)) {
				tempInt = (int) numbers.get(i);
			} else if (numbers.get(i).getClass().equals(Float.class)) {
				tempFloat = (float) numbers.get(i);
				tempInt = tempFloat.intValue();
			} else {
				tempDouble = (double) numbers.get(i);
				tempInt = tempDouble.intValue();
			}
			if (tempInt % 2 == 0)
				evenNumbers.add(numbers.get(i));
		}
		System.out.println("Event number list: " + evenNumbers);
	}

	// Print Prime numbers for given range
	public static void printPrimeNumbers(int range) {
		int num;
		for (int i = 2; i < range; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0)
					count++;
			}
			if (count == 2)
				System.out.println("Prime number between 2 to " + range + " is: " + i);
		}
	}

	// Find given number is Prime number.
	public static void identifyPrimeNumber(int number) {
		int temp, count = 0;
		for (temp = number; temp >= 1; temp--) {
			if (number != 0 && number % temp == 0)
				count++;
		}
		if (count == 2)
			System.out.println(number + " is a Prime number.");
		else
			System.out.println(number + " is not a Prime number.");
	}

	// Print Fibonacci numbers of given range.
	public static void printFibonacciNumbers(int range) {
		int firstNo = 0, secondNo = 1, sum = 0;
		System.out.println("Fibonacci number range is: " + range);
		for (int i = 1; i <= range; ++i) {
			sum = firstNo + secondNo;
			System.out.print(" " + firstNo);
			firstNo = secondNo;
			secondNo = sum;
		}
		System.out.println("\nNext Fibonacci number is: " + firstNo);
	}

	// Find Factorial of given number.
	public static void findFactorial(int num) {
		long fact = 1;
		for (int i = 1; i <= num; i++)
			fact *= i;
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	// Find Factorial of given number using recursion.
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	// Find given number is Palindrome or not.
	public static void palindromeNumber(int n) {
		int r, rev = 0, temp;
		temp = n;
		while (temp > 0) {
			r = temp % 10;
			rev = (rev * 10) + r;
			temp = temp / 10;
		}
		if (n == rev)
			System.out.println("" + rev + " is palindrome number ");
		else
			System.out.println("" + rev + " is not palindrome");

	}

	// Print Palindrome numbers from array.
	public static void palindromeNumber(int[] n) {
		int r, temp, sum;
		List<Integer> palindromeNumber = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			temp = n[i];
			sum = 0;
			while (n[i] > 0) {
				r = n[i] % 10;
				sum = (sum * 10) + r;
				n[i] = n[i] / 10;
			}
			if (temp == sum)
				palindromeNumber.add(temp);
		}
		System.out.println("palindrome: " + palindromeNumber);
	}

	public static void main(String[] args) {
		// 1. Find given number is Even or Odd
		System.out.println("Program: Find given number is Even or Odd");
		// identifyEvenOddNumber(new Random().nextInt());

		System.out.println("\nProgram: Print Even numbers from Object List");
		// 2. Print Even numbers from Object List
		List<Object> numbers = Arrays.asList(7f, 5456460, 1567572.2, 33.33, 97.46, 98.467567, 6, 4.5f, 5.6f);
		// findAndPrintEvenOddNumberFromList(numbers);

		System.out.println("\nProgram: Print Prime numbers for given range");
		// 3. Print Prime numbers for given range
		// printPrimeNumbers(new Random().nextInt(1000));

		System.out.println("\nProgram: Find given number is a Prime number or not.");
		// 4. Find given number is Prime number.
		// identifyPrimeNumber(new Random().nextInt(1000));

		System.out.println("\nProgram: Print Fibonacci numbers of given range.");
		// 5. Print Fibonacci numbers of given range.
		printFibonacciNumbers(15);

		// 6. Find Factorial of given number.
		System.out.println("\nProgram: Find Factorial of given number.");
		//findFactorial(5);

		// 7. Find Factorial of given number using recursion.
		System.out.println("\nProgram: Find Factorial of given number using recursion.");
		int number = 4;
		//int fact = factorial(number);
		//System.out.println("Factorial of " + number + " is: " + fact);

		// 8. Find given number is Palindrome or not.
		System.out.println("\nProgram: Find given number is Palindrome or not.");
		//palindromeNumber(454);

		// 9. Print Palindrome numbers from array.
		System.out.println("\nProgram: Print  Palindrome numbers from array.");
		int[] num = { 333, 454, 989, 12, 11, 50, 99 };
		//palindromeNumber(num);
	}
}
