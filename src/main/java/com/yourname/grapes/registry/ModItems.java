package com.yourname.grapes.registry;

import com.yourname.grapes.GrapesMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GrapesMod.MODID);

    public static final RegistryObject<Item> GRAPE_SEEDS = ITEMS.register("grape_seeds",
        () -> new ItemNameBlockItem(ModBlocks.GRAPE_CROP.get(),
            new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> GRAPES = ITEMS.register("grapes",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
}
