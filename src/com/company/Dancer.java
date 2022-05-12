package com.company;

public class Dancer extends Person {
    String bandName;
    public Dancer(String name, String disighnation, String bandName) {
        super(name, disighnation);
        this.bandName = bandName;
    }
    public void dancing(){
        System.out.println(name+" is love dancing  in "+bandName+" group.");
    }
    public void playGitar(){
        System.out.println(name+" loves playing in guitar too!");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "bandName='" + bandName + '\'' +
                ", name='" + name + '\'' +
                ", disignation='" + disignation + '\'' +
                '}';
    }
}
