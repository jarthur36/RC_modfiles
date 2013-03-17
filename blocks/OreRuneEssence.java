package mods.runecraft.blocks;

import java.util.Random;

import mods.runecraft.Runecraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class OreRuneEssence extends BlockOre {

	public OreRuneEssence(int par1) {
		super(par1);
		setHardness(1.0F);
		setCreativeTab(CreativeTabs.tabBlock);
		
	}

	public int idDropped(int par1, Random random, int zero) {
        int rand = random.nextInt(50);
        if(rand>1){		
		return Runecraft.runeEssence.itemID;
        }
        else
        {
        return Runecraft.pureEssence.itemID;	
        }
        }
	
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(5);
    }
    
    public void func_94332_a(IconRegister par1IconRegister)
    {
             this.field_94336_cN = par1IconRegister.func_94245_a("runecraft:oreRuneEssence");
    }
}
