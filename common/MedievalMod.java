package Connor_13_Medieval.common;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(modid = "connor_SDKUpdated: Guns", name = "Sdks Mods: Guns", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

//To do
	//register textures
	//register entities
//Matt's Ideas
	//Stain Glass (with disign)
	//Throne
	//Armour
	//Bowls with Flames
	//Shields
//Seprate Mod
	//Cooking Mod
		//Peppers
		//Spices
		//New Food
		//Drinks
public class MedievalMod 
{
	
	@SidedProxy(clientSide = "Connor_13_Medieval.client.ClientProxyConnor_13_Medieval", serverSide = "Connor_13_Medieval.common.CommonProxyConnor_13_Medieval")
	public static CommonProxyConnor_13_Medieval proxy;
	
	public static CreativeTabs Medieval = new CreativeTabMedieval("Medieval");

	public static Item ArrowmanSpawner;

	@Init
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderThings();
		
		EntityRegistry.registerModEntity(MedievalEntityArrowman.class, "Arrowman", 1, this, 80, 3, true);
		LanguageRegistry.instance().addStringLocalization("entity.MedievalMod.Arrowman.name", "Arrowman");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Medieval", "en_US", "Medieval");

		ArrowmanSpawner = new MedievalItemArrowmanSpawner(251);//add in the rest

		LanguageRegistry.addName(ArrowmanSpawner, "Arrowman Spawner");	
		
		GameRegistry.addRecipe(new ItemStack(ArrowmanSpawner, 1), new Object[]
		{
			" X ", "YZ ", " X ", 'X', Block.pumpkin, 'Y', Item.bow, 'Z', Block.blockSteel
		});
		
	}
}
