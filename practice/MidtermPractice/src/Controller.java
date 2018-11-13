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
		}
		else if (e.getActionCommand().equals("increment")){
			m.increment();
			v.setCurrent( m.getCurrent());
			
		}
		else if (e.getActionCommand().equals("decrement")) {
			m.decrement();
			v.setCurrent( m.getCurrent());
		}
		
		if(m.getCurrent() < m.getTotal()) {
			v.updateLabel(1);
		} 
		if (m.getCurrent() == m.getTotal()) {
			v.updateLabel(2);
		}
		if (m.getCurrent() > m.getTotal()) {
			v.updateLabel(3);
		}
		
	}
	
	
	
}
