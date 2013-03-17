package mods.runecraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemRune extends Item {
    private String texture;
	public ItemRune(int par1,String texturestr) {
		super(par1);
		texture = texturestr;
		
		}

	
	public void func_94581_a(IconRegister iconRegister)
	{
	    iconIndex = iconRegister.func_94245_a("runecraft:"+texture);
	}
}
