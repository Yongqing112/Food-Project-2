import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input implements ActionListener{//ActionListener of the "Enter" button.

	Cake cake = new Cake();
	Fruit fruit = new Fruit();
	Vegtable veg = new Vegtable();
	Output out = new Output();
	public void actionPerformed(ActionEvent e) {//select the product and add it in the list.
		if (FoodGUI.a > 0&&FoodGUI.rb1.isSelected()&&(FoodGUI.rb6.isSelected()||FoodGUI.rb7.isSelected())) {
			Money.product.add("apple");
			String a = "a";
        	fruit.setamount(a);
		}
		if (FoodGUI.a > 0&&FoodGUI.rb2.isSelected()&&(FoodGUI.rb6.isSelected()||FoodGUI.rb7.isSelected())) {
			Money.product.add("banana");
			String b = "b";
        	fruit.setamount(b);
		}
		if (FoodGUI.a > 0&&FoodGUI.rb3.isSelected()&&(FoodGUI.rb6.isSelected()||FoodGUI.rb7.isSelected())) {
			Money.product.add("cabbage");
			String c = "c";
        	veg.setamount(c);
		}
		if (FoodGUI.a > 0&&FoodGUI.rb4.isSelected()&&(FoodGUI.rb6.isSelected()||FoodGUI.rb7.isSelected())) {
			Money.product.add("tomato");
			String t = "t";
        	veg.setamount(t);
		}
		if (FoodGUI.rb5.isSelected()) {
			Money.product.add("cake");
			cake.setamount();
			FoodGUI.textField_t.setText("");
		}
		FoodGUI.textArea.setText("");
		out.printorder();//print the order.
	}

}
