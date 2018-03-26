/*
 * Programming Quiz - Checking Your Balance (3-5)
 */

// change the values of `balance`, `checkBalance`, and `isActive` to test your code
var balance = 325.00;
var checkBalance = true;
var isActive = false;

// your code goes here

		console.log("Welcome to 'The Coded Bank' - A new concept of Bank!\nFeel free to use the ATM to check your balance.\n");
		//System.out.println("Would you like to check your balance? (s/n): ");
		if (checkBalance === true) {
			if (isActive === true) {
				if (balance === 0) {
					console.log("Your account is empty.");	
				}
				if (balance > 0) {
					console.log("Your balance is $"+balance.toFixed(2)+".");
				}
				if (balance < 0) {
					console.log("Your balance is negative. Please contact bank.");
				}
			} else {
				console.log("Your account is no longer active.");
			}
		} else {
			console.log("Thank you. Have a nice day!");
		}
