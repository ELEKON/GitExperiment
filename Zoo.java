public class Zoo {

    public static void main(String[] args) {
        Animal animal1 =new Fish(5, "mame", 134);
		Animal animal5 =new Bird(5, "female", 90);
		Animal animal3 =new Chicken(14, "mame", 134);

		animal1.eat();


		animal5.sleep();
		animal3.sleep();
        Bird bird1 = new Bird(10, "male", 34);
        bird1.sleep();// oi methodoi tou gonea klhronomountai to antistrofo den isxuei
        bird1.move();
        bird1.eat();
        Fish fish1 = new Fish(12, "male", 12);
        fish1.swim();

    }

}

