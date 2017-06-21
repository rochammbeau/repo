package game.actors;

public class Human {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Human(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
