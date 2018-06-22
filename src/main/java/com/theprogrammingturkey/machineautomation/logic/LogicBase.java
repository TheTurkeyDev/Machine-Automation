package com.theprogrammingturkey.machineautomation.logic;

import java.util.ArrayList;
import java.util.List;

import com.theprogrammingturkey.machineautomation.recipes.IRecipeBase;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import scala.actors.threadpool.Arrays;

public abstract class LogicBase
{
	private BlockPos worldBlock;
	private List<ItemStack> inputs = new ArrayList<>();
	private List<ItemStack> results = new ArrayList<>();
	private IRecipeBase recipe;
	private int ticksLeft;

	public void tick()
	{
		if(ticksLeft == 0)
		{
			updateResults();
			updateInputs();
		}
		ticksLeft--;
	}

	private void updateInputs()
	{
		boolean canProcess = true;
		List<ItemStack> ingredients = new ArrayList<>();
		for(ItemStack rStack : recipe.getInputs())
		{
			for(ItemStack iStack : recipe.getInputs())
			{
			}
		}

		if(canProcess)
		{
			for(int i = 0; i < ingredients.size(); i++)
			{

			}
		}
	}

	@SuppressWarnings("unchecked")
	private void updateResults()
	{
		results.addAll(Arrays.asList(recipe.getResults()));
	}

	public String getTimeLeft()
	{
		return String.format("%.1f", ticksLeft / 20d);
	}

	public boolean canInsertItem(ItemStack stackIn)
	{
		for(ItemStack stack : recipe.getInputs())
			if(stack.isItemEqual(stackIn))
				return true;
		return false;
	}
}
