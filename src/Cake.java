
public class Cake extends Product{

	CakeText t = new CakeText();
	public void setamount() {
		amount = 1;
    	Money.weightorquantity.add("x"+amount);
    	getAmountPrice();
    	t.setText();
	}
	public void getAmountPrice() {
		price = amount*100;
		Money.money.add(price);
		amount = 0;
	}
}
