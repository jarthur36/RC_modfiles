package mods.runecraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemRuneEssence extends Item {

	public ItemRuneEssence(int id) {
		super(id);
	}

	
	public void func_94581_a(IconRegister iconRegister)
	{
	         iconIndex = iconRegister.func_94245_a("runecraft:runeEssence");
	}
}
