package com.sstinson.tutorial.lesson2;

public class Person {

//    private Name personName;
//
//    public Person(Name personName) {
//        this.personName = personName;
//    }
    private static int personCounter;
    // Class level variable

    public Person(){
        personCounter++;
    }

    public String helloWorld(){
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
//    public Name name() {
//        return personName;
//    }
}
