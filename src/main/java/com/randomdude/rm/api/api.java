package com.randomdude.rm.api;

import com.randomdude.rm.Tags;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.model.Models;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.randomdude.rm.blocks.casing_c.STEAM_CASING;
import static com.randomdude.rm.blocks.machines_c.STEAM_MELTER;
import static com.randomdude.rm.items.item_blocks.STEAM_CASING_ITEM;
import static com.randomdude.rm.items.misc_c.STEAM_CORE;
import static com.randomdude.rm.items.tools_c.WRENCH;


@Mod(modid = Tags.MODID, version = Tags.VERSION, name = Tags.MODNAME, acceptedMinecraftVersions = "[1.12.2]")
public class api {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MODID);

    @EventHandler
    // preInit Run before anything else. Read your config, create blocks, items, etc. (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        // register to the event bus so that we can listen to events
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("I am " + Tags.MODNAME + " + at version " + Tags.VERSION);
        LOGGER.info("I... am Steve");

    }



    @SubscribeEvent
    // Register recipes here (Remove if not needed)
    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {

    }

    @SubscribeEvent
    // Register blocks here (Remove if not needed)
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(STEAM_CASING);
        event.getRegistry().register(STEAM_MELTER);
    }

    @SubscribeEvent
    // Register items here (Remove if not needed)
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(STEAM_CASING_ITEM);
        event.getRegistry().register(STEAM_CORE);
        event.getRegistry().register(WRENCH);

    }



    public void ModelLoader()
    {

    }



    @EventHandler
    // load "Do your mod setup. Build whatever data structures you care about." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        LOGGER.info(STEAM_CASING.getRegistryName());
        LOGGER.info("bacon");
        ModelLoader.setCustomModelResourceLocation(STEAM_CASING_ITEM, 1, new ModelResourceLocation("rm/models/items/casing_steam"));
    }

    @EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {

    }


}
