public class Animal {
    String name;
    int res;
    int resS;

    public Animal(String name) {
        this.name = name;
    }

    public void run(double length) {
        System.out.println();
        System.out.println("Животное бежит");
        if (length > res) System.out.println(name + " не может пробежать такую дистанцию.");
        else if (length <= 0) System.out.println(name + " осуждающе смотрит -_-");
        else if (length <= res) System.out.println(name + " пробежал(a) " + length + " метров");
    }

    public void swim(double length) {
        System.out.println();
        System.out.println("Животное плывет");
        if (length > resS) System.out.println(name + " не может проплыть такую дистанцию.");
        else if (length <= 0) System.out.println(name + " осуждающе смотрит -_-");
        else if (length <= resS) System.out.println(name + " проплыл(a) " + length + " метров");
    }
}