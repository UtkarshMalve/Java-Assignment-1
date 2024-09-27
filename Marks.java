/*Assignment 2: Exam Grading System
Write a program that determines whether a student passes an exam based on three subjects. A student passes if the average score is at least 60, and none of the individual scores is below 40.
Requirements:
•    Use logical operators && and || to combine conditions.
*/

package ASSIGNMENT1;

import java.util.Scanner;

public class Marks {
	private int sub1, sub2, sub3;
	private int average;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the subjects marks of sub1,sub2,sub3");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		average = (sub1 + sub2 + sub3) / 3;
	}

	public void checkPass() {

		if (average > 60 && sub1 > 40 && sub2 > 40 && sub3 > 40) {
			System.out.println("Student is passed the exam");
		} else {
			System.out.println("STudent is Fail the exam");
		}
	}

	public void display() {
		System.out.println("Enter the marks of subject 1:- " + sub1);
		System.out.println("Enter the marks of subject 2:- " + sub2);
		System.out.println("Enter the marks of subject 3:- " + sub3);
		System.out.println("Average marks is:- " + average);
	}

}
