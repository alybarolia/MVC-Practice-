import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

	private View v;
	private Model m;
	
	public Controller (View v, Model m) {
		this.v = v;
		this.m = m;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("total")) {
			m.setTotal(Integer.parseInt(v.getText1()));
			//v.setTotal(m.getTotal());
		}
		if (e.getActionCommand().equals("increment")){
			int i = m.increment();
			v.setCurrent(i);
		}
		if (e.getActionCommand().equals("decrement")) {
			int i = m.decrement();
			v.setCurrent(i);
		}
		
	}
	
	
	
}
