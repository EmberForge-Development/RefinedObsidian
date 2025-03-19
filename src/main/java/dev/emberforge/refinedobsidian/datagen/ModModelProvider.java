package dev.emberforge.refinedobsidian.datagen;

import dev.emberforge.refinedobsidian.block.ModBlocks;
import dev.emberforge.refinedobsidian.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLED_OBSIDIAN);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_OBSIDIAN_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_OBSIDIAN_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSIDIAN_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSIDIAN_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_OBSIDIAN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OBSIDIAN_DUST, Models.GENERATED);
    }
}
