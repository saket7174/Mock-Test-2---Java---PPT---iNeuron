package com.assignment;
//1.  Create a superclass called Animal with a method makeSound()
//  that prints the sound made by the animal. Implement subclasses 
// Dog, Cat, and Cow that inherit from the Animal class. Implement the makeSound() method
//  in each subclass to print the sound made by a dog, cat, and cow, respectively.
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow moos");
    }
}

public class One {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // animal.makeSound();  // Output: The animal makes a sound

        // Dog dog = new Dog();
        // dog.makeSound();     // Output: The dog barks

        // Cat cat = new Cat();
        // cat.makeSound();     // Output: The cat meows

        // Cow cow = new Cow();
        // cow.makeSound();     // Output: The cow moos

        Animal one = new Dog();
        one.makeSound();
        Animal two = new Cat();
         two.makeSound();
        Animal three = new Cow();
         three.makeSound();
    }
}



