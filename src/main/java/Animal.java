public class Animal {
    protected String name;
    public static int COUNT;

    public Animal(String name){
        this.name = name;
        COUNT++;
        System.out.println("Создано " + COUNT + "е животное");
    }

    public Animal() {
    }

    public void run(int distation) {
        System.out.println(name + " пробежал " + distation + " м.");
    }

    public void swim(int distation) {
        System.out.println(name + " проплыл " + distation + " м.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}