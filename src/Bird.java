public class Bird implements Swimmable, Flyable{
    String name;
    int age;
    int speed;

    public Bird(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }


    @Override
    public void swim() {
        System.out.println(name + " плавает при помощи лап-ласт с перепонками между пальцами");

    }

    @Override
    public void fly() {
        System.out.println(name + " летает со скоростью: " + speed + " км/ч");
    }
}
