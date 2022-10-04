import java.util.*;

public class Pizza {
	private String pizzaType;
	HashMap<String,Integer> vegetarian=new HashMap<String,Integer>();
		 vegetarian.put("Small",20);
		 vegetarian.put("Medium",40);
		 vegetarian.put("Large",60);
		 
	HashMap<String,Integer> vegan=new HashMap<String,Integer>();
		vegan.put("Small",15);
		vegan.put("Medium",30);
		vegan.put("Large",45);
		
		
	HashMap<String,Integer> nonVeg=new HashMap<String,Integer>();
		vegan.put("Small",25);
		vegan.put("Medium",50);
		vegan.put("Large",75);

	
	public Pizza(String pizzaType) {
		super();
		this.pizzaType = pizzaType;
	}
	
	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
    
	public void showPrices(){
		if(this.pizzaType.equalsIgnoreCase("Vegetarian")){
			for(Map.Entry m:vegetarian.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		else if(this.pizzaType.equalsIgnoreCase("Vegan")){
			for(Map.Entry m:vegan.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		else{
			for(Map.Entry m:nonVeg.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
	}

	public void showPizza() {
		System.out.println("crust is \n 1)Thin \n 2)Thick");
	}

	
	

}
