/**
 @author Chaz Kerby
 */
package tech.chazwarp923.modularadditions;

import java.io.File;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tech.chazwarp923.modularadditions.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, updateJSON = "http://chazwarp923.tech/ModularAdditions.json", dependencies = "required-after:compatlayer", acceptedMinecraftVersions = "[1.10.2],[1.11],[1.11.2]", guiFactory = "tech.chazwarp923.modularadditions.config.ConfigGuiFactory")
public class ModularAdditions {

	public static File configFile;
	public static Configuration config;

	//The instance of the mod that Forge uses.
	@Mod.Instance(Reference.MOD_ID)
	public static ModularAdditions instance;
	
	public static Logger logger;

	//Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "tech.chazwarp923.modularadditions.proxy.ClientProxy", serverSide = "tech.chazwarp923.modularadditions.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent preInitEvent) {
		logger = preInitEvent.getModLog();
		proxy.preInit(preInitEvent);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent initEvent) {
		proxy.init(initEvent);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent postInitEvent) {
		proxy.postInit(postInitEvent);
	}
}
