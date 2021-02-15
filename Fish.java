public class Fish extends Animal {

	public Fish(int age, String gender, int weight) {
		super(age, gender, weight);
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		
	}

	@Override
	public void move() {
		System.out.println("I swim");
	}

	public void swim() {
		System.out.println("Swimming");
	}
}
