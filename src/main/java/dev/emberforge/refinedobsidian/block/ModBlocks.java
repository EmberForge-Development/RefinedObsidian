package dev.emberforge.refinedobsidian.block;

import dev.emberforge.refinedobsidian.RefinedObsidian;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Bricks
    public static final Block OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlock("obsidian_brick_stairs",
            new StairsBlock(OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(OBSIDIAN_BRICKS)));
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlock("obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN_BRICKS)));
    public static final Block OBSIDIAN_BRICK_WALL = registerBlock("obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN_BRICKS).solid()));
    public static final Block CRACKED_OBSIDIAN_BRICKS = registerBlock("cracked_obsidian_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    //Tiles
    public static final Block OBSIDIAN_TILES = registerBlock("obsidian_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block OBSIDIAN_TILE_STAIRS = registerBlock("obsidian_tile_stairs",
            new StairsBlock(OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(OBSIDIAN_TILES)));
    public static final Block OBSIDIAN_TILE_SLAB = registerBlock("obsidian_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(OBSIDIAN_TILES)));
    public static final Block OBSIDIAN_TILE_WALL = registerBlock("obsidian_tile_wall",
            new WallBlock(FabricBlockSettings.copyOf(OBSIDIAN_TILES).solid()));
    public static final Block CRACKED_OBSIDIAN_TILES = registerBlock("cracked_obsidian_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    //Polished
    public static final Block POLISHED_OBSIDIAN = registerBlock("polished_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_STAIRS = registerBlock("polished_obsidian_stairs",
            new StairsBlock(OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(POLISHED_OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_SLAB = registerBlock("polished_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(POLISHED_OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_WALL = registerBlock("polished_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(POLISHED_OBSIDIAN).solid()));
    //Cobbled
    public static final Block COBBLED_OBSIDIAN = registerBlock("cobbled_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));
    public static final Block COBBLED_OBSIDIAN_STAIRS = registerBlock("cobbled_obsidian_stairs",
            new StairsBlock(OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(COBBLED_OBSIDIAN)));
    public static final Block COBBLED_OBSIDIAN_SLAB = registerBlock("cobbled_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(COBBLED_OBSIDIAN)));
    public static final Block COBBLED_OBSIDIAN_WALL = registerBlock("cobbled_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(COBBLED_OBSIDIAN).solid()));
    //Chiseled
    public static final Block CHISELED_OBSIDIAN = registerBlock("chiseled_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN)));

    //Registries
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RefinedObsidian.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(RefinedObsidian.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

//    public static final Block DEEPSLATE_BRICK_STAIRS = register(
//            "deepslate_brick_stairs", new StairsBlock(DEEPSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(DEEPSLATE_BRICKS))
//    );
//
//    public static Block register(String id, Block block) {
//        return Registry.register(Registries.BLOCK, id, block);
//    }

    public static void registerModBlocks() {
        RefinedObsidian.LOGGER.info("Registering Blocks for " + RefinedObsidian.MOD_ID);
    }
}
