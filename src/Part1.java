import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a variable named age and assign it a value of 14. 
			int age = 14;
		
		// Print the boolean expression age >= 16 to the console and note the results.
			System.out.println(age >= 16); 
				// returns false.
			
		// Change the value of age to 18 and run again. (Age is now 18)
			System.out.println(age >= 16); 
				// returns true.
			
			
		// using a conditional, print "You can drive" if age is greater or equal to 16 and "You cannot drive otherwise.
			if (age >= 16) {
				System.out.println("You can drive.");
			} else {
				System.out.println("You cannot drive.");
			}
			
		// change the value of age and rerun to see the result. 
			// At 14, returns "you cannot drive." but at 18, returns "You can drive."
		
		// Add a new variable called hasLicense before the conditional.
		// change the boolean expression in the conditional to additionally include the need for hasLicense to be true. 
		// try changing the values of age and hasLicense and note the different results. 
		
			age = 16;
			boolean hasLicense = true;
			
			if ((age >= 16) && (hasLicense == true)) {
				System.out.println("You can drive."); // Only executes when both arguments of the if line are true. 
			} else {
				System.out.println("You cannot drive."); // Executes in all other cases. 
			}
				//hasLicense can exist on its own as it contains the value of true or false when it was created.
				
			
		// create two new variables - costOfMilk and thirstLevel. 
		// create a new conditional the prints "Milk Please" if costOfMilk is less than 2.5, or if thristLevel is greater than 6 and prints "No Thanks" otherwise. 
		// change the values and note the different results. 
			
			double costOfMilk = 2.6;
			int thirstLevel = 5;
			
			if (costOfMilk <= 2.5 || thirstLevel > 6) {
				System.out.println("Milk please."); // Executes if either condition is true. 
			}else {
				System.out.println("No thanks."); // Executes when both conditions are false.
			}
			
			
		// create two variables called numberOfCookies and numberOfChildren.
		// you will evenly distribute all of the cookies to the children and as the adult, you get to keep all remaining cookies. 
		// use a conditional to print the following based on the following conditions:
		// if there are 0 cookies remaining, print "Sad Face".
		// if there are less than 2 cookies, print "Yes!".
		// if there are less than 5 cookies, print "Woohooo!".
		// if there are 5 or more cookies, print "Jackpot"!
			
			int numberOfCookies = 13;
			int numberOfChildren = 7;
			
			if (numberOfCookies % numberOfChildren <= 0) {
				System.out.println("Sad Face");
			}else if (numberOfCookies % numberOfChildren < 2) {
				System.out.println("Yes!");
			}else if (numberOfCookies % numberOfChildren < 5) {
				System.out.println("Woohoo!");
			}else if (numberOfCookies % numberOfChildren >= 5) {
				System.out.println("Jackpot");
			}
			
			switch (numberOfCookies % numberOfChildren) {
				
				case 0:
					System.out.println("Sad Face");
					break;
				case 1:
					System.out.println("Yes!");
					break;
				case 2:
					System.out.println("Woohoo!");
					break;
				case 3:
					System.out.println("Woohoo!");
					break;
				case 4:
					System.out.println("Woohoo!");
					break;
				case 5:
					System.out.println("Woohoo!");
					break;
				default:
					System.out.println("Jackpot");
				
			}
			
		// create a variable called loyaltyMemberStatus and assign the value "Silver"
		// create a variable called loyaltyMemberDiscount and assign the value 0.0
		// using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale:
		// "Silver" is .10, "Gold" is .15, and "Platinum" is .25
			String loyaltyMemberStatus = "Gold";
			Double loyaltyMemberDiscount = 0.0;
			
			switch(loyaltyMemberStatus) {
				case "Silver":
					loyaltyMemberDiscount = .10;
						break;
				case "Gold":
					loyaltyMemberDiscount = .15;
						break;
				case "Platinum":
					loyaltyMemberDiscount = .25;
						break;
				}
			
			// create a variable called billTotal and assign a value. 
			// create a variable called adjustedBillTotal and assign it the billTotal minus the loyaltyMmeberDiscount percentage of the bollTotal
			// if the adjustedBillTotal is greater than $500, upgrade the loyaltyMemberStatus from Silver to Gold, or Gold to Platinum. 
			
			double billTotal = 500;
			double adjustedBillTotal = billTotal - billTotal * loyaltyMemberDiscount;
			
			if (adjustedBillTotal >= 500 && loyaltyMemberStatus == "Silver") {
				loyaltyMemberStatus = "Gold";
			} else if (adjustedBillTotal >= 500 && loyaltyMemberStatus == "Gold") {
				loyaltyMemberStatus = "Platinum";
			}
			
			System.out.println("Your total is: " + adjustedBillTotal);
			System.out.println("Your membership status is: " + loyaltyMemberStatus);
		
		// create two variables: username and password. 
		// create a conditional that prints "login successful if the username is "Tommy123" and the password is "12345"
		// print "access denied" otherwise
			
			String username;
			String password; 
			
			Scanner login = new Scanner(System.in);
			
			System.out.println("Please enter your username:");
				 username = login.nextLine();
					System.out.println(username);
			System.out.println("Please enter your password:");
				 password = login.nextLine();
					System.out.println(password);
				
			if (username.equals("Tommy123") && password.equals("123456")) {
				System.out.println("Login Successful");
			}else {
				System.out.println("Access Denied");
			}
			
		// write a for loop that prints each number 0-9
			
			int x = 0;
			while (x < 10) {
				System.out.println(x);
				x++;
			}
			
		// write a loop that prints each number from 10 to 0 backwards
			int y = 10;
			while (y>=0) {
				System.out.println(y);
				y--;
			}
		// write a for loop that prints every other number from 0 to 100
			
			
			for (int v = 0; v <= 100; v += 2 ) {
				System.out.println(v);
			}
			
		// write a for loop that iterates from 0 to 100 and prints "Even" if the number is even and "Odd" if it's odd
			int z = 0;
			while (z <= 100) {
				if (z % 2 == 0) {
					System.out.println("even");
				}else {
					System.out.println("odd");
				}
				z++;
			}
		// write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0. 
			int w = 100;
			while (w >= 0 ) {
				System.out.println(w);
				w--;
			}

			
	}

}
