/*Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !.*/

package ASSIGNMENT1;

import java.util.Scanner;

public class Weather {

	private int temp;
	private String rain;

	public void accept() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Temprature : ");
		temp = sc.nextInt();

		System.out.print("There is Raining Outside(yes/no) : ");
		rain = sc.next();
	}

	public void display() {
		System.out.println("Temperature     : " + temp);
		System.out.println("Raining Outside : " + rain);
	}

	public void check() {
		if (rain.equalsIgnoreCase("no") && temp >= 20 && temp <= 30) {
			System.out.println("It's Safe to go Outside");
		} else {
			System.out.println("It's Not Safe to go Outside");
		}

	}
}
