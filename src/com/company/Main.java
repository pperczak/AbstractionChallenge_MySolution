package com.company;

public class Main {

    public static void main(String[] args) {

        ConcreteListItem concreteelem_01 = new ConcreteListItem(5.55);
        System.out.println(concreteelem_01);

        ConcreteListItem concreteelem_02 = new ConcreteListItem(6.66);
        System.out.println(concreteelem_02);

        concreteelem_01.setNext(concreteelem_02);
        concreteelem_02.setPrevious(concreteelem_01);

        System.out.println("current item: "+concreteelem_01.getElement()+ " next elem: " + concreteelem_01.getNext().getElement());// + " " + concreteelem_01.getPrevious().getElement());


        ConcreteListItem concreteelem_03 = new ConcreteListItem(2.22);
        System.out.println(concreteelem_03);

        concreteelem_02.setNext(concreteelem_03);
        concreteelem_03.setPrevious(concreteelem_02);
        System.out.println("current item: "+concreteelem_02.getElement()+ " next elem: " + concreteelem_02.getNext().getElement() + " prev item: " + concreteelem_02.getPrevious().getElement());
        System.out.println("current item: "+concreteelem_03.getElement()+ " prev item: " + concreteelem_03.getPrevious().getElement());

        System.out.println(concreteelem_01.compareTo(concreteelem_01));
        System.out.println(concreteelem_01.compareTo(concreteelem_02));
        System.out.println(concreteelem_01.compareTo(concreteelem_03));

        printListElements(concreteelem_01);



    }
    public static void printListElements(ListItem itemToPrint) {

        boolean isEmpty = false;
        while (!isEmpty) {

            if (itemToPrint != null) {
                System.out.println(itemToPrint.getElement());
                itemToPrint = itemToPrint.getNext();
            }else isEmpty=true;


        }
    }
}
