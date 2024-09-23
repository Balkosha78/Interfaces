public class Main {
    public static void main(String[] args) {
        Human human = new Human("Михаил", 32);
        Fish fish = new Fish("(Exocoetidae) Летучая рыба", 5, 16);
        Bird bird = new Bird("Лебедь", 20, 70);
        System.out.println("______________________________________________________");
        human.swim();
        human.fly();
        System.out.println("______________________________________________________");
        fish.swim();
        fish.fly();
        System.out.println("______________________________________________________");
        bird.swim();
        bird.fly();
    }
}