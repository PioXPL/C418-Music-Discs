package net.piox.Main;

import net.fabricmc.api.ModInitializer;

import net.piox.Main.Item.ModItemGroups;
import net.piox.Main.Item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MusicDisc implements ModInitializer {
	public static final String MOD_ID = "musicdisc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialize();
		ModItemGroups.registerItemGroups();
	}
}