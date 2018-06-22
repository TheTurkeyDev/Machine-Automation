package com.theprogrammingturkey.machineautomation.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class ClientProxy extends CommonProxy
{

	@Override
	public boolean isClient()
	{
		return true;
	}

	public void registerRenderings()
	{
		
	}

	public void registerEvents()
	{
		super.registerEvents();
	}

	@Override
	public EntityPlayer getClientPlayer()
	{
		return Minecraft.getMinecraft().player;
	}
}
