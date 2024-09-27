
/*Assignment 8: Determine the Greatest Number Using Ternary Operator

Write a Java program to find the greatest number among three numbers using the ternary operator.

*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers.
*/

package ASSIGNMENT1;

import java.util.Scanner;

public class NumbersGreat {

	private int num1;
	private int num2;
	private int num3;

	Scanner sc = new Scanner(System.in);

	public void accepteinfo() {
		System.out.println("enter the num1");
		num1 = sc.nextInt();
		System.out.println("enter the num2");
		num2 = sc.nextInt();
		System.out.println("enter the num3");
		num3 = sc.nextInt();
	}

	public void findlargenumber() {
		if (num1 > num2 && num1 > num3) {
			System.out.println("The first number is greater :-" +  num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The second number is greater:-" + num2);
		} else {
			System.out.println("The Third number is greater:- " +   num3);
		}
	}
}
