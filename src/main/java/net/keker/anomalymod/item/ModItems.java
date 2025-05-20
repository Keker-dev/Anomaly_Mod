package net.keker.anomalymod.item;

import net.keker.anomalymod.AnomalyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AnomalyMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> AnomalyTool = ITEMS.register("anomalytool",
             () -> new Item(new Item.Properties().tab(ModItemGroup.ANOMALY_TAB)));
}
