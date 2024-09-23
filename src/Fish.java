public class Fish implements Swimmable, Flyable{
    String name;
    int age;
    int speed;

    public Fish(String name, int age, int speed) {
        this.name = name;
        this.age = age;
        this.speed = speed;
    }


    @Override
    public void swim() {
        System.out.println(name + " плавает со скоростью -  " + speed + " км/ч");

    }

    @Override
    public void fly() {
        System.out.println(name + " может летать");
    }
}
