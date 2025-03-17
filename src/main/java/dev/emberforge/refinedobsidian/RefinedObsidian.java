package dev.emberforge.refinedobsidian;

import dev.emberforge.refinedobsidian.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RefinedObsidian implements ModInitializer {
	public static final String MOD_ID = "refinedobsidian";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String MOD_VERSION = "1.0.0-1.20.1-fabric";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Mod Refined Obsidian Version " + MOD_VERSION + " by EmberForge Development");
		ModItems.registerModItems();
	}
}