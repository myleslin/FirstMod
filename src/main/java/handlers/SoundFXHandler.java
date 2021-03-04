package handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundFXHandler 
{
	public static SoundEvent ENTITY_DISCIPLINE_HIT;
	
	public static void registerSounds()
	{
		ENTITY_DISCIPLINE_HIT = registerSound("entity.discipline.hitfx");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation("tool", name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
