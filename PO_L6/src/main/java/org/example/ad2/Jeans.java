package org.example.ad2;

public class Jeans implements Trousers{
    private String color;
    private int size;

    public Jeans(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void sewing() {
        System.out.println("Trousers: Sewing() [Color: "+ color + " size: "+ size);
    }
}
