package dev.emberforge.refinedobsidian.item;

import dev.emberforge.refinedobsidian.RefinedObsidian;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OBSIDIAN_DUST = registerItem("obsidian_dust", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(RefinedObsidian.MOD_ID, name), item);
    }

    public static void registerModItems() {
        RefinedObsidian.LOGGER.info("Registering Items for " + RefinedObsidian.MOD_ID);
    }
}
