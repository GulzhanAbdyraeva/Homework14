package com.company;

public class Programmer extends Person {
    String companyName;
    public Programmer(String name, String disighnation, String companyName) {
        super(name, disighnation);
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println(name+" is working in "+companyName+" as "+disignation);
    }

    @Override
    public void learn() {
        super.learn();;
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", disignation='" + disignation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
