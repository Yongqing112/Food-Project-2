
public class Fruit extends Product{

	public void getAmountPrice(String s) {
		if (s.equals("a")) {//one apple 50$
			price = amount*50;
			Money.money.add(price);
			amount = 0;
		}else if (s.equals("b")) {//one banana 80$
			price = amount*80;
			Money.money.add(price);
			amount = 0;
		}
	}
	public void getWeightPrice(String s) {
		if (s.equals("a")) {//one KG of apple 100$
			price = weight*100;
			Money.money.add(price);
			weight = 0;
		}else if (s.equals("b")) {//one KG of banana 160$
			price = weight*160;
			Money.money.add(price);
			weight = 0;
		}
	}
}
