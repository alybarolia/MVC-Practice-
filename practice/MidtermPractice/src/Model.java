
public class Model {
	
	//private View view;
	private int totalSheep;
	private int current;
	
	
	public Model() {
		
	}
	
	public int increment () {
		return current++;
	}
	
	public int decrement () {
		return current--;	
	}
	
	public int getTotal() {
		return this.totalSheep;
	}
	
	public void setTotal(int i) {
		this.totalSheep = i;
	}
	
	public int getCurrent() {
		return this.current;
	}
	
	public void setCurrent(int i) {
		this.current = i;
	}
	
}
