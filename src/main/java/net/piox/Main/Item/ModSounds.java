package net.piox.Main.Item;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModSounds {
    public static final SoundEvent ARIA_MATH_SOUND = SoundEvent.of(Identifier.of("musicdisc", "aria_math"));

    public static void registerSounds() {
        Registry.register(Registries.SOUND_EVENT, Identifier.of("musicdisc", "aria_math"), ARIA_MATH_SOUND);
    }
}
