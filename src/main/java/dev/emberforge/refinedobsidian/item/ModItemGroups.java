package dev.emberforge.refinedobsidian.item;

import dev.emberforge.refinedobsidian.RefinedObsidian;
import dev.emberforge.refinedobsidian.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup REFINEDOBSIDIAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RefinedObsidian.MOD_ID, "refinedobsidian"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.refinedobsidian"))
                    .icon(() -> new ItemStack(ModItems.OBSIDIAN_DUST)).entries((displayContext, entries) -> {
                        //Items
                        entries.add(ModItems.OBSIDIAN_DUST);

                        //Blocks
                        //Bricks
                        entries.add(ModBlocks.OBSIDIAN_BRICKS);
                        entries.add(ModBlocks.OBSIDIAN_BRICK_SLAB);
                        entries.add(ModBlocks.OBSIDIAN_BRICK_STAIRS);
                        entries.add(ModBlocks.OBSIDIAN_BRICK_WALL);
                        entries.add(ModBlocks.CRACKED_OBSIDIAN_BRICKS);
                        //Tiles
                        entries.add(ModBlocks.OBSIDIAN_TILES);
                        entries.add(ModBlocks.OBSIDIAN_TILE_SLAB);
                        entries.add(ModBlocks.OBSIDIAN_TILE_STAIRS);
                        entries.add(ModBlocks.OBSIDIAN_TILE_WALL);
                        entries.add(ModBlocks.CRACKED_OBSIDIAN_TILES);
                        //Polished
                        entries.add(ModBlocks.POLISHED_OBSIDIAN);
                        entries.add(ModBlocks.POLISHED_OBSIDIAN_SLAB);
                        entries.add(ModBlocks.POLISHED_OBSIDIAN_STAIRS);
                        entries.add(ModBlocks.POLISHED_OBSIDIAN_WALL);
                        //Cobbled
                        entries.add(ModBlocks.COBBLED_OBSIDIAN);
                        entries.add(ModBlocks.COBBLED_OBSIDIAN_SLAB);
                        entries.add(ModBlocks.COBBLED_OBSIDIAN_STAIRS);
                        entries.add(ModBlocks.COBBLED_OBSIDIAN_WALL);
                        //Chiseled
                        entries.add(ModBlocks.CHISELED_OBSIDIAN);
                    }).build());

    public static void registerItemGroups() {
        RefinedObsidian.LOGGER.info("Registering Item Groups for " + RefinedObsidian.MOD_ID);
    }
}
