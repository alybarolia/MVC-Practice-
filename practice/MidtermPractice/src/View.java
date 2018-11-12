import java.awt.GridLayout;

import javax.swing.*;

public class View extends JFrame {

	//private JPanel panel;
	private JFrame frame;
	private GridLayout layout;
	private JTextField total;
	private JTextField current;
	private JLabel label1;
	private JLabel label2;
	private JButton increment;
	private JButton decrement;
	private JLabel label;
	private Controller cont;

	public View() {
		cont = new Controller (this);
		frame = new JFrame ("Sheep Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout = new GridLayout (4,2);
		
		total = new JTextField ("3");
		current = new JTextField ("2");
		current.setEditable(false);
		label1 = new JLabel ("total");
		label2 = new JLabel ("current");
		increment = new JButton ("increment");
		decrement = new JButton ("decrement");
		label= new JLabel ("");
		total.setActionCommand("total");
		current.setActionCommand("current");
		
		
		frame.setLayout(layout);
		frame.add(label1);
		frame.add(total);
		total.addActionListener(cont);
		frame.add(label2);
		frame.add(current);
		current.addActionListener(cont);
		frame.add(increment);
		increment.addActionListener(cont);
		frame.add(decrement);
		decrement.addActionListener(cont);
		frame.add(label);
		

		frame.setSize(300, 200);

		frame.setVisible(true);

	}

	public void setCurrent(int i) {
		current.setText("" + i);
	}
	
	
	
	public static void main (String [] args) {
		View v = new View();
	}


}
