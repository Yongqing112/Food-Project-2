import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Delete implements ActionListener{//ActionListener of the "Delete" button.

	Output out = new Output();
	public void actionPerformed(ActionEvent e) {// delete the item.
		int d = Integer.valueOf(FoodGUI.textField_d.getText());
		if (d > 0&&d <= Money.product.size()) {
			if (Money.product.get(d-1).equals("cake")) {
				deleteitem(d-1);
				CakeText.text.remove(getcaketexti(d-1));
				FoodGUI.textArea.setText("");
				out.printorder();
			}else {
				deleteitem(d-1);
				FoodGUI.textArea.setText("");
				out.printorder();
			}
		}
	}
	public int getcaketexti(int d) {//calculate the index of cake text.
		int ci = 0;
		for(int i = 0; i < d;i++) {
			if (Money.product.get(i).equals("cake")) {
				ci++;
			}
		}
		return ci;
	}
	public void deleteitem(int x) {
		Money.product.remove(x);
		Money.weightorquantity.remove(x);
		Money.money.remove(x);
	}
}
