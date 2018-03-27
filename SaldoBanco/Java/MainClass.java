
import java.util.Scanner;
import java.text.DecimalFormat;

public class MainClass {

	public static void main(String[] args) {

		double balance = 1000.192;
		boolean checkBalance;
		boolean isActive = true;
		String answer;

 
		DecimalFormat df = new DecimalFormat("0.##");
		String balancef = df.format(balance);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to 'The Coded Bank'\nFeel free to use the ATM to check anything of your account.\n");
		System.out.println("Would you like to check your balance? (y/n)");
				
		while (true) {
			answer = scan.nextLine().trim().toLowerCase();
			if (answer.equals("y")) {
				checkBalance = true;
				break;
			} else if (answer.equals("n")) {
				checkBalance = false;
				break;
			} else {
				System.out.println("Sorry, I didn't catch that. Please answer: 'y' or 'n'.");
			}
		}
		
		if (checkBalance == true) {
			if (isActive == true && balance > 0) {
				System.out.println("Your balance is $" + balancef + ".");
			} else {
				if (!isActive) {
					System.out.println("Your account is no longer active.");
				} else {
					if (balance == 0) {
						System.out.println("Your account is empty.");
					} else {
						System.out.println("Your balance is negative.\n$"+balancef+"\nPlease contact bank.");
					}
				}
			}
		} else {
			System.out.println("Thank you. Have a nice day!");
		}
		scan.close();
	}
}
