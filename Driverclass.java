import java.util.*;

public class Driverclass {
	public static void main(String[] args) {
		int pastaOrderId = 1;
		int orderId = 1;
		Scanner sc = new Scanner(System.in);
		
		// GIVE ORDER FOR PIZZA OR PASTA
	System.out.println("what would you like to have pizza or pasta");
	String str =sc.nextLine();
	if(str.equalsIgnoreCase("pizza")){
		orderId++;
		
		// GIVE PIZZA TYPE
		System.out.println("which pizza would you like to have \n 1)Vegetarian \n 2)NonVeg \n 3)Vegan");
		String pizzaType = sc.nextLine();
		Pizza pizza = new Pizza(pizzaType);
		pizza.showPrices();
		pizza.showPizza();
		
		//TAKE ORDER
		System.out.println("please enter type of pizza \n 1)Vegetarian \n 2)Non-Veg \n 3)Vegan");
		String type = sc.nextLine();
		System.out.println("please eneter size of pizza");
		String size = sc.nextLine();
		Order order = new Order(type,size);
		
		//Take order for Topins
		
		System.out.println("do like to have Topins \n 1. Cheese (1 USD) \n 2. Mushroom (1 USD) \n 3. Tomato (1 USD) \n 4. Jalepeno (1 USD) \n 5. Spinach (1 USD)");
		String topins = sc.nextLine();
		order.isTopinsAdded(topins);
		
		System.out.println("your order is being preapred");
		
		
		//check order status
		System.out.println("Would you like to know Your status? please enter \n Yes or \n No");
		String response = sc.nextLine();
		if(response.equalsIgnoreCase("yes")){
			order.getOrderStatus(orderId);
		}else{
			System.out.println("Thanks for your response");
		}
		
		//Genearte Bill
		order.generate_Bill();
		
		//Payment
		System.out.println("Please pay the Bill");
		String payment = sc.nextLine();
		
		if(payment!=null){
			System.out.println("Thanks for Coming");
		}else{
			System.out.println("Please complete Your payment");
		}
		
	}
	
	//FOR PASTA ORDER
	
	else if(str.equalsIgnoreCase("pasta")){
		
		pastaOrderId++;
		Pasta pasta = new Pasta();
		// GIVE PASTA TYPE
		System.out.println("which pizza would you like to have \n 1)Penne \n 2)Ditalini");
		String pastatype =  sc.nextLine();
		System.out.println("which type of flavor would you like to have \n 1)White Sause \n 2)Red Sause");
		String flavor = sc.nextLine();
		
		System.out.println("Your food is being prepared...");
		
		//check order status
		System.out.println("Would you like to know Your status? please enter \n Yes or \n No");
		String response = sc.nextLine();
			if(response.equalsIgnoreCase("yes")){
				pasta.getOrderStatus(pastaOrderId);
			}else{
				System.out.println("Thanks for your response");
			}
		
		//GENERATE BILL
			
			pasta.generateBill(flavor);
			
			
			//Payment
			System.out.println("Please pay the Bill");
			String payment = sc.nextLine();
			
			if(payment!=null){
				System.out.println("Thanks for Coming");
			}else{
				System.out.println("Please complete Your payment");
			}
		
		
	}
	else{
		System.out.println("thanks for coming");
		System.exit(0);
	}  
	}

}
