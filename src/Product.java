
public class Product {
	public int price;
	public int amount;
	public int weight;
	
	public void setamount(String s) {// set the amount of product.
		if (FoodGUI.rb6.isSelected()) {
			amount = FoodGUI.a;
			Money.weightorquantity.add("x"+amount);
			getAmountPrice(s);
		}else {
			weight = FoodGUI.a;
			Money.weightorquantity.add(weight+"KG");
			getWeightPrice(s);
		}
	}
	public void getAmountPrice(String s) {

	}
	public void getWeightPrice(String s) {
		
	}
}
