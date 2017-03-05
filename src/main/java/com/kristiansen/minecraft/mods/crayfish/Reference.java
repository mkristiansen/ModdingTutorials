package com.kristiansen.minecraft.mods.crayfish;

/**
 * Created by ieu94897 on 01/03/2017.
 */
public class Reference {

    public static final String MOD_ID = "ktm1";
    public static final String NAME = "Kristiansense first MineCraft Mod";
    public static final String VERSION = "0.1.0";
    public static final String ACCEPTED_VERSIONS = "[1.9.4]";

    public static final String CLIENT_PROXY_CLASS = "com.kristiansen.minecraft.mods.crayfish.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.kristiansen.minecraft.mods.crayfish.proxy.ServerProxy";

    public static enum TutorialItems {

        CHEESE("cheese", "ItemCheese");

        private String unlocalizedName;
        private String registryName;

        TutorialItems (String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}
