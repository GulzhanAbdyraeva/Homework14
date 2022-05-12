package com.company;

public class Main {

    public static void main(String[] args) {
          Programmer prog = new Programmer("Leo", "manager", "Google");
          System.out.println(prog);
          prog.coding();
          prog.learn();
          prog.walk();
          prog.eat();

          Singer singer = new Singer("Gulzhan","singing","Crazy love");
          System.out.println(singer);
          singer.learn();
          singer.walk();
          singer.eat();
          singer.singing();
          Dancer dancer = new Dancer("Lora", "dancer", "Trouble");
          System.out.println(dancer);
          dancer.dancing();
          dancer.eat();
          dancer.learn();
          dancer.walk();

        }

    }
