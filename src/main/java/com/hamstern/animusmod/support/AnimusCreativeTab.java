package com.hamstern.animusmod.support;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Hamstern on 2017-07-06.
 */
public class AnimusCreativeTab extends CreativeTabs
{
    public AnimusCreativeTab(int index, String label)
    {
        super(index, label);
    }

    @Override
    public Item getTabIconItem()
    {
        return Items.STRING;

    }
}
