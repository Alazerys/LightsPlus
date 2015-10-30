package com.alazerys.lightsplus.init;

import com.alazerys.lightsplus.block.LampBlack;
import com.alazerys.lightsplus.block.LampBlue;
import com.alazerys.lightsplus.block.LampBrown;
import com.alazerys.lightsplus.block.LampCyan;
import com.alazerys.lightsplus.block.LampGray;
import com.alazerys.lightsplus.block.LampGreen;
import com.alazerys.lightsplus.block.LampLightBlue;
import com.alazerys.lightsplus.block.LampLightGray;
import com.alazerys.lightsplus.block.LampLime;
import com.alazerys.lightsplus.block.LampMagenta;
import com.alazerys.lightsplus.block.LampOrange;
import com.alazerys.lightsplus.block.LampPink;
import com.alazerys.lightsplus.block.LampPurple;
import com.alazerys.lightsplus.block.LampRed;
import com.alazerys.lightsplus.block.LampWhite;
import com.alazerys.lightsplus.block.LampYellow;
import com.alazerys.lightsplus.main.LightsPlus;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class LPBlocks {
	
	//Lamps On
	public static Block lamp_white_on;
	public static Block lamp_orange_on;
	public static Block lamp_magenta_on;
	public static Block lamp_lightblue_on;
	public static Block lamp_yellow_on;
	public static Block lamp_lime_on;
	public static Block lamp_pink_on;
	public static Block lamp_gray_on;
	public static Block lamp_lightgray_on;
	public static Block lamp_cyan_on;
	public static Block lamp_purple_on;
	public static Block lamp_blue_on;
	public static Block lamp_brown_on;
	public static Block lamp_green_on;
	public static Block lamp_red_on;
	public static Block lamp_black_on;
	
	//Lamps Off
	public static Block lamp_white_off;
	public static Block lamp_orange_off;
	public static Block lamp_magenta_off;
	public static Block lamp_lightblue_off;
	public static Block lamp_yellow_off;
	public static Block lamp_lime_off;
	public static Block lamp_pink_off;
	public static Block lamp_gray_off;
	public static Block lamp_lightgray_off;
	public static Block lamp_cyan_off;
	public static Block lamp_purple_off;
	public static Block lamp_blue_off;
	public static Block lamp_brown_off;
	public static Block lamp_green_off;
	public static Block lamp_red_off;
	public static Block lamp_black_off;
	
	public static void init() {
		
		//Lamps On
		lamp_white_on = new LampWhite(true);
		lamp_orange_on = new LampOrange(true);
		lamp_magenta_on = new LampMagenta(true);
		lamp_lightblue_on = new LampLightBlue(true);
		lamp_yellow_on = new LampYellow(true);
		lamp_lime_on = new LampLime(true);
		lamp_pink_on = new LampPink(true);
		lamp_gray_on = new LampGray(true);
		lamp_lightgray_on = new LampLightGray(true);
		lamp_cyan_on = new LampCyan(true);
		lamp_purple_on = new LampPurple(true);
		lamp_blue_on = new LampBlue(true);
		lamp_brown_on = new LampBrown(true);
		lamp_green_on = new LampGreen(true);
		lamp_red_on = new LampRed(true);
		lamp_black_on = new LampBlack(true);
		
		//Lamps Off
		lamp_white_off = new LampWhite(false).setCreativeTab(LightsPlus.tabLP);
		lamp_orange_off = new LampOrange(false).setCreativeTab(LightsPlus.tabLP);
		lamp_magenta_off = new LampMagenta(false).setCreativeTab(LightsPlus.tabLP);
		lamp_lightblue_off = new LampLightBlue(false).setCreativeTab(LightsPlus.tabLP);
		lamp_yellow_off = new LampYellow(false).setCreativeTab(LightsPlus.tabLP);
		lamp_lime_off = new LampLime(false).setCreativeTab(LightsPlus.tabLP);
		lamp_pink_off = new LampPink(false).setCreativeTab(LightsPlus.tabLP);
		lamp_gray_off = new LampGray(false).setCreativeTab(LightsPlus.tabLP);
		lamp_lightgray_off = new LampLightGray(false).setCreativeTab(LightsPlus.tabLP);
		lamp_cyan_off = new LampCyan(false).setCreativeTab(LightsPlus.tabLP);
		lamp_purple_off = new LampPurple(false).setCreativeTab(LightsPlus.tabLP);
		lamp_blue_off = new LampBlue(false).setCreativeTab(LightsPlus.tabLP);
		lamp_brown_off = new LampBrown(false).setCreativeTab(LightsPlus.tabLP);
		lamp_green_off = new LampGreen(false).setCreativeTab(LightsPlus.tabLP);
		lamp_red_off = new LampRed(false).setCreativeTab(LightsPlus.tabLP);
		lamp_black_off = new LampBlack(false).setCreativeTab(LightsPlus.tabLP);
	}
	
	public static void register() {
		
		//Lamps On
		GameRegistry.registerBlock(lamp_white_on, "lamp_white_on");
		GameRegistry.registerBlock(lamp_orange_on, "lamp_orange_on");
		GameRegistry.registerBlock(lamp_magenta_on, "lamp_magenta_on");
		GameRegistry.registerBlock(lamp_lightblue_on, "lamp_lightblue_on");
		GameRegistry.registerBlock(lamp_yellow_on, "lamp_yellow_on");
		GameRegistry.registerBlock(lamp_lime_on, "lamp_lime_on");
		GameRegistry.registerBlock(lamp_pink_on, "lamp_pink_on");
		GameRegistry.registerBlock(lamp_gray_on, "lamp_gray_on");
		GameRegistry.registerBlock(lamp_lightgray_on, "lamp_lightgray_on");
		GameRegistry.registerBlock(lamp_cyan_on, "lamp_cyan_on");
		GameRegistry.registerBlock(lamp_purple_on, "lamp_purple_on");
		GameRegistry.registerBlock(lamp_blue_on, "lamp_blue_on");
		GameRegistry.registerBlock(lamp_brown_on, "lamp_brown_on");
		GameRegistry.registerBlock(lamp_green_on, "lamp_green_on");
		GameRegistry.registerBlock(lamp_red_on, "lamp_red_on");
		GameRegistry.registerBlock(lamp_black_on, "lamp_black_on");
		
		//Lamps Off
		GameRegistry.registerBlock(lamp_white_off, "lamp_white_off");
		GameRegistry.registerBlock(lamp_orange_off, "lamp_orange_off");
		GameRegistry.registerBlock(lamp_magenta_off, "lamp_magenta_off");
		GameRegistry.registerBlock(lamp_lightblue_off, "lamp_lightblue_off");
		GameRegistry.registerBlock(lamp_yellow_off, "lamp_yellow_off");
		GameRegistry.registerBlock(lamp_lime_off, "lamp_lime_off");
		GameRegistry.registerBlock(lamp_pink_off, "lamp_pink_off");
		GameRegistry.registerBlock(lamp_gray_off, "lamp_gray_off");
		GameRegistry.registerBlock(lamp_lightgray_off, "lamp_lightgray_off");
		GameRegistry.registerBlock(lamp_cyan_off, "lamp_cyan_off");
		GameRegistry.registerBlock(lamp_purple_off, "lamp_purple_off");
		GameRegistry.registerBlock(lamp_blue_off, "lamp_blue_off");
		GameRegistry.registerBlock(lamp_brown_off, "lamp_brown_off");
		GameRegistry.registerBlock(lamp_green_off, "lamp_green_off");
		GameRegistry.registerBlock(lamp_red_off, "lamp_red_off");
		GameRegistry.registerBlock(lamp_black_off, "lamp_black_off");
	}

}
