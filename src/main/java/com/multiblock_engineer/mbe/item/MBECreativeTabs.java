package com.multiblock_engineer.mbe.item;

import com.multiblock_engineer.mbe.MultiBlock_Engineer;
import com.multiblock_engineer.mbe.block.MBEBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MBECreativeTabs {
    public static final String MBE_ITEM = "mbe.item";
    public static final String MBE_BLOCK = "mbe.block";
    public static final String MBE_GALAXY = "mbe.galaxy";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MultiBlock_Engineer.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ITEM = CREATIVE_MODE_TAB.register("item",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MBEItems.ENERGY_RESTRAINT_PLATE.get()))
                    .title(Component.translatable(MBE_ITEM))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MBEItems.ENERGY_RESTRAINT_PLATE.get());
                        pOutput.accept(MBEItems.UEV_VOLTAGE_COIL.get());
                        pOutput.accept(MBEItems.UIV_VOLTAGE_COIL.get());
                        pOutput.accept(MBEItems.UXV_VOLTAGE_COIL.get());
                        pOutput.accept(MBEItems.OPV_VOLTAGE_COIL.get());
                        pOutput.accept(MBEItems.STELLAR_PROCESSOR.get());
                        pOutput.accept(MBEItems.STELLAR_PROCESSOR_ASSEMBLY.get());
                        pOutput.accept(MBEItems.STELLAR_PROCESSOR_COMPUTER.get());
                        pOutput.accept(MBEItems.STELLAR_PROCESSOR_MAINFRAME.get());
                        pOutput.accept(MBEItems.DIMENSION_PROCESSOR.get());
                        pOutput.accept(MBEItems.DIMENSION_PROCESSOR_ASSEMBLY.get());
                        pOutput.accept(MBEItems.DIMENSION_PROCESSOR_COMPUTER.get());
                        pOutput.accept(MBEItems.DIMENSION_PROCESSOR_MAINFRAME.get());
                        pOutput.accept(MBEItems.COSMIC_PROCESSOR.get());
                        pOutput.accept(MBEItems.COSMIC_PROCESSOR_ASSEMBLY.get());
                        pOutput.accept(MBEItems.COSMIC_PROCESSOR_COMPUTER.get());
                        pOutput.accept(MBEItems.COSMIC_PROCESSOR_MAINFRAME.get());
                        pOutput.accept(MBEItems.SUN_DATA_MODEL.get());
                        pOutput.accept(MBEItems.MULTIVERSE_MATRIX.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> BLOCK = CREATIVE_MODE_TAB.register("block",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MBEBlocks.ENERGY_RESTRAINT_CASING.get()))
                    .title(Component.translatable(MBE_BLOCK))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MBEBlocks.ENERGY_RESTRAINT_CASING.get());
                        pOutput.accept(MBEBlocks.STRUCTURAL_REINFORCED_PIPE_CASING.get());
                        pOutput.accept(MBEBlocks.ENERGY_RESTRAINT_LENS.get());
                        pOutput.accept(MBEBlocks.DIMENSION_PROJECTOR_MK1.get());
                        pOutput.accept(MBEBlocks.DIMENSION_PROJECTOR_MK2.get());
                        pOutput.accept(MBEBlocks.COMPONENT_FACTORY_CASING.get());
                        pOutput.accept(MBEBlocks.COMPONENT_FACTORY_LOGIC_UNIT.get());
                        pOutput.accept(MBEBlocks.COMPONENT_FACTORY_HEAT_VENT.get());
                        pOutput.accept(MBEBlocks.ADVANCED_FUSION_COIL.get());
                        pOutput.accept(MBEBlocks.FUSION_CASING_MK4.get());
                        pOutput.accept(MBEBlocks.FUSION_CASING_MK5.get());
                        pOutput.accept(MBEBlocks.FUSION_CASING_MK6.get());
                        pOutput.accept(MBEBlocks.NEUTRONIUM_REINFORCED_GLASS.get());
                        pOutput.accept(MBEBlocks.SUPER_STABLE_CONCRETE.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> GALAXY = CREATIVE_MODE_TAB.register("galaxy",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MBEBlocks.ENERGY_RESTRAINT_CASING.get()))
                    .title(Component.translatable(MBE_GALAXY))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(MBEBlocks.ENERGY_RESTRAINT_CASING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

