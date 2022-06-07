package exceptionhanding1;

public class AgeException18 extends Exception {

	AgeException18(String message) {
		super(message);
	}

	public static void main(String[] args) throws AgeException18 {

		int age = 7;
		try {
			if (age < 18) {
				throw new AgeException18("\n" + "You must be 18+ to sign up");
			} else {
				System.out.println("you are now sign up");
			}

			} catch (Exception e) {
			System.out.println("A problem occured: " + e);

		}
	}

}
