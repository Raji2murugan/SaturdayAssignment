package SaturdayAssignments;

import java.util.Scanner;

public class DiamondPatternWIthAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		char alpha = sc.next().charAt(0);
		int in = 2 * (alpha - 65);
		char temp;
		for (int i = 0; i <= in; i++) {
			temp = (i <= (alpha - 65)) ? (char) ('A' + i) : (char) ('A' + (in - i));

			for (int j = 0; j <= in; j++) {
				if (i + j == in / 2)
					System.out.print(temp);
				else if (j - i == in / 2)
					System.out.print(temp);
				else if (i - j == in / 2)
					System.out.print(temp);
				else if (i + j == 3 * (in / 2))
					System.out.print(temp);
				else
					System.out.print(".");

			}

			System.out.println();
		}

	}

}
