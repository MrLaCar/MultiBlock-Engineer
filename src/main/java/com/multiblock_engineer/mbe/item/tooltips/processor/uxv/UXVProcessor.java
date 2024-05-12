package com.multiblock_engineer.mbe.item.tooltips.processor.uxv;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

    public class UXVProcessor extends Item {
        public UXVProcessor(Properties pProperties) {
            super(pProperties);
        }

        @Override
        public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
            pTooltipComponents.add(Component.translatable("tooltips.mbe.uxv01").withStyle(ChatFormatting.GRAY));
            pTooltipComponents.add(Component.translatable("tooltips.mbe.uxv.uhv").withStyle(ChatFormatting.YELLOW));
            super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        }
    }
