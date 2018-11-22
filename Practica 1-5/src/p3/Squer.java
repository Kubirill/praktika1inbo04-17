package p3;

public class Squer extends Rectangle {
	public Squer() {};
	public Squer(double scale) {
		length=scale;
	}
	public Squer(double scale,String color,boolean filled) {
		length=scale;
		this.color=color;
		this.filled=filled;
	}
	public double getArea() {
		return length*length;
	}
	public double getPerimeter() {
		return 4*length;
	}
	public String toString() {
		return color+" squer";
	}
}
