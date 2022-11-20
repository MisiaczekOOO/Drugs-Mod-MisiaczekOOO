package net.kaupenjoe.tutorialmod.item;

import net.kaupenjoe.tutorialmod.TutorialMod;
import net.kaupenjoe.tutorialmod.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.drugs)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.drugs)));

    public static final RegistryObject<Item> mushroom = ITEMS.register("mushroom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.drugs).food(ModFoods.mushroom)));

    public static final RegistryObject<Item> weed = ITEMS.register("weed",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.drugs).food(ModFoods.weed)));

    public static final RegistryObject<Item> WEED_SEEDS = ITEMS.register("weed_seeds",
            () -> new ItemNameBlockItem(ModBlocks.WEED_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModeTab.drugs)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
