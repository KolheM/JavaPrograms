import java.util.Arrays;

public class StringPrograms {

	public static void countCharactersOfString() {
		String abc = "The best of both worlds";
		int count = 0;
		// Find Character count of String
		for (int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) != ' ')
				count++;
		}
		System.out.println("Chracter count in String is: " + count);

		// Find Length Of String
		System.out.println("Lenght Of String using length() method is: " + abc.length());
		char[] array = abc.toCharArray();
		System.out.println("Lenght Of String using array is: " + array.length);
	}

	public static void counTotalNumberOfVowelsAndConsonantsOfString() {
		String abc = "This is a really simple sentence";
		int vowels = 0;
		int consonants = 0;
		abc = abc.toLowerCase();
		for (int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) == 'a' || abc.charAt(i) == 'e' || abc.charAt(i) == 'i' || abc.charAt(i) == 'o'
					|| abc.charAt(i) == 'u')
				vowels++;
			else if (abc.charAt(i) >= 'a' && abc.charAt(i) <= 'z')
				consonants++;
		}
		System.out.println("Count Of Vowels In String is: " + vowels);
		System.out.println("Count Of Consonants In String is: " + consonants);
	}

	public static void twoStringsAreAnagram() {

		// Two Strings are called the anagram if they contain the same characters.
		// However, the order or sequence of the characters can be different.
		String str1 = "Paper";
		String str2 = "Repap";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2)) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}

	public static void AllSubsets() {
		String str = "SHINE";
		int len = str.length();
		int temp = 0;
		// Total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String[len * (len + 1) / 2];
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("All subsets for given string are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void removeWhiteSpacesFromString() {
		String test = "This is a really simple sentence", abc = "This is a really simple sentence";
		test = test.replaceAll("\\s+", "");
		System.out.println("String WithOut White Spaces Using Replace Method:" + test);
		StringBuilder string = new StringBuilder();
		for (int i = 0; i < abc.length(); i++) {
			if (abc.charAt(i) != ' ') {
				string.append(abc.charAt(i));
			}

		}
		System.out.println("String WithOut White Spaces: " + string.toString());
	}

	protected static void replaceLowerCaseCharToUpperCase() {
		String abc = "This is a really simple Sentence";
		StringBuffer newStr = new StringBuffer(abc);

		for (int i = 0; i < abc.length(); i++) {
			if (Character.isLowerCase(abc.charAt(i)))
				newStr.setCharAt(i, Character.toUpperCase(abc.charAt(i)));
			else if (Character.isUpperCase(abc.charAt(i)))
				newStr.setCharAt(i, Character.toLowerCase(abc.charAt(i)));
		}
		System.out.println("String after case conversion : " + newStr);
	}

	public static void replaceSpacesWithASpecificCharacter() {
		String abc = "This is a really simple sentence";
		abc = abc.replaceAll("\\s+", "-");
		System.out.println("String after Replace : " + abc);
	}

	public static void checkPalindromeString(String abc) {
		char[] array1 = abc.toCharArray();
		char[] array2 = new char[array1.length];
		int j = 0;
		for (int i = array1.length - 1; i >= 0; i--) {
			array2[j] = array1[i];
			j++;
		}
		if (String.valueOf(array1).equalsIgnoreCase(String.valueOf(array2)))
			System.out.println("Given String " + abc + " is Palindrome.");
		else
			System.out.println("Given String " + abc + "  is not a Palindrome.");

		// Another Logic
		boolean flag = true;
		for (int i = 0; i < abc.length() / 2; i++) {
			if (abc.charAt(i) != abc.charAt(abc.length() - i - 1)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("Given String " + abc + " is Palindrome.");
		else
			System.out.println("Given String " + abc + "  is not a Palindrome.");

	}

	public static void reverseString() {
		String string = "Dream big";
		String reversedStr = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + string.charAt(i);
		}
		System.out.println("Original string: " + string);
		System.out.println("Reverse of given string: " + reversedStr);
	}

	public static void countDuplicateWordsInString() {
		String string = "Big black big bug bit a big black dog on his big black nose a";
		String[] strArray = string.split(" ");
		int visited = -1;
		int count;
		int[] strNewArray = new int[strArray.length];
		for (int i = 0; i < strArray.length; i++) {
			count = 1;
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equalsIgnoreCase(strArray[j])) {
					count++;
					strNewArray[j] = visited;
				}
			}
			if (strNewArray[i] != visited)
				strNewArray[i] = count;
		}
		for (int i = 0; i < strNewArray.length; i++) {
			if (strNewArray[i] != visited)
				System.out.println(strArray[i] + "  " + strNewArray[i]);
		}

	}

	public static void findSmallestAndLargestWordInString() {
		String abc = "Hardships often an prepare extraordinary teertretertertet b";
		String[] strArray = abc.split(" ");
		int maxLength = strArray[0].length(), minLength = strArray[0].length();
		String strSmall="";
		String strLarge = "";
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() > maxLength) {
				strLarge = strArray[i];
				maxLength = strArray[i].length();
			}
				
			if (strArray[i].length() < minLength) {
				strSmall = strArray[i];
				minLength = strArray[i].length();
			}
				

		}

		System.out.println("Smallest String: " + strSmall);
		System.out.println("Largest String: " + strLarge);
	}

	public static void main(String[] args) {

		// countCharactersOfString();
		// counTotalNumberOfVowelsAndConsonantsOfString();
		// twoStringsAreAnagram();
		// AllSubsets();
		// removeWhiteSpacesFromString();
		// replaceLowerCaseCharToUpperCase();
		// replaceSpacesWithASpecificCharacter();
		// checkPalindromeString("kaak");
		// checkPalindromeString("121");
		// reverseString();
		// countDuplicateWordsInString();
		findSmallestAndLargestWordInString();

	}

}
