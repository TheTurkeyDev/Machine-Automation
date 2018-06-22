package com.theprogrammingturkey.machineautomation.recipes;

import java.util.List;

import net.minecraft.item.ItemStack;

public interface IRecipeBase
{

	public ItemStack[] getInputs();
	
	public ItemStack[] getResults();
	
	public boolean canProcess(List<ItemStack> inputs);
}
