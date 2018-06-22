package com.theprogrammingturkey.machineautomation.proxy;

import com.theprogrammingturkey.machineautomation.blocks.MABlocks;
import com.theprogrammingturkey.machineautomation.items.MAItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy
{

	public boolean isClient()
	{
		return false;
	}

	public void registerGuis()
	{

	}

	public void registerRenderings()
	{

	}

	public void registerEvents()
	{
		MinecraftForge.EVENT_BUS.register(new MABlocks());
		MinecraftForge.EVENT_BUS.register(new MAItems());
	}

	public EntityPlayer getClientPlayer()
	{
		return null;
	}
}
