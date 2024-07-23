package SaturdayAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class proteins {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Protein");
		String s = sc.nextLine();

		// String s="AUGUUUUCU";

		List<String> arr = new ArrayList<>();

		for (int i = 0; i < s.length(); i = i + 3) {
			String temp = s.substring(i, i + 3);
			if (temp.equals("AUG"))
				arr.add("Methionine");
			
			else if (temp.equals("UGG"))
				arr.add("Tryptophan");

			else if (temp.equals("UUU") || temp.equals("UUC"))
				arr.add("Phenylalanine");

			else if (temp.equals("UUA") || temp.equals("UUG"))
				arr.add("Leucine");

			else if (temp.equals("UAU") || temp.equals("UAC"))
				arr.add("Tyrosine");

			else if (temp.equals("UGU") || temp.equals("UGC"))
				arr.add("Cysteine");

			else if (temp.equals("UCU") || temp.equals("UCC") || temp.equals("UCA") || temp.equals("UCG"))
				arr.add("Serine");

			else if (temp.equals("UAA") || temp.equals("UAG") || temp.equals("UGA"))
				break;
			else
				throw new IllegalArgumentException("Invalid");

		}

		System.out.println(arr.toString());

	}

}
