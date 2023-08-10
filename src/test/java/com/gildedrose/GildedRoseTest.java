package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("hhhh", -2, -3), new Item("Sulfuras, Hand of Ragnaros", 1, -1),
            new Item("Backstage passes to a TAFKAL80ETC concert", -2, 3), new Item("Aged Brie", 1, 3),
            new Item("Backstage passes to a TAFKAL80ETC concert", 20, 49), new Item("Aged Brie", -1, 50),
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49), new Item("Aged Brie", -1, 4),
            new Item("Backstage passes to a TAFKAL80ETC concert", 1, 66), new Item("hhh", 1, 4),
            new Item("hhhh", -2, 3), new Item("Sulfuras, Hand of Ragnaros", -2, -3)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Approvals.verifyAll("", items);

        //assertEquals("fixme", app.items[0].name);
    }

}
