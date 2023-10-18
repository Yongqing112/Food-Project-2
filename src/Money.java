import java.util.ArrayList;

public class Money {
	int total;
	static ArrayList <String>product = new ArrayList<String>();
	static ArrayList <String>weightorquantity = new ArrayList<String>();
	static ArrayList <Integer> money = new ArrayList<Integer>();
	public int getTotal() { //calculate the total.
		total = 0;
		for (int i=0;i<money.size();i++) {
			total+=money.get(i);
		}
		return total;
	}
}
