package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Котик"));
        animals.add(new Dog("Пёсель"));
        animals.add(new Crocodile("Гена"));
        animals.add(new Duck("Скрудж"));
        animals.add(new Fish("Селёдка"));
        animals.add(new Whale("Контик"));

        for (Animal a:animals)a.toGo();
        System.out.println();

        for (Animal b:animals)b.fly();
        System.out.println();

        for (Animal c:animals)c.swim();
        System.out.println();
    }
}
