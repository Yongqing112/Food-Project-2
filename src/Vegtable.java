
public class Vegtable extends Product{

	public void getAmountPrice(String s) {
		if (s.equals("t")) {//one tomato 60$
			price = amount*60;
			Money.money.add(price);
			amount = 0;
		}else if (s.equals("c")) {//one cabbage 70$
			price = amount*70;
			Money.money.add(price);
			amount = 0;
		}
	}
	public void getWeightPrice(String s) {
		if (s.equals("t")) {//one KG of tomato 70$
			price = weight*70;
			Money.money.add(price);
			weight = 0;
		}else if (s.equals("c")) {//one KG of cabbage 140$
			price = weight*140;
			Money.money.add(price);
			weight = 0;
		}
	}
}
