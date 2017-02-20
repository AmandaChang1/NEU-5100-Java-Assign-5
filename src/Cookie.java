
public class Cookie extends DessertItem {
	private int number;
	private int aPricePerDozen;

	public Cookie(String name,int number, int aPricePerDozen){
		super(name);
		this.number = number;
		this.aPricePerDozen = aPricePerDozen;
	}
	public int getNumber(){
		return number;
	}
	
	public int getAPricePerDozen(){
		return aPricePerDozen;
	}
	
	@Override
	public String toString(){
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		String perDozen=DessertShoppe.cents2dollarsAndCents(getAPricePerDozen()); 
		return  getNumber()+" @ "+ perDozen+ " /dz. \n" + getName()+ DessertShoppe.numberOfSpace(name, cost)+ cost +"\n";    
	}
	
	@Override
	public int getCost() {
		double totalCost= ((aPricePerDozen/12.0)*number);
		return (int)Math.round(totalCost);
	}

}
