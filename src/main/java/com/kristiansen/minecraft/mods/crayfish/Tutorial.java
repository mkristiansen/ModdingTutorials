/**
 * Created by ieu94897 on 01/03/2017.
 */

package com.kristiansen.minecraft.mods.crayfish;


import com.kristiansen.minecraft.mods.crayfish.init.ModItems;
import com.kristiansen.minecraft.mods.crayfish.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name=Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class Tutorial {

    @Instance
    public static Tutorial instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        System.out.println(" Pre Init ");

        ModItems.init();
        ModItems.register();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        System.out.println(" Init ");
        proxy.init();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(" Post Init ");
    }

}
