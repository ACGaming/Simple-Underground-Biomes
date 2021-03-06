package party.lemons.undergroundbiomes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import party.lemons.undergroundbiomes.generation.UndergroundBiomeGeneration;

import static party.lemons.undergroundbiomes.UndergroundBiomes.MODID;
import static party.lemons.undergroundbiomes.UndergroundBiomes.MODNAME;
import static party.lemons.undergroundbiomes.UndergroundBiomes.VERSION;

/**
 * Created by Sam on 2/08/2018.
 */
@Mod(modid = MODID, name = MODNAME, version = VERSION)
public class UndergroundBiomes
{
	public static final String MODID = "simpleundergroundbiomes";
	public static final String MODNAME = "Underground Biomes";
	public static final String VERSION = "0.1.2";

	@Mod.EventHandler
	public void onPreInit(FMLPreInitializationEvent event)
	{
		UndergroundBiomeGeneration gen = new UndergroundBiomeGeneration();

		MinecraftForge.EVENT_BUS.register(gen);
		MinecraftForge.TERRAIN_GEN_BUS.register(gen);
	}
}
