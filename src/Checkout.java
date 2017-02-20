
import java.util.Vector;

public class Checkout {
	
	private Vector <DessertItem> items;
	
	public Checkout(){
		items=new Vector <DessertItem>();
	}
	
	public int numberOfItems(){
		return items.size();
	}
	
	public void enterItem(DessertItem item){
		items.add(item);
	}
	
	public void clear(){
		items.clear();
		
	}
	
	public int totalCost(){
		int total=0;
		for (DessertItem dessert:items){
			total += dessert.getCost();
		}
		return total;
	}
	
	public int totalTax(){
		int total = totalCost();
		float totalTax= total * DessertShoppe.taxRate;
		return Math.round(totalTax);
	}
	
	@Override
	public String toString(){
		
		
		String shopName= DessertShoppe.nameOfStore;
		String line="-------------------";
		int costWithTax= totalCost()+totalTax();
		String totalTax= DessertShoppe.cents2dollarsAndCents(totalTax());
		String totalCost= DessertShoppe.cents2dollarsAndCents(costWithTax);
		String itemsPurchased = "";
		for (DessertItem eachItem:items){
			itemsPurchased += eachItem.toString();
		}
		String receipt= shopName + "\n"+ line + "\n"+ itemsPurchased + "tax" + DessertShoppe.numberOfSpace("tax", totalTax)+totalTax + "\n" + "Total Cost"+DessertShoppe.numberOfSpace("Total Cost", totalCost)+totalCost;
		return receipt;
	}
	public static void main(String[] args) {

        Checkout checkout = new Checkout();

        checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
        checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
        checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
        checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);

        checkout.clear();

        checkout.enterItem(new IceCream("Strawberry Ice Cream", 145));
        checkout.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        checkout.enterItem(new Candy("Gummy Worms", 1.33, 89));
        checkout.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
        checkout.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
        checkout.enterItem(new Candy("Candy Corn", 3.0, 109));

        System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
        System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
        System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
        System.out.println(checkout);
    }

	

}
