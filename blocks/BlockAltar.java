package mods.runecraft.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.runecraft.Runecraft;
import mods.runecraft.items.ItemRune;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockAltar extends Block{
 
	private Item rune;
	private String texture;
	public BlockAltar(int par1, Material par2Material,String par3texture,Item runegiven) {
		super(par1, par2Material);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setLightValue(0.7F);
		rune = runegiven;
		texture = par3texture;
	}
	
	
		
	@SideOnly(Side.CLIENT)
	private Icon sides, bottom, top;
	
    @SideOnly(Side.CLIENT)
    public void func_94332_a(IconRegister par1IconRegister)
    {
            this.sides = par1IconRegister.func_94245_a("runecraft:AltarSide");
            this.bottom = par1IconRegister.func_94245_a("runecraft:"+texture);
            this.top = par1IconRegister.func_94245_a("runecraft:"+texture);
    }
    
    @SideOnly(Side.CLIENT)
    public Icon getBlockTextureFromSideAndMetadata(int i, int j)
    {
            if (i == 0)
            {
                    return bottom;
            }
            if (i == 1)
            {
                    return top;
            }
            else
            {
                    return sides;
            }
    }
    
    public int idDropped(int par1, Random random, int zero) {
    	return 0;
    }
    
    
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	if(par5EntityPlayer.getHeldItem() != null){
    	ItemStack currentItem = par5EntityPlayer.getHeldItem();
    	if(currentItem.itemID == Runecraft.runeEssence.itemID){
    		par5EntityPlayer.inventory.setInventorySlotContents(par5EntityPlayer.inventory.currentItem, new ItemStack(rune,currentItem.stackSize));
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }else{
    return false;	
    
    }
    }
    
}
