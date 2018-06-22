package com.theprogrammingturkey.machineautomation;

import org.apache.logging.log4j.Logger;

import com.theprogrammingturkey.machineautomation.blocks.MABlocks;
import com.theprogrammingturkey.machineautomation.items.MAItems;
import com.theprogrammingturkey.machineautomation.proxy.CommonProxy;
import com.theprogrammingturkey.machineautomation.util.MARecipies;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MACore.MODID, version = MACore.VERSION, name = MACore.NAME, guiFactory = "chanceCubes.config.ConfigGuiFactory")
public class MACore
{
	public static final String MODID = "chancecubes";
	public static final String VERSION = "@VERSION@";
	public static final String NAME = "Chance Cubes";

	@Instance(value = MODID)
	public static MACore instance;
	@SidedProxy(clientSide = "chanceCubes.proxy.ClientProxy", serverSide = "chanceCubes.proxy.CommonProxy")
	public static CommonProxy proxy;
	public static CreativeTabs modTab = new CreativeTabs(MODID)
	{
		public ItemStack getTabIconItem()
		{
			return new ItemStack(Blocks.FURNACE);
		}
	};
	public static Logger logger;

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MARecipies.loadRecipies();

		if(event.getSide() == Side.CLIENT)
		{
			MAItems.registerItems();
			MABlocks.registerBlocksItems();
		}

		proxy.registerRenderings();
	}

	@EventHandler
	public void load(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
		
		proxy.registerEvents();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
