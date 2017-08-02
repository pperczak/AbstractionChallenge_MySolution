package com.company;

/**
 * Created by expo on 02.08.17.
 */
public class MyOwnLinkedList {
    private String listName;
    ListItem head;
    ListItem currentElement;
    int size;

    public MyOwnLinkedList(String listName) {
        this.listName = listName;
        head = null;
        currentElement = null;
        size = 0;
    }

    public boolean addItemToMyOwnLinkedList(ListItem item) {
        if (head == null) {
            head = item;
            currentElement = item;
            size +=1;
            return true;
        }else if (item.compareTo(currentElement)<0) {
            currentElement.setNext(item);
            item.setPrevious(currentElement);
            size+=1;
            currentElement = item;
        }else if (item.compareTo(currentElement)==0) {
            System.out.println("nie dodajemy do listy takich samych elelemtow!");
            return false;
        }else if (item.compareTo(currentElement)>0) {
            //
        }


    }
}
