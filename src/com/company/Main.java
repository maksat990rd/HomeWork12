package com.company;

public class Main {

    public static void main(String[] args) {
        /** Балык, Попугай, мышык жана ит деген класс тузунуз
         Алардын свойстваларын ойлоп табыныз
         Бир канча объектилерин тузуп жана аларга маанилерин бериниз
         Аларды консольго чыгарыныз
         Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек */

        Dog dog = new Dog();
        dog.setAge(12);
        dog.setName("Cezar");
        dog.setColor("Red");
        System.out.println("Dog is name's: " + dog.getName()+ "\nAge :" + dog.getAge() + " \nColor: " + dog.getColor());
        dog.dogsmethod(dog.getName());
        System.out.println();

        Cat cat = new Cat();
        cat.setName("Tigra");
        cat.setAge(8);
        cat.setColor("White");
        System.out.println("Cat is name's :" + cat.getName() + "\nAge :" + cat.getAge() + "\nColor :" + cat.getColor());
        cat.catmethod(cat.getName());
        System.out.println();

        Fish fish = new Fish();
        fish.setName("Molotoglav");
        fish.setAge(3);
        fish.setColor("Silver");
        System.out.println("Fish is name's :" + fish.getName() + "\nAge :" + fish.getAge() + "\nColor :" + fish.getColor());
        fish.fishmethod(fish.getName());
        System.out.println();

        Parrot parrot = new Parrot();
        parrot.setName("Ostriy kluf");
        parrot.setAge(5);
        parrot.setColor("Black");
        System.out.println("Parrot is name's :" + parrot.getName() + "\nAge :" + parrot.getAge() + "\nColor :" + parrot.getColor());
        parrot.Parrotmethod(parrot.getName());
    }
}
