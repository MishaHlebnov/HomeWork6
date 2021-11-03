class Cat extends Animal {
    private String color;

    public Cat(String name) {
        this.name = name;
    }

     void catInfo(String name) {
        System.out.println("Кот имя: "  + name + " цвет: " + color);
    }
     void catRun (int length) {
        super.run();
        int res = 200;
        if (length > res ) System.out.println("Кот(кошка) не станет бежать такую дистанцию.");
        else if (length < 0) System.out.println(name + " смотрит с презрением 0_0");
        else if (length <= res) System.out.println("Кот(кошка) по кличке" + name +
                " по своей воле пробежал(а) " + length + " метров");
    }

    void catSwim(int length) {
        System.out.println(name + " НЕ ПОПЛЫВЕТ");

    }
}

