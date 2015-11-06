package com.alazerys.lightsplus.block;

import java.util.Random;

import com.alazerys.lightsplus.init.LPBlocks;
import com.alazerys.lightsplus.main.LightsPlus;
import com.alazerys.lightsplus.main.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.world.World;

public class LampBirch extends Block {
	
	private final boolean isOn;

	public LampBirch(boolean isOn) {
		super(Material.redstoneLight);
		
		this.isOn = isOn;
		this.setBlockName("lamp_birch_off");
		this.setHardness(0.3F);
		
		if (isOn)
			this.setLightLevel(1.0F);
		}
	
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + (this.isOn ? "lamp_birch_on" : "lamp_birch_off"));
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
	
		if (!world.isRemote) {
			if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}
			else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlock(x, y, z, LPBlocks.lamp_birch_on, 0, 2);
			}
		}
	}
	
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		
		if (!world.isRemote) {
			if (this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}
			else if (!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)) {
				world.setBlock(x, y, z, LPBlocks.lamp_birch_on, 0, 2);
			}
		}
	}
	
	public void updateTick(World world, int x, int y, int z, Random rand) {
		
		if (!world.isRemote && this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)) {
			world.setBlock(x, y, z, LPBlocks.lamp_birch_off, 0, 2);
		}
	}
	
	public Item getItemDropped(int i, Random rand, int j) {
		return Item.getItemFromBlock(LPBlocks.lamp_birch_off);
		
	}
	
	protected ItemStack createStackedBlock(int i) {
		return new ItemStack(LPBlocks.lamp_birch_off);
	}
	
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(LPBlocks.lamp_birch_off);
    }
	
}
