import java.util.*;
public class Pasta {

	private int orderId = 1;
	private final int whiteSausePrice = 10;
	private final int redSausePrice = 20;
	
	

	public void getOrderStatus(int pastaOrderId) {
		// TODO Auto-generated method stub
		ArrayList<Integer> pasta = new ArrayList<Integer>();
		pasta.add(orderId);
		for(Integer order:pasta){
			if(orderId==orderId){
				System.out.println("Your pasta is Ready");
			}else{
				System.out.println("Don't found any order");
			}
		}
	}



	public void generateBill(String flavor) {
		// TODO Auto-generated method stub
		if(flavor.equalsIgnoreCase("White Sause")){
			System.out.println("10 USD");
		}else{
			System.out.println("20 USD");
		}
		
	}
	
	
}
