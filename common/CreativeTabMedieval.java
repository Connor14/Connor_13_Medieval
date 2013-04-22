package Connor_13_Medieval.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMedieval extends CreativeTabs 
{
	public CreativeTabMedieval(String label) 
	{
	    super(label);
	}
	
	@Override
	public ItemStack getIconItemStack() 
	{
	    return new ItemStack(MedievalMod.ArrowmanSpawner);
	}
}
