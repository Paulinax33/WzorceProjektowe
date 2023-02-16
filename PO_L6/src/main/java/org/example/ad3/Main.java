package org.example.ad3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Reader reader = new Reader(library);

        library.addReader(reader);
        library.bookNew("New book: ");
    }
}