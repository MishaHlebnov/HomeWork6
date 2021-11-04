class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.res = 500;
        this.resS = 10;
    }

    public void dogInfo(String name) {
        System.out.println("Собака: " + name);
    }
}
