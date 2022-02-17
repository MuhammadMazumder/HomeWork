package hw7Q2Use_Of_Nested_If;

import java.util.Scanner;

public class DiabeticCondition {

	public static void main(String[] args) {
		System.out.println("<---------Please enter your Hemoglobin A1C below---------->");
		Scanner scanner = new Scanner(System.in);
		double hbga1c = scanner.nextDouble();
		if (hbga1c >= 6.4) {
			System.out.println(" I m a diabetic patient");
		} else {
			if (hbga1c >= 5.7) {
				System.out.println(" I m pre diabetic patient");
			} else if (hbga1c < 5.7) {
				System.out.println(" I m a healthy person");
				scanner.close();
			}
		}

	}

}
