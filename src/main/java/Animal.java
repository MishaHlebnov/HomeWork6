public class Animal {
    String name;

    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }
    void run() {
        System.out.println("Животное бежит");
    }
    void swim() {
        System.out.println("Животное плывет");
    }
}