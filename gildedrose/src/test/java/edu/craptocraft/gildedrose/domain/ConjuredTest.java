package edu.craptocraft.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConjuredTest {

    @Test
    public void crearConjured() {

        Conjured conjured = new Conjured("Conjured Sword", 3, 6);

        assertEquals("Conjured Sword", conjured.getName());
        assertEquals(3, conjured.getSell_in(), 0);
        assertEquals(6, conjured.getQuality(), 0);
    }

    @Test
    public void toStringTest() {

        Conjured conjured = new Conjured("Conjured Sword", 3, 6);

        System.out.println("toString() Conjured test:");
        System.out.println(conjured.toString());

    }

    @Test
    public void updateQualityConjured() {

        Conjured conjured = new Conjured("Conjured Sword", 3, 6);
        conjured.updateQuality();

        assertEquals(2, conjured.getSell_in(), 0);
        assertEquals(4, conjured.getQuality(), 0);

    }

    @Test
    public void updateQualityConjuredJustExpired() {

        Conjured conjured = new Conjured("Conjured Sword", 0, 6);
        conjured.updateQuality();

        assertEquals(-1, conjured.getSell_in(), 0);
        assertEquals(2, conjured.getQuality(), 0);
    }

    @Test
    public void updateQualityConjuredExpired() {

        Conjured conjured = new Conjured("Conjured Sword", -1, 6);
        conjured.updateQuality();

        assertEquals(-2, conjured.getSell_in(), 0);
        assertEquals(2, conjured.getQuality(), 0);
    }

    @Test
    public void qualityMinZERO() {

        Conjured conjured = new Conjured("Conjured Sword", 1, 1);
        conjured.updateQuality();

        assertEquals(0, conjured.getSell_in(), 0);
        assertEquals(0, conjured.getQuality(), 0);

        conjured = new Conjured("Conjured Sword", -1, 0);
        conjured.updateQuality();

        assertEquals(-2, conjured.getSell_in(), 0);
        assertEquals(0, conjured.getQuality(), 0);
    }

}
