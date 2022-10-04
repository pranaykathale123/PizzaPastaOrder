import java.util.*;

public class Order extends Pizza {
	private static int oderid=1;
	private String type;
	private String size;
	private String topins;
	//private Pizza pizza;

	public Order(String type,String size) {
		super(type);
		this.type = type;
		this.size = size;
	}
	
	public void generate_Bill(){
		Order.oderid++;
		
		if((this.size.equalsIgnoreCase("small"))&&(this.type.equalsIgnoreCase("vegetarian"))){
			if(isTopinsAdded(topins)){
				System.out.println("21 USD");
			}else{
				System.out.println("20 USD");
			}
			
		}
		if((this.size.equalsIgnoreCase("medium"))&&(this.type.equalsIgnoreCase("vegetarian"))){
			if(isTopinsAdded(topins)){
				System.out.println("41 USD");
			}else{
				System.out.println("40 USD");
			}
			
		}
		if((this.size.equalsIgnoreCase("large"))&&(this.type.equalsIgnoreCase("vegetarian"))){
			if(isTopinsAdded(topins)){
				System.out.println("61 USD");
			}else{
				System.out.println("60 USD");
			}
			
		}
		
		if((this.size.equalsIgnoreCase("small"))&&(this.type.equalsIgnoreCase("Nonveg"))){
			if(isTopinsAdded(topins)){
				System.out.println("25 USD");
			}else{
				System.out.println("26 USD");
			}
			
		}
		
		if((this.size.equalsIgnoreCase("medium"))&&(this.type.equalsIgnoreCase("Nonveg"))){
			if(isTopinsAdded(topins)){
				System.out.println("51 USD");
			}else{
				System.out.println("50 USD");
			}
			
		}
		
		if((this.size.equalsIgnoreCase("medium"))&&(this.type.equalsIgnoreCase("Nonveg"))){
			if(isTopinsAdded(topins)){
				System.out.println("76 USD");
			}else{
				System.out.println("75 USD");
			}
			
		}
		
		if((this.size.equalsIgnoreCase("small"))&&(this.type.equalsIgnoreCase("Vegan"))){
			if(isTopinsAdded(topins)){
				System.out.println("16 USD");
			}else{
				System.out.println("15 USD");
			}
			
		}
		
		if((this.size.equalsIgnoreCase("medium"))&&(this.type.equalsIgnoreCase("Vegan"))){
			if(isTopinsAdded(topins)){
				System.out.println("31 USD");
			}else{
				System.out.println("30 USD");
			}
			
		}
		
		if((this.size.equalsIgnoreCase("large"))&&(this.type.equalsIgnoreCase("Vegan"))){
			if(isTopinsAdded(topins)){
				System.out.println("46 USD");
			}else{
				System.out.println("45 USD");
			}
			
		}
	}

	public boolean isTopinsAdded(String topins) {
		this.topins = topins;
		// TODO Auto-generated method stub
		if(topins!=null){
			return true;
		}
		return false;
	}
	
	public void getOrderStatus(int orderId){
		ArrayList<Integer> orderlist = new ArrayList<Integer>();
		orderlist.add(Order.oderid);
		for(Integer order:orderlist){
			if(orderId==Order.oderid){
				System.out.println("Your Pizza is Ready");
			}else{
				System.out.println("Don't found any order");
			}
		}
	}
	
   
	

}
