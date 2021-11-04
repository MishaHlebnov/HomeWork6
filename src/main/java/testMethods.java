 public class testMethods  {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Тайсон");
        Dog dog2 = new Dog("Бабака");
        Cat cat1 = new Cat("Муся");
        dog2.run(40);
        dog1.run(0);
        cat1.run(300);
        dog1.swim(5);
        cat1.swim(10);
    }
}
