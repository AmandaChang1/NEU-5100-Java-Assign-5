
public class Candy extends DessertItem{
	private double weight;
	private int aPricePerPound;

	
	public Candy(String name, double weight, int aPricePerPound){
		super(name);
		this.weight=weight;
		this.aPricePerPound=aPricePerPound;
	}
	

	
	public double getWeight(){
		return weight;
	}
	
		
	public int getAPricePerPound(){
		return aPricePerPound;
	}
	
	
	@Override
	public String toString(){
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		String perPound=DessertShoppe.cents2dollarsAndCents(getAPricePerPound()); 
		return   getWeight() + " lbs. @ " + perPound + " /lb.\n" + getName()+DessertShoppe.numberOfSpace(name, cost)+ cost + "\n"; 

	} 
	
	
	@Override
	public int getCost() {
		double totalCost= weight*aPricePerPound;
		return (int) Math.round(totalCost);
	} 

	
}

