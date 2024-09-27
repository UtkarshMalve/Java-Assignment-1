/*Assignment 3: Door Access Control
Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
•    Use logical operators &&, ||, and !.*/

package ASSIGNMENT1;

class Door {
	private boolean hasValidID;
	private boolean hasAccessCard;
	private boolean isAdmin;

	public Door(boolean hasValidID, boolean hasAccessCard, boolean isAdmin) {
		this.hasValidID = hasValidID;
		this.hasAccessCard = hasAccessCard;
		this.isAdmin = isAdmin;
	}

	public boolean isAccessGranted() {
		return (hasValidID && hasAccessCard) || isAdmin;
	}
}
