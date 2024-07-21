package app;

import java.util.Scanner;

/*Main method creates 5 products (armor, weapons, health) and interacts with user to allow purchase
 * and return of products, point checking, and view of updated inventory list.*/

public class Main {

	public static void main(String[] args) {
		//Define Variables
		double points;
		int item = 0;
		Product[] prodArray;
        String choice;
        int choiceID;
        

		//Create a line separation for formatting
		String lineSeparator = System.lineSeparator();

		//Initialize user variables/arrays
		points = 100; 
		prodArray = new Product[5];

		
		
		//Populate array with inventory list
		prodArray[0] = new Armor(1, "Super Suit", "Protects wearer from all types of devestation.", 50, 6);
		prodArray[1] = new Armor(2, "Lazy Shell", "Hide under it for absolute invisibility.", 30, 4);
		prodArray[2] = new Weapon(3, "Frying Pan", "Slay any attacker that comes your way.", 25, 7);
		prodArray[3] = new Weapon(4, "Punch Glove", "Knock any foe down with a triple punch.", 30, 3);
		prodArray[4] = new Health(5, "Lives", "Enhance longevity by purchases 5 extra lives", 50, 2);
		
		
		//User Greeting
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome to the Game Stop. Would you like to see a list of products? 'y' for yes; 'n' for no");
		choice = obj.nextLine();
		
		//Print inventory list to screen
		if (choice.equals("y"))
		{
			//Print list of products to screen
			System.out.println(prodArray[0].toString());
			System.out.println(prodArray[1].toString());
			System.out.println(prodArray[2].toString());
			System.out.println(prodArray[3].toString());
			System.out.println(prodArray[4].toString());
			
			//user options
			System.out.println("Press 'p' to purchase" + lineSeparator + "Press 'c' to check credits"  + lineSeparator + "Press 'e' to exit.");
			choice = obj.nextLine();
			
			//print user points to screen
			if (choice.equals("c")) 
			{
				System.out.println("You have " + points + " points.");
				
			}
			//Allows user to purchase item from inventory list
			if (choice.equals("p"))
			{
				System.out.println("Enter the ID number of the product you wish to purchase.");
				choiceID = obj.nextInt();
				item = choiceID - 1;
				points = points - prodArray[item].price;
				prodArray[item].reduceQuantity();
				System.out.print ("Thank you for purchasing a " + prodArray[item].name + ". " +"There are only " + prodArray[item].quantity + " left in stock." + System.lineSeparator() + "You're point balance is: " + points + System.lineSeparator());
				System.out.println("Buyer's remorse? Click 'y' to return. Click 'l' to check out the inventory");
				choice = obj.next();
				//Allows user to return product
				if (choice.equals("y"))
					{
					prodArray[item].increaseQuantity();
					points = points + prodArray[item].price;
					System.out.println("You have " + points + " .");
					}
				//Allows user to keep shopping
				if (choice.equals("l"))
				{
					//Prints updated inventory list of products to screen
					System.out.println(prodArray[0].toString());
					System.out.println(prodArray[1].toString());
					System.out.println(prodArray[2].toString());
					System.out.println(prodArray[3].toString());
					System.out.println(prodArray[4].toString());
				}
			//User exits application. Goodbye message printed to screen
			if (choice.equals("e"))
			{
				System.out.println("Thank you for checking out our inventory. Come back soon!");
			}	
		}	
			
		}
		//User chose to not continue shopping once inventory list was printed to screen
		else  
			{
			System.out.println("Thanks for stopping in. Check in later to see what new items are in stock!");
			}
		}
		
	
}

	



