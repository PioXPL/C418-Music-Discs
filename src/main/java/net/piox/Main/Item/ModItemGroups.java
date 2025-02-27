package net.piox.Main.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.piox.Main.MusicDisc;

public class ModItemGroups {

    public static final ItemGroup Aria_Math_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MusicDisc.MOD_ID, "aria_math_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ARIA_MATH))
                    .displayName(Text.translatable("itemgroup.musicdisc.aria_math_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ARIA_MATH);
                    })
                    .build());

    public static void registerItemGroups() {
        MusicDisc.LOGGER.info("Registering Item Group for Aria Math for " + MusicDisc.MOD_ID);
    }
}
