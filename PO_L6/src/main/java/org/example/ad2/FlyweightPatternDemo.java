package org.example.ad2;

public class FlyweightPatternDemo {
    private static final String colors[] = {"Blue", "Black", "Green", "White", "Purple"};

    public static void main(String[] args) {

        for (int i=0; i<20; i++){
            Jeans jeans = (Jeans) TrousersFactory.getJeans(getRandomColor());
            jeans.setSize(getRandomSize());
            jeans.sewing();
        }
    }
    private static String getRandomColor(){
        return colors[(int) (Math.random()*colors.length)];
    }
    private static int getRandomSize(){
        return (int) (Math.random()*100);
    }
}
