package net.pillk.etc.item;

import net.minecraft.world.item.Item;

public class etcItem extends Item {

    public etcItem(Properties properties) {
        super(properties.stacksTo(1).fireResistant());
    }

    public etcItem() {
        this(new Properties());
    }
}
