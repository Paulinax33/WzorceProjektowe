package org.example.ad3;

public class Reader implements Observer{

    private Library library;
    private String book;

    public Reader(Library library) {
        this.library = library;
        book = library.getBook();
    }

    @Override
    public void update() {
        book = library.getBook();
        System.out.println("Information: " + book);
    }
}
