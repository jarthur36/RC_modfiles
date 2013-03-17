package mods.runecraft;

import mods.runecraft.blocks.*;
import mods.runecraft.items.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Runecraft", name = "Runecraft", version = "1.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Runecraft {
	
	public static RCWorldGenerator worldGen = new RCWorldGenerator();
	public final static Item pureEssence = new ItemPureEssence(5000).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("pureEssence");
	public final static Item runeEssence = new ItemRuneEssence(5001).setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("runeEssence");
	public final static Item waterRune = new ItemRune(5002,"waterRune").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("waterRune");
	public final static Item earthRune = new ItemRune(5003,"earthRune").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("earthRune");
	public final static Item fireRune = new ItemRune(5004,"fireRune").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("fireRune");
	public final static Item airRune = new ItemRune(5005,"airRune").setMaxStackSize(64).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("airRune");
	public final static Block oreRuneEssence = new OreRuneEssence(500);
	public final static Block blockAltarWater = new BlockAltar(501, Material.iron,"AltarTopWater",waterRune).setUnlocalizedName("blockAltarWater");
	public final static Block blockAltarEarth = new BlockAltar(502, Material.iron,"AltarTopWater",earthRune).setUnlocalizedName("blockAltarEarth");
	public final static Block blockAltarFire = new BlockAltar(503, Material.iron, "AltarTopWater",fireRune).setUnlocalizedName("blockAltarFire");
	public final static Block blockAltarAir = new BlockAltar(504, Material.iron, "AltarTopWater",airRune).setUnlocalizedName("blockAltarAir");
	
	//Instance
	@Instance("Runecraft")
    private static Runecraft instance;
	
	// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="mods.runecraft.client.ClientProxy", serverSide="mods.runecraft.CommonProxy")
    public static CommonProxy proxy;
        
    
    @Init
    public void load(FMLInitializationEvent evt)
    {
    	 proxy.registerRenderers();	
    	 GameRegistry.registerWorldGenerator(worldGen);
       	 GameRegistry.registerBlock(blockAltarWater, "blockAltarWater");
    	 GameRegistry.registerBlock(blockAltarEarth, "blockAltarEarth"); 
    	 GameRegistry.registerBlock(blockAltarFire, "blockAltarFire");
    	 GameRegistry.registerBlock(blockAltarAir, "blockAltarAir"); 
 		 GameRegistry.registerBlock(oreRuneEssence, "oreRuneEssence");
    	 MinecraftForge.setBlockHarvestLevel(oreRuneEssence, "pickaxe", 1);
    	 LanguageRegistry.addName(oreRuneEssence,"Rune Essence Ore");
         LanguageRegistry.addName(blockAltarWater,"Water Altar");
    	 LanguageRegistry.addName(blockAltarEarth, "Earth Altar"); 
    	 LanguageRegistry.addName(blockAltarFire, "Fire Altar");
    	 LanguageRegistry.addName(blockAltarAir, "Air Altar"); 
    	 LanguageRegistry.addName(runeEssence, "Rune Essence");
    	 LanguageRegistry.addName(pureEssence, "Pure Essence");
    	 LanguageRegistry.addName(waterRune, "Water Rune");
    	 LanguageRegistry.addName(earthRune, "Earth Rune");
    	 LanguageRegistry.addName(fireRune, "Fire Rune");
    	 LanguageRegistry.addName(airRune, "Air Rune");
    }
    

}

