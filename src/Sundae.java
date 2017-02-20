
public class Sundae extends IceCream {
	private int costOfTheTopping;
	private String toppingName;

	public Sundae(String name, int costOfIceCream,String toppingName, int costOfTheTopping) {
		super(name, costOfIceCream);
		this.toppingName=toppingName;
		this.costOfTheTopping=costOfTheTopping;
		
	}
	public int getCostOfTheTopping(){
		return costOfTheTopping;
	}
	
	public String getToppingName(){
		return toppingName;
		
	}
	
	
	
	@Override
	public String toString(){
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		return getToppingName()+" Sundae With"+"\n" + getName() + DessertShoppe.numberOfSpace(name, cost) + cost +"\n";
	}
	
	@Override
	public int getCost(){
		int sundaeCost= costOfIceCream + costOfTheTopping;
		
		return sundaeCost;
		
	}
	
	}
	


