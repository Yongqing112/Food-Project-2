import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class Output implements ActionListener{//ActionListener of "Pay" button.

	SecureRandom r = new SecureRandom();
	Money m = new Money();
	User u = new User();
	public void printorder() {
		int ci = 0;
		for(int i = 0; i < Money.product.size(); i++) {
			FoodGUI.textArea.append("("+(i+1)+")");
			FoodGUI.textArea.append(Money.product.get(i) +": ");
			FoodGUI.textArea.append(Money.weightorquantity.get(i)+" ");
			FoodGUI.textArea.append(Money.money.get(i)+"$");
			if (Money.product.get(i).equals("cake")) { //print the cake text if the product is cake.
				FoodGUI.textArea.append("----CakeText :"+CakeText.text.get(ci));
				ci++;
			}
			FoodGUI.textArea.append("\n");
		}
	}
	public void printtotal() {
		FoodGUI.textArea.append("\nThe total is :"+m.getTotal());
	}
	public void actionPerformed(ActionEvent e) { //print the final order.
		if (m.getTotal() < 400) {
			FoodGUI.textArea.append("Your order must over than 400$.\n");
		}else if (m.getTotal() >= 400 && m.getTotal() < 1200){
			u.setAccount();
			FoodGUI.textArea.setText("");
			FoodGUI.textArea.append("Account:"+User.Account);
			FoodGUI.textArea.append("\nOrder :\n");
			printorder();
			printtotal();
			FoodGUI.textArea.append("\nThe freighfee is 200$\n");
			FoodGUI.textArea.append("The total is :"+(m.getTotal()+200)+" "+"Thank you.\n");
			FoodGUI.textArea.append("Reference number :"+r.nextInt(1000));
			FoodGUI.enter.setEnabled(false);
			FoodGUI.pay.setEnabled(false);
			FoodGUI.delete.setEnabled(false);
		}else {
			u.setAccount();
			FoodGUI.textArea.setText("");
			FoodGUI.textArea.append("Account:"+User.Account);
			FoodGUI.textArea.append("\nOrder :\n");
			printorder();
			printtotal();
			FoodGUI.textArea.append("\nThe freighfee is free!\n");
			FoodGUI.textArea.append("The total is :"+m.getTotal()+" "+"Thank you.\n");
			FoodGUI.textArea.append("Reference number :"+r.nextInt(1000));
			FoodGUI.enter.setEnabled(false);
			FoodGUI.pay.setEnabled(false);
			FoodGUI.delete.setEnabled(false);
		}
	}
}
