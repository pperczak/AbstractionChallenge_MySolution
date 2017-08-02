package com.company;

public class Main {

    public static void main(String[] args) {

        ConcreteListItem concreteelem_01 = new ConcreteListItem(5.55);
        System.out.println(concreteelem_01);

        ConcreteListItem concreteelem_02 = new ConcreteListItem(6.66);
        System.out.println(concreteelem_02);

        //concreteelem_01.setNext(concreteelem_02);
        concreteelem_02.setPrevious(concreteelem_01);

        System.out.println(concreteelem_01);
        System.out.println(concreteelem_02);



    }
}
