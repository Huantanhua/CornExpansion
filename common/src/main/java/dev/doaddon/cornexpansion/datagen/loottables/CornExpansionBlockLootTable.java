package dev.doaddon.cornexpansion.datagen.loottables;

import dev.doaddon.cornexpansion.registry.CornExpansionObjects;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.world.item.Items;

public class CornExpansionBlockLootTable extends FabricBlockLootTableProvider {
    public CornExpansionBlockLootTable(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        dropOther(CornExpansionObjects.POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionObjects.SWEET_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionObjects.BUTTERY_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionObjects.CHEESY_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
        dropOther(CornExpansionObjects.CANDIED_POPCORN_TIN_BLOCK.get(), Items.BUCKET);
    }
}
