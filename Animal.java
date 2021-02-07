public class Animal {

	int age;
	String gender;
	int weight;
	
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println("Eating..."); 
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	public void move(){
		int steps=4;
		System.out.println("I am moving with my " + steps + "steps, at a time.");
	}
}