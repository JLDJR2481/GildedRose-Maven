package edu.craptocraft.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class SulfurasTest {

    @Test
    public void crearSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);

        assertEquals("Sulfuras, Hand of Ragnaros", sulfuras.getName(), 0);
        assertEquals(0, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }

    @Test
    public void toStringTest() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);

        System.out.println("toString() Sulfuras test:");
        System.out.println(sulfuras.toStrin());
    }

    @Test
    public void updateQualitySulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80);
        sulfuras.updateQuality();

        assertEquals(0, sulfuras.getSell_in(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
