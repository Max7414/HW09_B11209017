package HW09_B11209017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HW09_B11209017_01 {
	public static void removeDuplicate(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();// Create a HashSet to store unique elements
		set.addAll(list);// Add all elements of the ArrayList to the HashSet
		System.out.println("The distinct numbers are: ");

		set.stream().sorted().forEach(x -> System.out.print(x + " ")); // Print distinct numbers
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten integers: ");
		for (int i = 0; i <= 9; i++) // Read ten integers from the user and add them to the ArrayList
		{
			int input = sc.nextInt();
			list.add(input);
		}
		removeDuplicate(list);// Call method

	}

}
