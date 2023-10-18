import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class FoodGUI extends JFrame{

	private JFrame frame;
	static int a = 0;
	JPanel panel = new JPanel();
	JLabel ID = new JLabel("User ID :");
	JLabel caketext = new JLabel("Text:");
	static JTextField textField = new JTextField();
	static JTextField textField_d = new JTextField();
	static JTextField textField_t = new JTextField();
	static JRadioButton rb1 = new JRadioButton("Apple");
	static JRadioButton rb2 = new JRadioButton("Banana");
	static JRadioButton rb3 = new JRadioButton("Cabbage");        //Initialize all the contents of the frame.
	static JRadioButton rb4 = new JRadioButton("Tomato");
	static JRadioButton rb5 = new JRadioButton("Cake");
	static JRadioButton rb6 = new JRadioButton("amount");
	static JRadioButton rb7 = new JRadioButton("weight");
	JButton add = new JButton("+1");
	JButton minus = new JButton("-1");
	JPanel panel_1 = new JPanel();
	JLabel num = new JLabel("0");
	static JButton enter = new JButton("Enter");
	static JButton delete = new JButton("Delete");
	static JTextArea textArea = new JTextArea();
	static JButton pay = new JButton("Pay");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FoodGUI window = new FoodGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public FoodGUI() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Good Life Food");
		frame.setBounds(100, 100, 443, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //set frame.
		frame.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 434, 31);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.add(ID);
		panel.add(textField);
		textField.setColumns(10);
		rb1.setBounds(10, 37, 107, 23);
		frame.getContentPane().add(rb1);
		rb2.setBounds(10, 62, 107, 23);
		frame.getContentPane().add(rb2);
		rb3.setBounds(10, 87, 107, 23);
		frame.getContentPane().add(rb3);
		rb4.setBounds(10, 112, 107, 23);
		frame.getContentPane().add(rb4);
		rb5.setBounds(10, 160, 107, 23);
		frame.getContentPane().add(rb5);
		rb6.setBounds(119, 62, 107, 23);
		frame.getContentPane().add(rb6);                                //set the bounds of all the contents.
		rb7.setBounds(119, 87, 107, 23);
		frame.getContentPane().add(rb7);
		add.setBounds(346, 79, 56, 23);
		frame.getContentPane().add(add);
		add.addActionListener(new add());
		minus.setBounds(247, 79, 56, 23);
		frame.getContentPane().add(minus);
		minus.addActionListener(new minus());
		panel_1.setBounds(313, 79, 23, 23);
		frame.getContentPane().add(panel_1);
		panel_1.add(num);
		enter.setBounds(330, 160, 87, 23);
		frame.getContentPane().add(enter);
		enter.addActionListener(new Input());
		textArea.setForeground(Color.BLACK);
		textArea.setLineWrap(true);
		JScrollPane scroller = new JScrollPane(textArea);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroller.setBounds(10, 193, 407, 157);
		frame.getContentPane().add(scroller);
		delete.setBounds(10, 360, 87, 23);
		frame.getContentPane().add(delete);
		delete.addActionListener(new Delete());
		pay.setBounds(330, 360, 87, 23);
		frame.getContentPane().add(pay);
		pay.addActionListener(new Output());
		textField_d.setBounds(107, 361, 23, 21);
		frame.getContentPane().add(textField_d);
		textField_d.setColumns(10);
		textField_t.setBounds(177, 161, 96, 21);
		frame.getContentPane().add(textField_t);
		textField_t.setColumns(10);
		caketext.setBounds(123, 164, 52, 15);
		frame.getContentPane().add(caketext);
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);   //set the button group of radiobuttons.
		group.add(rb4);   //rb1~rb5 are for product.
		group.add(rb5);
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rb6);  //rb6 & rb7 are for amount and weight.
		group2.add(rb7);
	}
	class add implements ActionListener{ //inner class of the add button.
		
		public void actionPerformed(ActionEvent e) {
			a++;
			String i = String.valueOf(a);
			num.setText(i);
		}
	}
	class minus implements ActionListener{ //inner class of the minus button.
		
		public void actionPerformed(ActionEvent e) {
			if (a > 0) {
				a--;
				String i = String.valueOf(a);
				num.setText(i);
			}
		}
	}
}

