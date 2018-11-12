package labexam;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIView {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	JTextField total;
	private JTextField current;
	private JLabel label;
	private JButton increment;
	private JButton decrement;
	private GridLayout layout;
	private GUIController controller;
	private JLabel totalLabel;
	private JLabel currentLabel;
	
	public GUIView(){
		
		frame = new JFrame ("Sheep Counter");
		frame.setLayout(layout);
		controller = new GUIController();
		total = new JTextField("3");
		
		current = new JTextField("2");
		current.setEditable(false);
		label = new JLabel("");
		increment = new JButton ("increment");
		increment.addActionListener(controller);
		decrement = new JButton ("decrement");
		decrement.addActionListener(controller);
		layout = new GridLayout(4,2);
		totalLabel = new JLabel ("Total");
		currentLabel = new JLabel ("Current");
		
		frame.setLayout(layout);
		frame.add(totalLabel);
		frame.add(total);
		frame.add(currentLabel);
		frame.add(current);
		frame.add(increment);
		frame.add(decrement);
		consistant();
		frame.add(label);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
	
	public int getTotal () {
		int counter = Integer.parseInt(total.getText());
		//System.out.println(counter);
		return counter;
		
	}
	
	public int getCurrent () {
		int counter = Integer.parseInt(current.getText());
		//System.out.println(counter);
		return counter;
		
	}
	
	public void setTotal(int i) {
		total.setText(Integer.toString(i));
		
	}
	
	public void setCurrent(int i) {
		current.setText(Integer.toString(i));
		
	}
	
	public void consistant() {
		if (total.getText().equals( current.getText())) {
			label.setText("Complete!");
			label.setForeground(Color.GREEN);
		} else if (getCurrent() > getTotal()) {
			label.setText("Inconsitant");
			label.setForeground(Color.yellow);
		} else if (getTotal() != getCurrent()) {
			label.setText("Incomplete!");
			label.setForeground(Color.RED);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIView view = new GUIView();
		//view.getTotal();
		
	}

}
