package base;

public class Chicken extends Bird {

	public Chicken(int age, String gender, int weight) {
		super(age, gender, weight);
	}

	//overriding (, replace) the method fly which is defined in Bird class
//	public void fly() {
//		System.out.println("I am not flying");
//	}
}
