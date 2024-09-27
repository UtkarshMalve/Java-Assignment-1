/*Assignment 4: Voting Eligibility
Write a program that checks if a person is eligible to vote. A person can vote if they are a citizen and their age is 18 or above.
Requirements:
•    Use logical && to combine conditions, and ! to negate conditions if necessary.
*/

package ASSIGNMENT1;

import java.util.Scanner;

public class Vote {

	private int age;
	private boolean isCitizen = true;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the age of person");
		age = sc.nextInt();
	}

	public void checkEligible() {
		if (age >= 18 && isCitizen) {
			System.out.println("Person is eligible for voting");
		} else {
			System.out.println("Person is not eligible for voting");
		}
	}

	public void display() {
		System.out.println("age is " + age);
		System.out.println("Citizen");
	}
}
