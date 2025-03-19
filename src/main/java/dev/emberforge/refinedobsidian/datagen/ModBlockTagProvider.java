package dev.emberforge.refinedobsidian.datagen;

import dev.emberforge.refinedobsidian.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.OBSIDIAN_BRICKS)
                .add(ModBlocks.OBSIDIAN_BRICK_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICK_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICK_WALL)
                .add(ModBlocks.CRACKED_OBSIDIAN_BRICKS)
                .add(ModBlocks.OBSIDIAN_TILES)
                .add(ModBlocks.OBSIDIAN_TILE_SLAB)
                .add(ModBlocks.OBSIDIAN_TILE_STAIRS)
                .add(ModBlocks.OBSIDIAN_TILE_WALL)
                .add(ModBlocks.CRACKED_OBSIDIAN_TILES)
                .add(ModBlocks.POLISHED_OBSIDIAN)
                .add(ModBlocks.POLISHED_OBSIDIAN_SLAB)
                .add(ModBlocks.POLISHED_OBSIDIAN_STAIRS)
                .add(ModBlocks.POLISHED_OBSIDIAN_WALL)
                .add(ModBlocks.COBBLED_OBSIDIAN)
                .add(ModBlocks.COBBLED_OBSIDIAN_SLAB)
                .add(ModBlocks.COBBLED_OBSIDIAN_STAIRS)
                .add(ModBlocks.COBBLED_OBSIDIAN_WALL)
                .add(ModBlocks.CHISELED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OBSIDIAN_BRICKS)
                .add(ModBlocks.OBSIDIAN_BRICK_SLAB)
                .add(ModBlocks.OBSIDIAN_BRICK_STAIRS)
                .add(ModBlocks.OBSIDIAN_BRICK_WALL)
                .add(ModBlocks.CRACKED_OBSIDIAN_BRICKS)
                .add(ModBlocks.OBSIDIAN_TILES)
                .add(ModBlocks.OBSIDIAN_TILE_SLAB)
                .add(ModBlocks.OBSIDIAN_TILE_STAIRS)
                .add(ModBlocks.OBSIDIAN_TILE_WALL)
                .add(ModBlocks.CRACKED_OBSIDIAN_TILES)
                .add(ModBlocks.POLISHED_OBSIDIAN)
                .add(ModBlocks.POLISHED_OBSIDIAN_SLAB)
                .add(ModBlocks.POLISHED_OBSIDIAN_STAIRS)
                .add(ModBlocks.POLISHED_OBSIDIAN_WALL)
                .add(ModBlocks.COBBLED_OBSIDIAN)
                .add(ModBlocks.COBBLED_OBSIDIAN_SLAB)
                .add(ModBlocks.COBBLED_OBSIDIAN_STAIRS)
                .add(ModBlocks.COBBLED_OBSIDIAN_WALL)
                .add(ModBlocks.CHISELED_OBSIDIAN);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.OBSIDIAN_BRICK_WALL)
                .add(ModBlocks.OBSIDIAN_TILE_WALL)
                .add(ModBlocks.POLISHED_OBSIDIAN_WALL)
                .add(ModBlocks.COBBLED_OBSIDIAN_WALL);
    }
}
