class testMethods extends Animal{
    public testMethods(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Бублик");
        Dog dog2 = new Dog("Бабака");
        Cat cat1 = new Cat("Муся");
        cat1.catSwim(2);
        dog2.dogRun(200);
        dog2.dogSwim(10);
        dog1.dogRun(100);
    }
}
