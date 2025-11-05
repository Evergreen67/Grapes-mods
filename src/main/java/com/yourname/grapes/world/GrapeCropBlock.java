package com.yourname.grapes.world;

import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.item.Item;
import com.yourname.grapes.registry.ModItems;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class GrapeCropBlock extends CropBlock {
    public GrapeCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected Item getBaseSeedId() {
        return ModItems.GRAPE_SEEDS.get();
    }
}
