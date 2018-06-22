package com.theprogrammingturkey.machineautomation.recipes;

import java.util.List;

import net.minecraft.item.ItemStack;

public class PulverizerRecipe implements IRecipeBase
{
	private ItemStack input;
	private ItemStack output;

	public PulverizerRecipe(ItemStack input, ItemStack output)
	{
		this.input = input;
		this.output = output;
	}

	@Override
	public ItemStack[] getInputs()
	{
		return new ItemStack[] { input.copy() };
	}

	@Override
	public ItemStack[] getResults()
	{
		return new ItemStack[] { output.copy() };
	}

	@Override
	public boolean canProcess(List<ItemStack> inputs)
	{
		for(ItemStack stack : inputs)
			if(ItemStack.areItemStacksEqual(stack, input))
				return true;
		return false;
	}
}
