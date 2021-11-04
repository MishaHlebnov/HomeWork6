class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.res = 200;
    }

    @Override
    public void swim(double length) {
        System.out.println();
        System.out.println("НЕ ДОЖДЕШЬСЯ");
        }

    public void catInfo(String name) {
        System.out.println("Кот " + name);
    }

}

