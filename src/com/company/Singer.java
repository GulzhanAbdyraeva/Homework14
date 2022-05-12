package com.company;

public class Singer extends Person {
    String groupName;
    public Singer(String name, String disighnation, String groupName) {
        super(name, disighnation);
        this.groupName = groupName;
    }
    public void singing(){
        System.out.println(name+" is singing in "+groupName+" group.");
    }

    @Override
    public void learn() {
        super.learn();
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
        return "Singer{" +
                "name='" + name + '\'' +
                ", disignation='" + disignation + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
