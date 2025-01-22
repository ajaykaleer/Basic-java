package org.example;

public class Main {
    public static void main(String[] args) {
        person p1 =new person();
        p1.age=24;
        p1.name="John";

        person p2=new person();
        p2.age=25;
        p2.name="Jane";
       // System.out.println(p1.age+" "+p1.name);
       // System.out.println(p2.age+" "+p2.name);

       // p1.eat();
       // p2.walk();
        p2.walk();


    }
}




public  person(int newAge,String newName) {
    name=newName;
    age=newAge;
    int age;

    void walk(){
        System.out.println(name+" is walking");

    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int step){
        System.out.println(name+" is walking "+step);

    }
}