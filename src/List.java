import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class List {

	public static void main(String[] args) {
		ArrayList<Object> mainList = new ArrayList<Object>();
		ArrayList<ArrayList<String>> mainListTest = new ArrayList<ArrayList<String>>();

		ArrayList<String> test1 = new ArrayList<String>();

		test1.add("abc");
		test1.add("56757");
		test1.add("ab3553c");
		test1.add("atertbc");
		test1.add("a6786bc");

		ArrayList<String> test2 = new ArrayList<String>();
		test2.add("ff");
		test2.add("sss");
		test2.add("rrrrrrr");
		test2.add("jjjjjjjj");
		test2.add("aaaaaaaaaa");

		ArrayList<Integer> test3 = new ArrayList<Integer>();
		test3.add(64);
		test3.add(567);
		test3.add(45646);
		test3.add(2342);
		test3.add(765752345);

		mainListTest.add(test1);
		mainListTest.add(test2);

		mainList.add(test3);
		mainList.add(5);
		mainList.add(mainListTest);

		System.out.println("Size: " + mainList.size());
		System.out.println(mainList);
		@SuppressWarnings("unchecked")
		ArrayList<ArrayList<String>> testdata = (ArrayList<ArrayList<String>>) mainList.get(2);
		System.out.println("\n\n" + testdata.get(0));

		System.out.println(mainList.get(2));

	}

}
