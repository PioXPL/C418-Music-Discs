package net.piox.Main.Item;

import net.minecraft.block.Blocks;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundCategory;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomMusicDiscItem extends Item {
    private final SoundEvent sound;

    public CustomMusicDiscItem(SoundEvent sound, Settings settings) {
        super(settings);
        this.sound = sound;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getStack();

        if (world.getBlockState(pos).isOf(Blocks.JUKEBOX)) {
            JukeboxBlock jukebox = (JukeboxBlock) world.getBlockState(pos).getBlock();
            JukeboxBlockEntity jukeboxEntity = (JukeboxBlockEntity) world.getBlockEntity(pos);

            if (jukeboxEntity != null) {
                jukeboxEntity.setStack(0, stack.copy());
                world.setBlockState(pos, world.getBlockState(pos).with(Properties.HAS_RECORD, true));
                world.playSound(null, pos, sound, SoundCategory.RECORDS, 1.0F, 1.0F);
                stack.decrement(1);
                return ActionResult.SUCCESS;
            }
        }

        return super.useOnBlock(context);
    }
}
