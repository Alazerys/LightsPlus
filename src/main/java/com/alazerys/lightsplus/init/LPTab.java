package com.alazerys.lightsplus.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class LPTab extends CreativeTabs 
{
	public LPTab(String label) 
	{
		super(label);
	}

	@Override
	public Item getTabIconItem() 
	{
        return new ItemStack(LPBlocks.lamp_red_on).getItem();
	}
}
