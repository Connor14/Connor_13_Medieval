package Connor_13_Medieval.common;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MedievalItemArrowmanSpawner extends Item
{        
		public MedievalItemArrowmanSpawner (int i)        
		{                
			super(i);                
			maxStackSize = 4;
			setCreativeTab(MedievalMod.Medieval);
		}        
	
		/**         
		 ** Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer         
		 **/        
		public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer, double par2, double par4, double par6)        
		{               
	        if (!entityplayer.capabilities.isCreativeMode)
	        {
	            --itemstack.stackSize;
	        }
	        
			entityplayer.addChatMessage("Arrow Guardian Spawned");
			
			MedievalEntityArrowman MedievalEntityArrowman = new MedievalEntityArrowman(world);
			MedievalEntityArrowman.setLocationAndAngles(par2, par4, par6, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
			world.joinEntityInSurroundings(MedievalEntityArrowman);
            
			return itemstack;        
		}
}