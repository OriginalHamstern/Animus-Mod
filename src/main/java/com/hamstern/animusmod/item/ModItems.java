package com.hamstern.animusmod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.hamstern.animusmod.AnimusMod;

/**
 * Created by Hamstern on 2017-07-06.
 */
public class ModItems
{
    public static Item CagedAnimus;
    public static Item CagedZarbi;
    public static Item CagedLarvaeGun;


    public static void preInit()
    {
        CagedAnimus = new Item().setUnlocalizedName("animus_caged").setCreativeTab(AnimusMod.creativeTab);
        CagedZarbi = new Item().setUnlocalizedName("zarbi_caged").setCreativeTab(AnimusMod.creativeTab);
        CagedLarvaeGun = new Item().setUnlocalizedName("larvae_gun_caged").setCreativeTab(AnimusMod.creativeTab);

        registerItems();

    }

    public static void registerItems()
    {
        GameRegistry.register(CagedAnimus, new ResourceLocation(AnimusMod.MODID, "animus_caged"));
        GameRegistry.register(CagedZarbi, new ResourceLocation(AnimusMod.MODID, "zarbi_caged"));
        GameRegistry.register(CagedLarvaeGun, new ResourceLocation(AnimusMod.MODID, "larvae_gun_caged"));
    }

    public static void registerRenders()
    {
        registerRender(CagedAnimus);
        registerRender(CagedZarbi);
        registerRender(CagedLarvaeGun);
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(AnimusMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}

