package net.scout.rw_block_mod;

import net.fabricmc.api.ModInitializer;

import net.scout.rw_block_mod.block.ModBlocks;
import net.scout.rw_block_mod.item.ModItemGroups;
import net.scout.rw_block_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockMod implements ModInitializer {
	public static final String MOD_ID = "rw_block_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}