package HW09_B11209017;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class HW09_B11209017_01 {
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println("The distinct numbers are: ");
		set.stream().sorted().forEach(x-> System.out.print(x + " "));
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ten integers: ");
		for(int i=0;i<=9; i++)
		{
			int input = sc.nextInt();
			list.add(input);
		}
		removeDuplicate(list);

	}

}
