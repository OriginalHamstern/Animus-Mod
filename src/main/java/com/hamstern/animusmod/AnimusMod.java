package com.hamstern.animusmod;

import com.hamstern.animusmod.item.ModItems;
import com.hamstern.animusmod.support.AnimusCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.hamstern.animusmod.proxy.CommonProxy;

/**
 * Created by Hamstern on 2017-07-06.
 */

@Mod(modid = AnimusMod.MODID, version = AnimusMod.VERSION, name = AnimusMod.Name)
public class AnimusMod
{
    public static final String MODID = "animusmod";
    public static final String VERSION = "1.0";
    public static final String Name = "Animus Mod";

    @SidedProxy(clientSide = "com.hamstern.animusmod.proxy.ClientProxy", serverSide = "com.hamstern.animusmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static AnimusMod instance;

    public static AnimusCreativeTab creativeTab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        creativeTab = new AnimusCreativeTab(CreativeTabs.getNextID(), "animus");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
