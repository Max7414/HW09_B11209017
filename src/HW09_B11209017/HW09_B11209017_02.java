package HW09_B11209017;

import java.util.Arrays;
import java.util.Scanner;

public class HW09_B11209017_02 {
	public static void sort(int list[]) {
		Arrays.sort(list);
		for (int i=0;i<list.length;i++)
			System.out.print(list[i] + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list[] = new int[5];
		for (int i=0;i<list.length;i++)
			list[i] = sc.nextInt();
		sort(list);

	}

}
