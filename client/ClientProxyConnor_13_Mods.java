package Connor_13_Medieval.client;

import net.minecraftforge.client.MinecraftForgeClient;
import Connor_13_Medieval.common.CommonProxyConnor_13_Mods;
//Make a new file renamed to match package
public class ClientProxyConnor_13_Mods extends CommonProxyConnor_13_Mods
{
	@Override
	public void registerRenderThings()
	{
		//Test Stuff
		MinecraftForgeClient.preloadTexture("/testPics/testTextures.png");
		//Test Stuff
		MinecraftForgeClient.preloadTexture("/sdk/SDKUtility.png");

	}
}
