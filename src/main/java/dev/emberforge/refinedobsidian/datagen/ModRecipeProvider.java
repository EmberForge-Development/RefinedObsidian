package dev.emberforge.refinedobsidian.datagen;

import dev.emberforge.refinedobsidian.block.ModBlocks;
import dev.emberforge.refinedobsidian.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    private static List<ItemConvertible> OBSIDIAN_SMELTABLE = List.of(ModBlocks.COBBLED_OBSIDIAN);
    private static List<ItemConvertible> OBSIDIAN_BLASTABLE = List.of(ModBlocks.COBBLED_OBSIDIAN);
    private static List<ItemConvertible> STAIRS = List.of(ModBlocks.OBSIDIAN_BRICK_STAIRS, ModBlocks.OBSIDIAN_TILE_STAIRS, ModBlocks.POLISHED_OBSIDIAN_STAIRS, ModBlocks.COBBLED_OBSIDIAN_STAIRS);
    private static List<ItemConvertible> WALLS = List.of(ModBlocks.OBSIDIAN_BRICK_WALL, ModBlocks.OBSIDIAN_TILE_WALL, ModBlocks.POLISHED_OBSIDIAN_WALL, ModBlocks.COBBLED_OBSIDIAN_WALL);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> consumer) {
        offerSmelting(consumer, OBSIDIAN_SMELTABLE, RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, 0.5F, 400, "obsidian");
        offerBlasting(consumer, OBSIDIAN_BLASTABLE, RecipeCategory.BUILDING_BLOCKS, Blocks.OBSIDIAN, 0.5F, 200, "obsidian");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_OBSIDIAN, 1)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.OBSIDIAN_DUST)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .showNotification(true)
                .offerTo(consumer, new Identifier(getRecipeName(ModBlocks.COBBLED_OBSIDIAN))); //??

        //Slabs
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_TILE_SLAB, ModBlocks.OBSIDIAN_TILES);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_OBSIDIAN_SLAB, ModBlocks.POLISHED_OBSIDIAN);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_OBSIDIAN_SLAB, ModBlocks.COBBLED_OBSIDIAN);
        offerSlabRecipe(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_BRICK_SLAB, ModBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe();
    }
}
