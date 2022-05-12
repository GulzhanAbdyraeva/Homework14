package com.company;

public class Person {
    String name;
    String disignation;

    public Person(String name, String disighnation) {
        this.name = name;
        this.disignation = disighnation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisighnation() {
        return disignation;
    }

    public void setDisighnation(String disighnation) {
        this.disignation = disighnation;
    }

    public void learn(){
        System.out.println(name+" is learned "+ disignation);
    }
    public void walk(){
        System.out.println(name+" is walking every day");
    }
    public void eat(){
        System.out.println(name+" is eating sandwich.");
    }


    }

