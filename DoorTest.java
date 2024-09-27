package ASSIGNMENT1;

import java.util.Scanner;

public class DoorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your ID status (true for valid, false for invalid): ");
		boolean hasValidID = scanner.nextBoolean();

		System.out.print("Enter your access card status (true for valid, false for invalid): ");
		boolean hasAccessCard = scanner.nextBoolean();

		System.out.print("Are you an admin? (true for yes, false for no): ");
		boolean isAdmin = scanner.nextBoolean();

		Door door = new Door(hasValidID, hasAccessCard, isAdmin);

		if (door.isAccessGranted()) {
			System.out.println("Access granted.");
		} else {
			System.out.println("Access denied.");
		}

		scanner.close();
	}
}
