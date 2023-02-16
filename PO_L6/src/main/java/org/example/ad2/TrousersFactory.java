package org.example.ad2;

import java.util.HashMap;

public class TrousersFactory {
    private static final HashMap<String, Trousers> jeansMap = new HashMap<>();

    public static Trousers getJeans(String color){
        Jeans jeans = (Jeans) jeansMap.get(color);
        if (jeans== null){
            jeans = new Jeans(color);
            jeansMap.put(color,jeans);
            System.out.println("Creating jeans of color: "+ color);
            }
        return jeans;
        }
    }

