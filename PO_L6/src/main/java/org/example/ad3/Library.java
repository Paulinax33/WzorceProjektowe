package org.example.ad3;

import java.util.HashSet;
import java.util.Set;

public class Library implements Observable{
    private String book;
    Set<Observer> readers = new HashSet<>();

    public String getBook() {
        return book;
    }

    @Override
    public void addReader(Observer observerR) {
        readers.add(observerR);
    }

    @Override
    public void removeReader(Observer observerR) {
        readers.remove(observerR);
    }

    @Override
    public void notifyReader() {
        readers.forEach(Observer::update);
    }
    public void bookNew(String book){
        this.book = book;
        notifyReader();
    }

}
