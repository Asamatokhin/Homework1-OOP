package Homework1;

public class Whale extends Animal{
    public Whale(String name, String color) {
        super(name, color, 2);
    }

    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}
}
