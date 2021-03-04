package com.example.examplemod;

import handlers.SoundFXHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy 
{
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ExampleMod.disciplineWeapon);
	}
	
	public static void registerRender(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event)
	{
		registerRender(ExampleMod.disciplineWeapon);
	}
	
	@SubscribeEvent
	public static void onHit(LivingHurtEvent event)
	{
		//if (event.getEntity()) - check if damaging tool was 'discipline' weapon
			if (!event.getEntity().getName().equals("TickityT0ck"))
			{
				event.setCanceled(true); //cancels dmg evnt
				// lightning strike on player(?)
			}
			else
			{
			// activate hitFX.ogg
			}
	}
	
	public static void initRegeistries()
	{
		SoundFXHandler.registerSounds();
	}
}
