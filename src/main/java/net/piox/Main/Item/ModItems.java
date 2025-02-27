package net.piox.Main.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.piox.Main.MusicDisc;

import java.util.function.Function;

public class ModItems {
    public static final Item ARIA_MATH = register("aria_math", Item::new, new Item.Settings());
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {

        // Create the item key
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MusicDisc.MOD_ID, name));

        // Create the item instance
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item
        Registry.register(Registries.ITEM, itemKey, item);


        return item;
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register((itemGroup) -> itemGroup.add(ModItems.ARIA_MATH));
    }
}