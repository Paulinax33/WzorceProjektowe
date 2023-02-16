package org.example.ad2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyweightPatternTest {
    @Test
    public void testFlyweightPatternTest(){
        TrousersFactory trousersFactory = new TrousersFactory();
        Trousers jeans1 = trousersFactory.getJeans("Black");
        Trousers jeans2 = trousersFactory.getJeans("Black");

        assertEquals(jeans1,jeans2);
    }
}
