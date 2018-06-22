package com.theprogrammingturkey.machineautomation.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MAItems
{

	@SubscribeEvent
	public void onItemRegistry(RegistryEvent.Register<Item> e)
	{
		
	}
	
	public static void registerItems()
	{
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	}
}
