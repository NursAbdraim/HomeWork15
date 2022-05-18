package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {

        Animal attack1 = new Shark();
        Animal attack2 = new Shark();
        Animal attack3 = new Shark();
        Animal attack4 = new Shark();
        Animal attack5 = new Shark();

        Animal swim1 = new Turtle();
        Animal swim2 = new Turtle();
        Animal swim3 = new Turtle();
        Animal swim4 = new Turtle();
        Animal swim5 = new Turtle();

        Animal fly1 = new Eagle();
        Animal fly2 = new Eagle();
        Animal fly3 = new Eagle();
        Animal fly4 = new Eagle();
        Animal fly5 = new Eagle();

        Animal[] ability = {attack1, swim1, fly2, swim2,fly1, attack2,  swim3, attack3,fly3, fly4, swim4, attack4,
        attack5, swim5, fly5};

        int i = 0;
        for(Animal s : ability){
            if(s.getClass().getName() == "com.company.Shark") {
                ((Shark)s).attack();
            } else
                if (s.getClass().getName() == "com.company.Turtle"){
                    ((Turtle)s).swim();
                } else {
                    ((Eagle)s).fly();
                }
        }

        System.out.println("\n_______________________\n");

        Shark[] sharks = new Shark[5];
        Turtle[] turtles = new Turtle[5];
        Eagle[] eagles = new Eagle[5];
        int a = 0;
        int b = 0;
        int c = 0;

        for (Animal s : ability){
            if(s instanceof Shark){
                sharks[a] = (Shark)s;
                a++;
            } else if (s instanceof Turtle){
                turtles[b] = (Turtle)s;
                b++;
            } else {
                eagles[c] = (Eagle)s;
                c++;
            }
        }

        for (Shark shark1 : sharks)
            shark1.attack();

        for (Turtle turtle1 : turtles)
            turtle1.swim();

        for (Eagle eagle1 : eagles)
            eagle1.fly();

    }
}
