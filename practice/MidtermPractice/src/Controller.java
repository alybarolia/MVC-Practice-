import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private View v;
	private Model m;
	
	public Controller (View v, Model m) {
		this.v = v;
		this.m = m;
	}
	
	public Controller (View v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("increment")) {
			int i = m.increment();
			v.setCurrent(i);
		}
		
	}
	
	
	
}
