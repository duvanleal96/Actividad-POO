package com.sofka.software;

/**
 * clase ejecucion
 */
public class Main {
    static Cat c = new Cat();
    static Dog d = new Dog();
    static Message m = new Message();

    public static void main(String[] args) {
        init();
    }
    public static void init(){
        c.maullar();
        m.catAction();
        d.ladrar();
        m.dogAction();
    }


}