package net.piox.Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.fabricmc.api.ModInitializer;
import net.piox.Main.Item.ModItems;
import net.piox.Main.Item.ModSounds;

public class MusicDisc implements ModInitializer {
	public static final String MOD_ID = "musicdisc";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
		ModItems.initialize();
	}
}
