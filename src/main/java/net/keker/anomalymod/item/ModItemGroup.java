package net.keker.anomalymod.item;

import net.keker.anomalymod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab ANOMALY_TAB = new CreativeModeTab("anomaly_tab") {
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.JumpAnomalyBlock.get());
        }};
}