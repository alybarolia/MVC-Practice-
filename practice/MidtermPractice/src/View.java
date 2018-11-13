
import java.awt.Color;
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
	private Model model;

	public View() {
		model = new Model();
		cont = new Controller (this, model);
		
		frame = new JFrame ("Sheep Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layout = new GridLayout (4,2);
		
		total = new JTextField ();
		current = new JTextField ();
		
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
		current.setEnabled(false);
		frame.setVisible(true);

	}
	

	public void setCurrent(int i) {
		current.setText("" + i);
	}
	
	public String getText1() {
		return total.getText();
	}
	
	public String getText2() {
		return current.getText();
		
	}
	
	public void setTotal(int i) {
		total.setText("" + i);
	}
	
	public void updateLabel(int i) {
		if (i == 1) {
			label.setText("incomplete!");
			label.setForeground(Color.RED);
		}else if (i == 2) {
			label.setText("complete!");
			label.setForeground(Color.GREEN);
		} else if (i == 3) {
			label.setText("inconsistent");
			label.setForeground(Color.YELLOW);
		}
		
	}
	
	
	public static void main (String [] args) {
		View v = new View();
	}


}
