package com.alazerys.lightsplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class LPCrafting
{
	public static void register()
	{
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_black_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 15), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_blue_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 11), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_brown_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 12), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_cyan_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 9), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_gray_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 7), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_green_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 13), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_lightblue_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 3), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_lightgray_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 8), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_lime_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 5), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_magenta_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 2), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_orange_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 1), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_pink_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 6), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_purple_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 10), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_red_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 14), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_white_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 0), 'R', Items.redstone });
		GameRegistry.addShapedRecipe(new ItemStack(LPBlocks.lamp_yellow_off, 8), new Object[] { "GGG", "GRG", "GGG", 'G', new ItemStack(Blocks.stained_glass, 1, 4), 'R', Items.redstone });
	}
}
