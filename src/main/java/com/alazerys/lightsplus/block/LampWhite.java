package com.alazerys.lightsplus.block;

import java.util.Random;

import com.alazerys.lightsplus.init.LPBlocks;
import com.alazerys.lightsplus.main.LightsPlus;
import com.alazerys.lightsplus.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LampWhite extends Block {
	
	private final boolean isOn;

	public LampWhite(boolean isOn) {
		super(Material.redstoneLight);
		
		this.isOn = isOn;
		this.setBlockName("lamp_white_off");
		
		if (isOn)
			this.setLightLevel(1.0F);
		}
	
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isOn ? "lamp_white_on" : "lamp_white_off"));
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
	
		if (!world.isRemote) {
			if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}
			else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlock(x, y, z, LPBlocks.lamp_white_on, 0, 2);
			}
		}
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		
		if (!world.isRemote) {
			if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}
			else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlock(x, y, z, LPBlocks.lamp_white_on, 0, 2);
			}
		}
	}
	
	public void updateTick(World world, int x, int y, int z, Random rand) {
		
		if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
			world.setBlock(x, y, z, LPBlocks.lamp_white_off, 0, 2);
		}
	}
	
	public Item getItemDropped(int i, Random rand, int j) {
		return Item.getItemFromBlock(LPBlocks.lamp_white_off);
		
	}
	
	protected ItemStack createStackedBlock(int i) {
		return new ItemStack(LPBlocks.lamp_white_off);
	}
}
