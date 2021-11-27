public class Dog extends Animal{
    public static int COUNT;

    public Dog(String name) {
        this.name = name;
        COUNT++;
        System.out.println("Создан " + COUNT + "й пес");
    }

    @Override
    public void run(int distation) {
        if (distation <= 500){
            super.run(distation);
        } else {
            System.out.println(name + " столько не пробежит");
        }
    }

    @Override
    public void swim(int distation) {
        if (distation <= 10){
            super.swim(distation);
        } else {
            System.out.println(name + " столько не проплывет");
        }

    }
}
