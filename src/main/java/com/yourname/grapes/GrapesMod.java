package com.yourname.grapes;

import com.yourname.grapes.registry.ModBlocks;
import com.yourname.grapes.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GrapesMod.MODID)
public class GrapesMod {
    public static final String MODID = "grapes";

    public GrapesMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(bus);
        ModItems.ITEMS.register(bus);
    }
}
