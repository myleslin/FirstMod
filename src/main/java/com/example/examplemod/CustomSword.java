package com.example.examplemod;

import handlers.SoundFXHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundEvent;

public class CustomSword extends ItemSword
{
	public CustomSword() 
	{
		super(ExampleMod.weaponMaterial);
		this.setUnlocalizedName("my_sword");
		this.setRegistryName("my_sword");
		this.setCreativeTab(CreativeTabs.COMBAT);
		
	}
	
	protected SoundEvent getHitSound() 
	{
		return SoundFXHandler.ENTITY_DISCIPLINE_HIT;
	}
	

}
