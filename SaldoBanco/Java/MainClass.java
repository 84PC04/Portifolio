public class MainClass {

	public static void main(String[] args) {

		double balance = -9.00;
		boolean checkBalance = true;
		boolean isActive = true;

		System.out
				.println("Welcome to 'The Coded Bank' - A new concept of Bank!!\nFeel free to use the ATM to check your balance.\n");
		//System.out.println("Would you like to check your balance? (s/n): ");
		if (checkBalance == true) {
			if (isActive == true) {
				if (balance == 0) {
					System.out.println("Your account is empty.");	
				}
				if (balance > 0) {
					System.out.println("Your balance is $" + balance + ".");
				}
				if (balance < 0) {
					System.out.println("Your balance is negative. Please contact bank.");
				}
			} else {
				System.out.println("Your account is no longer active.");
			}
		} else {
			System.out.println("Thank you. Have a nice day!");
		}

	}
}
