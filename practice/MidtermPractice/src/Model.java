
public class Model {

	private int totalSheep;
	private int current;
	
	public int increment () {
		this.current = current+ 1;
		return current + 1;
	}
	
	public int decrement () {
		this.current = current - 1;
		return current - 1;
	}
	
}
