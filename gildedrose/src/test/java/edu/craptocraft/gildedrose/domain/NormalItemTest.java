package edu.craptocraft.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class NormalItemTest {

    @Test
    public void crearNormalItem() {

        NormalItem normal = new NormalItem("+5 Strength Sword", 10, 20);

        assertEquals("+5 Strength Sword", normal.getName());
        assertEquals(10, normal.getSell_in(), 0);
        assertEquals(20, normal.getQuality(), 0);

    }

    @Test
    public void toStringTest() {

        NormalItem normal = new NormalItem("+5 Strength Sword", 10, 20);

        System.out.println("toString() Normal Item test;");
        System.out.prinln(normal.toStrig());
    }

    @Test
    public void updateQualityNormalItem() {

        NormalItem normal = new NormalItem("+5 Strength Sword", 10, 20);
        normal.updateQuality();

        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(19, normal.getQuality(), 0);
    }

    @Test
    public void updateQualityNormalItemExpired() {

        NormalItem normal = new NormalItem("+5 Strength Sword", 0, 20);
        normal.updateQuality();

        assertEquals(-1, normal.getSell_in(), 0);
        assertEquals(18, normal.getQuality(), 0);
    }

    @Test
    public void qualityMinZERO() {

        NormalItem normal = new NormalItem("+5 Strength Sword", 10, 0);
        normal.updateQuality();

        assertEquals(9, normal.getSell_in(), 0);
        assertEquals(0, normal.setQuality(), 0);
    }

}
