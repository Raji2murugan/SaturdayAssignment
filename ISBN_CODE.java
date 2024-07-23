package SaturdayAssignments;

import java.util.Scanner;

public class ISBN_CODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ISBN Number");
		String stringToVerify = sc.nextLine();

		System.out.println(isValid(stringToVerify));

	}

	static boolean isValid(String stringToVerify) {
		stringToVerify = stringToVerify.replace("-", "");

		if (stringToVerify.length() != 10) {
			return false;
		}

		int sum = 0;

		for (int i = 0; i < 9; i++) {
			char ch = stringToVerify.charAt(i);
			if (!Character.isDigit(ch)) {
				return false;
			}
			sum += (Character.getNumericValue(ch) * (10 - i));
		}

		char checkDigit = stringToVerify.charAt(9);
		if (checkDigit == 'X') {
			sum += 10;
		} else if (Character.isDigit(checkDigit)) {
			sum += Character.getNumericValue(checkDigit);
		} else {
			return false;
		}

		return (sum % 11 == 0);
	}

	
}
//	static boolean isValid(String stringToVerify) {
//		int count = 0;
//		int sum = 0;
//		int Total = 0;
//		char checkDigit = stringToVerify.charAt(stringToVerify.length() - 1);
//
//		if ((checkDigit != 'X') && (!Character.isDigit(checkDigit))) {
//			return false;
//		}
//
//		for (int i = 0; i < stringToVerify.length() - 1; i++) {
//			char ch = stringToVerify.charAt(i);
//			if (Character.isDigit(ch)) {
//				sum += Character.getNumericValue(ch);
//				Total += sum;
//				count++;
//			} else if (ch != '-') {
//				return false;
//			}
//		}
//
//		if (count == 9) {
//			Total += (sum + (checkDigit == 'X' ? 10 : Character.getNumericValue(checkDigit)));
//		} else {
//			return false;
//		}
//
	
//	int k = 10, sum = 0;
//	for (int i = 0; i < stringToVerify.length(); i++) {
//		if (Character.isLetter(stringToVerify.charAt(i))) {
//			sum += Integer.parseInt(stringToVerify.charAt(i) + "") * k--;
//		}
//	}
//	System.out.println(sum % 11);

//		return (Total % 11 == 0);
//	}
//

