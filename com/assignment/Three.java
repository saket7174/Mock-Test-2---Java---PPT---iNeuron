package com.assignment;
// . Create a class called Person with private properties like name, age, and address.
//  Provide public getter and setter methods for these properties.
//   Write a program that creates an instance of the Person class, sets values for its properties using the 
//   setter methods, and displays the values using the getter methods.
class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Three {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("Ram");
        person.setAge(25);
        person.setAddress("77 Ranchi Jharkhand");

        // Get values using getter methods
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();

        // Display the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

