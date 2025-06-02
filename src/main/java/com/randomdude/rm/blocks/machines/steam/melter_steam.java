package com.randomdude.rm.blocks.machines.steam;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class melter_steam extends Block
{
    public melter_steam()
    {
        super(new Material(MapColor.ORANGE_STAINED_HARDENED_CLAY));
        setHardness(20);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHarvestLevel("ItemPickaxe", 3);
        setRegistryName("melter_steam");
    }
}
