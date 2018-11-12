package labexam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class GUIController implements ActionListener{

	private GUIView view;
	private GUIModel model;
	private JTextField field;
	private int counter;
	
	public GUIController (GUIView v, GUIModel m){
		this.view = v;
		this.model = m;
	}
	
	public GUIController () {
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//although the butons dont work if you change the values in GUIView class the label works
		
		if (e.getActionCommand().equals("increment")) { //some reason increment is not working
			counter = view.getTotal();
			counter++;
			field.setText("" + counter);
			view.consistant();
			
		} if (e.getActionCommand().equals("decrement")){ //some reason decremtn not working either
			counter = view.getTotal();
			counter--;
			field.setText("" + counter);
			view.consistant();
		
		
	}

	}
}
