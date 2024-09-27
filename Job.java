/*Assignment 5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications. A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
•    Use logical operators to combine conditions.*/

package ASSIGNMENT1;

import java.util.Scanner;

public class Job {
	private String bachelorDegree;
	private String criminalCase;

	public void accpet() {
		Scanner sc = new Scanner(System.in);

		System.out.print("You Have Bachlore's Degree(Yes/No) : ");
		bachelorDegree = sc.next();

		System.out.print("Criminal Case on You : ");
		criminalCase = sc.next();
	}

	public void display() {
		System.out.println("Bachelor's Degree    : " + bachelorDegree);
		System.out.println("Criminal Case on You : " + criminalCase);
	}

	public void check() {
		if (bachelorDegree.equalsIgnoreCase("yes") && criminalCase.equalsIgnoreCase("no")) {
			System.out.println("You Are Eligible for Job");
		} else {
			System.out.println("You Are Not Eligible for Job");
		}

	}

}
