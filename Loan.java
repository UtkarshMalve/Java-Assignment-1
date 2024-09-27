/*Assignment 1: Validating Age and Income  
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
•    Use logical && to combine these conditions.
*/

package ASSIGNMENT1;

import java.util.Scanner;

public class Loan{

	private int age, net_income;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the age of person and net income of person");
		age = sc.nextInt();
		net_income = sc.nextInt();
	}

	public void checkEligibility() {
		if (age >= 18 && age <= 60) {
			System.out.println("age is eligible for loan");
		}
		if (net_income < 25000) {
			System.out.println("Net income is eligible for loan");
		} else {
			System.out.println("Person is not eligible for loan");
		}

	}

	public void diplay() {
		System.out.println("Age is" + age);
		System.out.println("income is" + net_income);
	}

}
