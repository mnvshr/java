public class Point {
	int x, y;

	Point(int a, int b) {
		x = a;
		y = b;
	}

	void move(int a, int b) {
		x = a;
		y = b;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	public String toString() {
		return x + " " + y;
	}

	public static void main(String[] args) {
		Point p = new Point(10, 5);

		System.out.println("X = " + p.getX());
		System.out.println("Y = " + p.getY());

		p.move(3, 5);

		System.out.println("X = " + p.getX());
		System.out.println("Y = " + p.getY());
	}

}
