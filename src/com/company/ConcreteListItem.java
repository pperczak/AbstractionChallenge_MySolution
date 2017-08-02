package com.company;

/**
 * Created by PLPK on 02.08.2017.
 */
public class ConcreteListItem extends ListItem {

    public ConcreteListItem(Double element) {
        super(element);
    }

    public ConcreteListItem(Double element, ListItem next) {
        super(element, next);
    }

    public ConcreteListItem(Double element, ListItem next, ListItem previous) {
        super(element, next, previous);
    }

    @Override
    public void setNextItem(ListItem item) {

    }

    @Override
    public void setPreviousItem(ListItem item) {

    }

    @Override
    public void moveToNextItem() {

    }

    @Override
    public void moveToPreviousItem() {

    }


}
