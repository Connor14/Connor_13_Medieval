package Connor_13_Medieval.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabCastles extends CreativeTabs 
{
	public CreativeTabCastles(String label) 
	{
	    super(label);
	}
	
	@Override
	public ItemStack getIconItemStack() 
	{
	    return new ItemStack(CastlesMod.ArrowmanSpawner);
	}
}
