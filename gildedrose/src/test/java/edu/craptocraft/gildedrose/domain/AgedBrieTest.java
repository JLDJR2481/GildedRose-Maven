package edu.craptocraft.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class AgedBrieTest {

    @Test
    public void crearAgedBrie() {

        AgedBrie queso = new AgedBrie("Aged Brie", 2, 0);

        assertEquals("Aged Brie", queso.getName());
        assertEquals(2, queso.getSell_in(), 0);
        assertEquals(0, queso.getQuality(), 0);
    }

    @Test
    public void toStringTest() {

        AgedBrie queso = new AgedBrie("Aged Brie", 2, 0);

        System.out.println("toString() Aged Brie test:");
        System.out.println(queso.toString());
    }

    @Test
    public void updateQualityBrie() {

        AgedBrie queso = new AgedBrie("Aged Brie", 2, 0);
        queso.updateQuality();

        assertEquals(1, queso.getSell_in(), 0);
        assertEquals(1, queso.getQuality(), 0);
    }

    @Test
    public void updateQualityBrieExpired() {

        AgedBrie queso = new AgedBrie("Aged Bire", 0, 0);
        queso.updateQuality();

        assertEquals(-1, queso.getSell_in(), 0);
        assertEquals(2, queso.getQuality(), 0);
    }

    @Test
    public void quality50() {

        AgedBrie queso = new AgedBrie("Aged Brie", -1, 50);
        queso.updateQuality();

        assertEquals(-2, queso.getSell_in(), 0);
        assertEquals(50, queso.getQuality(), 0);
    }
}
