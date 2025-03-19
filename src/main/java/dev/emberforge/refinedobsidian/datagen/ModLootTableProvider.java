package dev.emberforge.refinedobsidian.datagen;

import dev.emberforge.refinedobsidian.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Modded
        //Modified Vanilla Obsidian Drop is located in resources/data/minecraft/loot_tables/blocks/obsidian.json
        addDrop(ModBlocks.OBSIDIAN_BRICKS);
        addDrop(ModBlocks.OBSIDIAN_BRICK_SLAB, slabDrops(ModBlocks.OBSIDIAN_BRICK_SLAB));
        addDrop(ModBlocks.OBSIDIAN_BRICK_STAIRS);
        addDrop(ModBlocks.OBSIDIAN_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_OBSIDIAN_BRICKS);
        addDrop(ModBlocks.OBSIDIAN_TILES);
        addDrop(ModBlocks.OBSIDIAN_TILE_SLAB, slabDrops(ModBlocks.OBSIDIAN_TILE_SLAB));
        addDrop(ModBlocks.OBSIDIAN_TILE_STAIRS);
        addDrop(ModBlocks.OBSIDIAN_TILE_WALL);
        addDrop(ModBlocks.CRACKED_OBSIDIAN_TILES);
        addDrop(ModBlocks.POLISHED_OBSIDIAN);
        addDrop(ModBlocks.POLISHED_OBSIDIAN_SLAB, slabDrops(ModBlocks.POLISHED_OBSIDIAN_SLAB));
        addDrop(ModBlocks.POLISHED_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.POLISHED_OBSIDIAN_WALL);
        addDrop(ModBlocks.COBBLED_OBSIDIAN);
        addDrop(ModBlocks.COBBLED_OBSIDIAN_SLAB, slabDrops(ModBlocks.COBBLED_OBSIDIAN_SLAB));
        addDrop(ModBlocks.COBBLED_OBSIDIAN_STAIRS);
        addDrop(ModBlocks.COBBLED_OBSIDIAN_WALL);
        addDrop(ModBlocks.CHISELED_OBSIDIAN);
    }
}
