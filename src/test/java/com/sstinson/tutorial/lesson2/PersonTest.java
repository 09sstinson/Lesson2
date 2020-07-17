package com.sstinson.tutorial.lesson2;

import com.sstinson.tutorial.lesson10.LoggingLevel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    static final String[] STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};
    static final char TEST_CHAR = 'a';
    @Test
    public void shouldReturnHelloWorld(){

        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloSeamus(){
        Person person = new Person();
        assertEquals("Hello Seamus", person.hello("Seamus"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInLoop() {
        Person[] person = new Person[3];

        for(int i = 0; i < 3; i++){
            person[i] = new Person();
        }
        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void shouldReturnNumberOfPersonsInWhile() {
        int i = 0;
        Person[] person = new Person[3];

        while(i < 3){
            person[i] = new Person();
            i++;
        }
        assertEquals(3, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays() {
        Person[] persons = new Person[3];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        for(Person person : persons) {
            person.helloWorld();
        }
        persons[0] = null;
    }

    @Test
    public void demonstrateArraysBrace() {
        Person myPerson = new Person();
        Person[] persons = {null, myPerson, new Person()};
        Person vip = persons[2];
    }

    @Test
    public void demonstrateEnums() {
        Person[] persons = new Person[2];
        persons[0] = new Person();
        persons[1] = new Person();

        LoggingLevel state1 = LoggingLevel.PENDING;
        switch(state1){
            case PENDING:
                //someMethod();
                break;
            case PROCESSING:
                //falls through
            case PROCESSED:
                //callMethod();
            default:
                //throw an error
        }

        for(LoggingLevel state: LoggingLevel.values()){
            if(state == LoggingLevel.PENDING ){

            }
            if(state == LoggingLevel.PROCESSING){

            }
            if(state == LoggingLevel.PROCESSED){

            }
        }
    }

    @Test
    public void demonstrateBoolean() {
        int i = 4;
        int j = 3;
        boolean notEqual = i != j;
        int value;
        if(i > j){
            value = 2;
        } else if(j > i) {
            value = 3;
        } else {
            value = 4;
        }

        assertEquals(2,value);
    }

}
