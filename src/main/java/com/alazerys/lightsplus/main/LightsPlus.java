package com.alazerys.lightsplus.main;

import com.alazerys.lightsplus.init.LPBlocks;
import com.alazerys.lightsplus.init.LPCrafting;
import com.alazerys.lightsplus.init.LPTab;
import com.alazerys.lightsplus.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class LightsPlus {

    @Instance
    public static LightsPlus instance = new LightsPlus();
    
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs tabLP = new LPTab("tabLP");


	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		
		LPBlocks.init();
		LPBlocks.register();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		
		// Crafting Recipes
		LPCrafting.register();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}