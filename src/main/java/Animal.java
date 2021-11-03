public class Animal {
    String name;
    public Animal () {
    }
    public Animal (String name) {
        this.name = name;
    }
    public void run (){
        System.out.println(name + " бежит");
    }
    public void swim (){
        System.out.println(name + " плывет");
    }

}
