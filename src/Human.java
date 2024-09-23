public class Human implements Swimmable, Flyable{
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public void swim() {
        System.out.println(name + " умеет плавать техникой брасс. ");
    }

    @Override
    public void fly() {
        System.out.println(name + " может летать на самолете");
    }
}
