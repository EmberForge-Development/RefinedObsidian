package dev.emberforge.refinedobsidian.datagen;

import dev.emberforge.refinedobsidian.block.ModBlocks;
import dev.emberforge.refinedobsidian.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.trim.ArmorTrimMaterial;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Solid
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_OBSIDIAN);
        BlockStateModelGenerator.BlockTexturePool cobbledPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBBLED_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_OBSIDIAN_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_OBSIDIAN_TILES);
        BlockStateModelGenerator.BlockTexturePool brickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OBSIDIAN_BRICKS);
        BlockStateModelGenerator.BlockTexturePool tilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OBSIDIAN_TILES);
        BlockStateModelGenerator.BlockTexturePool polishedPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_OBSIDIAN);

        //Slabs
        cobbledPool.slab(ModBlocks.COBBLED_OBSIDIAN_SLAB);
        brickPool.slab(ModBlocks.OBSIDIAN_BRICK_SLAB);
        tilePool.slab(ModBlocks.OBSIDIAN_TILE_SLAB);
        polishedPool.slab(ModBlocks.POLISHED_OBSIDIAN_SLAB);

        //Stairs
        cobbledPool.stairs(ModBlocks.COBBLED_OBSIDIAN_STAIRS);
        brickPool.stairs(ModBlocks.OBSIDIAN_BRICK_STAIRS);
        tilePool.stairs(ModBlocks.OBSIDIAN_TILE_STAIRS);
        polishedPool.stairs(ModBlocks.POLISHED_OBSIDIAN_STAIRS);

        //Walls
        cobbledPool.wall(ModBlocks.COBBLED_OBSIDIAN_WALL);
        brickPool.wall(ModBlocks.OBSIDIAN_BRICK_WALL);
        tilePool.wall(ModBlocks.OBSIDIAN_TILE_WALL);
        polishedPool.wall(ModBlocks.POLISHED_OBSIDIAN_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OBSIDIAN_DUST, Models.GENERATED);
    }

}
