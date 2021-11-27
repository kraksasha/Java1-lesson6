public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Тимофей");
        Cat cat2 = new Cat("Мурзик");
        Dog dog1 = new Dog("Серый");
        Dog dog2 = new Dog("Тато");
        Animal animal = new Animal("Вовка");

        cat1.run(120);
        dog1.run(130);
        cat1.swim(20);
        dog1.swim(6);
    }
}
