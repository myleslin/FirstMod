package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "tool";
    public static final String NAME = "Myles's Modpack";
    public static final String VERSION = "1.0";

    private static Logger logger;
    
    public static ToolMaterial weaponMaterial;
    public static Item disciplineWeapon;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        weaponMaterial = EnumHelper.addToolMaterial("Discipline", 0, 1, 0, 1333, 0); // addToolMaterial(name, harvestLvl, durability (uses), efficiency, dmg(+=4) , enchantability)
        disciplineWeapon = new CustomSword();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        CommonProxy.initRegeistries();
    } 
}
