package com.randomdude.rm.blocks.casing;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;



public class casing_steam extends Block
{
    public casing_steam()
    {
        super(new Material(MapColor.ORANGE_STAINED_HARDENED_CLAY));
        setHardness(5);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHarvestLevel("Wrench", 2);
        setRegistryName("casing_steam");
        setTranslationKey("casing_steam");



    }
}
