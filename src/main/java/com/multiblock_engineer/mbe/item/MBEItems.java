package com.multiblock_engineer.mbe.item;

import com.multiblock_engineer.mbe.MultiBlock_Engineer;
import com.multiblock_engineer.mbe.item.tooltips.coil.OPV;
import com.multiblock_engineer.mbe.item.tooltips.coil.UEV;
import com.multiblock_engineer.mbe.item.tooltips.coil.UIV;
import com.multiblock_engineer.mbe.item.tooltips.coil.UXV;
import com.multiblock_engineer.mbe.item.tooltips.processor.uev.UEVProcessor;
import com.multiblock_engineer.mbe.item.tooltips.processor.uev.UEVProcessorAssembly;
import com.multiblock_engineer.mbe.item.tooltips.processor.uev.UEVProcessorComputer;
import com.multiblock_engineer.mbe.item.tooltips.processor.uev.UEVProcessorMainframe;
import com.multiblock_engineer.mbe.item.tooltips.processor.uiv.UIVProcessor;
import com.multiblock_engineer.mbe.item.tooltips.processor.uiv.UIVProcessorAssembly;
import com.multiblock_engineer.mbe.item.tooltips.processor.uiv.UIVProcessorComputer;
import com.multiblock_engineer.mbe.item.tooltips.processor.uiv.UIVProcessorMainframe;
import com.multiblock_engineer.mbe.item.tooltips.processor.uxv.UXVProcessor;
import com.multiblock_engineer.mbe.item.tooltips.processor.uxv.UXVProcessorAssembly;
import com.multiblock_engineer.mbe.item.tooltips.processor.uxv.UXVProcessorComputer;
import com.multiblock_engineer.mbe.item.tooltips.processor.uxv.UXVProcessorMainframe;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBEItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MultiBlock_Engineer.MOD_ID);

    public static final RegistryObject<Item> ENERGY_RESTRAINT_PLATE = ITEMS.register("energy_restraint_plate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UEV_VOLTAGE_COIL = ITEMS.register("uev_voltage_coil",
            () -> new UEV(new Item.Properties()));
    public static final RegistryObject<Item> UIV_VOLTAGE_COIL = ITEMS.register("uiv_voltage_coil",
            () -> new UIV(new Item.Properties()));
    public static final RegistryObject<Item> UXV_VOLTAGE_COIL = ITEMS.register("uxv_voltage_coil",
            () -> new UXV(new Item.Properties()));
    public static final RegistryObject<Item> OPV_VOLTAGE_COIL = ITEMS.register("opv_voltage_coil",
            () -> new OPV(new Item.Properties()));

    public static final RegistryObject<Item> STELLAR_PROCESSOR = ITEMS.register("stellar_processor",
            () -> new UEVProcessor(new Item.Properties()));
    public static final RegistryObject<Item> STELLAR_PROCESSOR_ASSEMBLY = ITEMS.register("stellar_processor_assembly",
            () -> new UEVProcessorAssembly(new Item.Properties()));
    public static final RegistryObject<Item> STELLAR_PROCESSOR_COMPUTER = ITEMS.register("stellar_processor_computer",
            () -> new UEVProcessorComputer(new Item.Properties()));
    public static final RegistryObject<Item> STELLAR_PROCESSOR_MAINFRAME = ITEMS.register("stellar_processor_mainframe",
            () -> new UEVProcessorMainframe(new Item.Properties()));
    public static final RegistryObject<Item> DIMENSION_PROCESSOR = ITEMS.register("dimension_processor",
            () -> new UIVProcessor(new Item.Properties()));
    public static final RegistryObject<Item> DIMENSION_PROCESSOR_ASSEMBLY = ITEMS.register("dimension_processor_assembly",
            () -> new UIVProcessorAssembly(new Item.Properties()));
    public static final RegistryObject<Item> DIMENSION_PROCESSOR_COMPUTER = ITEMS.register("dimension_processor_computer",
            () -> new UIVProcessorComputer(new Item.Properties()));
    public static final RegistryObject<Item> DIMENSION_PROCESSOR_MAINFRAME = ITEMS.register("dimension_processor_mainframe",
            () -> new UIVProcessorMainframe(new Item.Properties()));
    public static final RegistryObject<Item> COSMIC_PROCESSOR = ITEMS.register("cosmic_processor",
            () -> new UXVProcessor(new Item.Properties()));
    public static final RegistryObject<Item> COSMIC_PROCESSOR_ASSEMBLY = ITEMS.register("cosmic_processor_assembly",
            () -> new UXVProcessorAssembly(new Item.Properties()));
    public static final RegistryObject<Item> COSMIC_PROCESSOR_COMPUTER = ITEMS.register("cosmic_processor_computer",
            () -> new UXVProcessorComputer(new Item.Properties()));
    public static final RegistryObject<Item> COSMIC_PROCESSOR_MAINFRAME = ITEMS.register("cosmic_processor_mainframe",
            () -> new UXVProcessorMainframe(new Item.Properties()));

    public static final RegistryObject<Item> SUN_DATA_MODEL = ITEMS.register("sun_data_model",
            () -> new Item(new Item.Properties(). stacksTo(1)));
    public static final RegistryObject<Item> MULTIVERSE_MATRIX = ITEMS.register("multiverse_matrix",
            () -> new Item(new Item.Properties(). stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
