class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
    }

     public void dogInfo(String name) {
        System.out.println("Собака: " + name);
    }

    void dogRun (int length) {
        super.run();
        int res = 500;
        if (length > res ) System.out.println("Собака не может пробежать такую дистанцию.");
            else if (length < 0) System.out.println(name + " осуждающе смотрит -_-");
        else if (length <= res) System.out.println("Собака по кличке " + name + " пробежала " + length + " метров");
    }
    void dogSwim(int length) {
        super.swim();
        int res = 10;
        if (length > res ) System.out.println("Собака не может проплыть такую дистанцию.");
        else if (length < 0) System.out.println(name + " осуждающе смотрит -_-");
        else if (length <= res) System.out.println("Собака по кличке " + name + " проплыла " + length + " метров");

    }
}
