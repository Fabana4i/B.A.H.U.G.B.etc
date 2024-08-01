package net.pillk.armors.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup MOLLE = new ItemGroup("Molle")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItem.SARMAT.get());
        }
    };

    public static final ItemGroup MISC = new ItemGroup("misc")
     {
        @Override
       public ItemStack createIcon()
        {
         return new ItemStack(ModItem.ARMOR_PLATE.get());
       }
    };
}
