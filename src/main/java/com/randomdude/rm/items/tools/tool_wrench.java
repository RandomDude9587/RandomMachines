package com.randomdude.rm.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tool_wrench extends Item {
    public tool_wrench() {
        setCreativeTab(CreativeTabs.TOOLS);
        setMaxStackSize(1);
        setHarvestLevel("Wrench", 3);
        setRegistryName("tool_wrench");
        setTranslationKey("tool_wrench");

    }
}
