
public class Chicken extends Bird implements Flyable {

	public Chicken(int age, String gender, int weight) {
		super(age, gender, weight);
	}
	public void fly() {
		System.out.println("I am not flying");
	}
}
