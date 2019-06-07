
public class Circle implements Comparable<Circle> {
	private int radius = 1;
	public Circle() {
		
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	public int compareTo(Circle a) {
		if(this.radius > a.radius) {
			return 1;
		}
		else if (this.radius < a.radius) {
			return -1;
		}
		return 0;
	}
	public String toString() {
		return "Biggest Circle: " + radius;
	}
}
