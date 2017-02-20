
public class IceCream extends DessertItem{
	protected int costOfIceCream;

	
	public IceCream(String name,int costOfIceCream){
		super(name);
		this.costOfIceCream=costOfIceCream;
		
	}
	
	public int getCostOfIceCream(){
		return costOfIceCream;
	}
	
	
	@Override
	public String toString(){
		String cost = DessertShoppe.cents2dollarsAndCents(getCost());
		return getName()+ DessertShoppe.numberOfSpace(name, cost)+ cost +"\n";
	}
	
	@Override
	public int getCost() {
		
		return costOfIceCream;
	}

}
