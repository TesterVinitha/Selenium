package Sample;

public class Calculator {

	public void sub() {
		System.out.println("sub");
	}

	public void add() {

		System.out.println("adding");
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.sub();
		c.add();
	}

}
