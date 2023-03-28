import java.text.DecimalFormat;
import java.util.*;


public class PizzaOrder 
{
	public static void main(String[] args) 
	{
	
				DecimalFormat money = new DecimalFormat ("#0.00");
			
				Scanner keyboard = new Scanner (System.in);

				Pizza order = new Pizza();

				String firstName;	
			    int type;
				int veg = 0;
				int nonveg = 0;
				String pizzatype;
				int pizzaprice;
				int size;
				char crustType;	
				double cost;			
				final double TAX_RATE = .08;
				double tax;				
				char choice;		
				String input;			
				String toppings = "Cheese ";
				int numberOfToppings = 0;	

				//prompt user and get first name
				System.out.println("Welcome to Pizza factory");
				System.out.print("Enter your first name:  ");
				firstName = keyboard.nextLine();

				System.out.println("Welcome to Pizza Factory!");
			      System.out.println("Please select your pizza size:");
			      System.out.println("1. Small");
			      System.out.println("2. Medium");
			      System.out.println("3. Large");

			      System.out.print("Enter your choice (1-3): ");
			       size = keyboard.nextInt();
			       
			       System.out.println("What type of pizza u want:");
			       System.out.println("1.veg");
			       System.out.println("2.Non-veg");
			       type=keyboard.nextInt();
			       
			       if(type==1)
			       {
			    	   System.out.println("a:Deluxe veg");
				       System.out.println("b:chesse and corn");
				       System.out.println("c:paneer tikka");
				       veg=keyboard.nextInt();
			       }
			       else
			       {
			    	   System.out.println("A:Non-Veg supreme");
				       System.out.println("B:Chicken tikka");
				       System.out.println("C:Pepper Barbecue");
				       nonveg=keyboard.nextInt();
			    	   
			       }  
			       System.out.println("For Non-veg");
			       System.out.println("Non-Veg supreme");
			       System.out.println("Chicken tikka");
			       System.out.println("Pepper Barbecue");
			       
			       switch(veg) {
			         case 1:
			            pizzatype = "a";
			            pizzaprice = 200;
			            break;
			         case 2:
			            pizzatype = "b";
			            pizzaprice =  300;
			            break;
			         case 3:
			            pizzatype = "c";
			            pizzaprice = 400;
			            break;
			         default:
			            System.out.println("Invalid choice. Exiting program.");
			            return;
			      }
			       
			       switch(nonveg) {
			         case 1:
			            pizzatype = "A";
			            pizzaprice = 250;
			            break;
			         case 2:
			            pizzatype = "B";
			            pizzaprice = 350;
			            break;
			         case 3:
			            pizzatype = "C";
			            pizzaprice = 450;
			            break;
			         default:
			            System.out.println("Invalid choice. Exiting program.");
			            return;
			      }
			       
			       
				System.out.println("What type of crust do you want? ");
				System.out.print("(H)Hand-tossed, (T) Thin-crust,(F)Fresh Pan Pizza, or " +
					"(C) Cheese Brust (enter H, T,F, or C): ");
				input = keyboard.nextLine();
				crustType = input.charAt(0);

				
				switch(crustType)
				{
					case 'H':
					case 'h':
						 order.setCrust("Hand-Tossed");
						break;
					case 'T':
					case 't':
						order.setCrust("Thin-Crust");
						break;
					case 'F':
					case 'f':
						order.setCrust("Fresh Pan Pizza");
						break;
					case 'C':
					case 'c':
						order.setCrust("Cheese Brust");
					default:
						System.out.print("User's input not one of the choices, so a hand tossed crust will be made");
						order.setCrust("Hand Tossed");
				}

				
				System.out.println("All pizzas come with cheese.");
				System.out.println("Additional toppings are RS40 each,"
						+ " choose from");
				System.out.println("Black Olives, Capsicum, paneer, Mushroom,Fresh tomato");

				
				System.out.print("Do you want Black olives?  (Y/N):  ");
				input = keyboard.nextLine();
				choice = input.charAt(0);
				if (choice == 'Y' || choice == 'y')
				{
					numberOfToppings += 1;
					toppings = toppings + "Black olives ";
				}
				System.out.print("Do you want capsicum?  (Y/N):  ");
				input = keyboard.nextLine();
				choice = input.charAt(0);
				if (choice == 'Y' || choice == 'y')
				{
					numberOfToppings += 1;
					toppings = toppings + "capsicum ";
				}
				System.out.print("Do you want paneer?  (Y/N):  ");
				input = keyboard.nextLine();
				choice = input.charAt(0);
				if (choice == 'Y' || choice == 'y')
				{
					numberOfToppings += 1;
					toppings = toppings + "paneer ";
				}
				System.out.print("Do you want Mushroom?  (Y/N):  ");
				input = keyboard.nextLine();
				choice = input.charAt(0);
				if (choice == 'Y' || choice == 'y')
				{
					numberOfToppings += 1;
					toppings = toppings + "Mushroom ";
				}
				System.out.print("Do you want Fresh Tomato?  (Y/N):  ");
				input = keyboard.nextLine();
				choice = input.charAt(0);
				if (choice == 'Y' || choice == 'y')
				{
					numberOfToppings += 1;
					toppings = toppings + "Fresh Tomato ";
				}

			
				order.setNumToppings (numberOfToppings);
				order.setToppingList(toppings);

			
				order.setCost(40*numberOfToppings);

				
				System.out.println();
				System.out.println("Your order is as follows: ");
				System.out.println(order.getSize() + " size pizza");
				System.out.println(order.getCrust() + " crust");
				System.out.println(order.getToppingList());

				cost = order.getCost();
				System.out.println("The cost of your order is: Rs" + money.format(cost));

				//calculate and display tax and total cost
				tax = cost * TAX_RATE;
				System.out.println("The tax is:  Rs" + money.format(tax));
				System.out.println("The total due is:  Rs" + money.format(tax + cost));

				System.out.println("Your order will be ready" +
					" for pickup in 30 minutes.");
		
	
	}

}
