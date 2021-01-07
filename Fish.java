package base;

public class Fish extends Animal {

	public Fish(int age, String gender, int weight) {
		super(age, gender, weight);
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		
	}

	public void swim() {
		System.out.println("Swimming");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
