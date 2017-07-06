package com.hamstern.animusmod.proxy;

import com.hamstern.animusmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Hamstern on 2017-07-06.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        ModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
