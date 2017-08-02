package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by PLPK on 02.08.2017.
 */
public abstract class ListItem {

    private Double element;
    private ListItem next;
    private ListItem previous;

    public Double getElement() {
        return element;
    }

    public void setElement(Double element) {
        this.element = element;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    public ListItem getPrevious() {
        return previous;
    }

    public void setPrevious(ListItem previous) {
        this.previous = previous;
    }

    public ListItem(Double element) {
        this.element = element;
    }

    public ListItem(Double element,ListItem next) {
        this.element = element;
                this.next = next;
    }

    public ListItem(Double element, ListItem next, ListItem previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

    public abstract void setNextItem(ListItem item);
    public abstract void setPreviousItem(ListItem item);

    public abstract void moveToNextItem();
    public abstract void moveToPreviousItem();

    public int compareTo(ListItem item) {
        if (item.element == this.element) {
            return 0;
        }else if (item.element > this.element) {
            return -1;
        }
        return 1;
    }


}
