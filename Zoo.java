package base;

public class Zoo {

    public static void main(String[] args) {
        //Animal animal1 =new Fish(5, "mame", 134);
//		Animal animal2 =new Bird(3, "female", 104);
//		Animal animal3 =new Chicken(7, "mame", 134);
//
//		animal1.eat();


//		animal2.sleep();
//		animal3.sleep();
        Bird bird1 = new Bird(10, "male", 34);
        //bird1.fly();
        bird1.sleep();// oi methodoi tou gonea klhronomountai to antistrofo den isxuei

        Fish fish1 = new Fish(12, "male", 12);
        fish1.swim();

        //Chicken chick1 = new Chicken(1, "male", 15);
        //chick1.fly();
    }

}

