package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] testString = new String[10];
		testString[0] = "I";
		testString[1] = "am";
		testString[2] = "the";
		testString[3] = "very";
		testString[4] = "model";
		testString[5] = "of";
		testString[6] = "a";
		testString[7] = "modern";
		testString[8] = "major";
		testString[9] = "general";
		printAll(testString);
		System.out.println("");
		printAllReverse(testString);
		System.out.println("");
		printEveryOther(testString);
		System.out.println("");
		printRandom(testString);
	}
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printAll(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printAllReverse(String[] words) {
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printEveryOther(String[] words) {
		int even = words.length;
		if (even % 2 == 1) {
			even = even - 1;
		}
		for (int i = 0; i < even; i = i + 2) {
			System.out.println(words[i]);
		}
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printRandom (String[] words) {
		int[] tracker = new int[words.length];
		for (int i = 0; i < tracker.length; i++) {
			tracker[i] = i;
		}
		Random random = new Random();
		int runnable = words.length;
		int place;
		while (runnable > 0) {
			place = random.nextInt(words.length);
			if(tracker[place] != -1) {
				System.out.println(words[place]);
				tracker[place] = -1;
				runnable = runnable - 1;
			}
			
		}
	}
}
