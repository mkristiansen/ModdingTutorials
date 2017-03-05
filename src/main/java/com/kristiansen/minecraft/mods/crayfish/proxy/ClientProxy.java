package com.kristiansen.minecraft.mods.crayfish.proxy;

import com.kristiansen.minecraft.mods.crayfish.init.ModItems;

/**
 * Created by ieu94897 on 01/03/2017.
 */
public class ClientProxy implements CommonProxy {

    @Override
    public void init() {

        ModItems.registerRenders();
    }
}
