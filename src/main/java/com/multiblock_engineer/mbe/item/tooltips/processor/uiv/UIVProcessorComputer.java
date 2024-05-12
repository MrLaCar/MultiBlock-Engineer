package com.multiblock_engineer.mbe.item.tooltips.processor.uiv;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UIVProcessorComputer extends Item {
    public UIVProcessorComputer(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltips.mbe.uiv03").withStyle(ChatFormatting.GRAY));
        pTooltipComponents.add(Component.translatable("tooltips.mbe.uiv.uev").withStyle(ChatFormatting.DARK_GREEN));
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
