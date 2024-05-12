package com.multiblock_engineer.mbe.block;

import com.multiblock_engineer.mbe.MultiBlock_Engineer;
import com.multiblock_engineer.mbe.item.MBEItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.multiblock_engineer.mbe.item.MBEItems.ITEMS;

public class MBEBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MultiBlock_Engineer.MOD_ID);

//MachineBlock
    public static final RegistryObject<Block> ENERGY_RESTRAINT_CASING = registerBlock("energy_restraint_casing",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STRUCTURAL_REINFORCED_PIPE_CASING = registerBlock("structural_reinforced_pipe_casing",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIMENSION_PROJECTOR_MK1 = registerBlock("dimension_projector_mk1",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DIMENSION_PROJECTOR_MK2 = registerBlock("dimension_projector_mk2",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPONENT_FACTORY_CASING = registerBlock("component_factory_casing",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPONENT_FACTORY_LOGIC_UNIT = registerBlock("component_factory_logic_unit",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COMPONENT_FACTORY_HEAT_VENT = registerBlock("component_factory_heat_vent",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ADVANCED_FUSION_COIL = registerBlock("advanced_fusion_coil",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(10f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FUSION_CASING_MK4 = registerBlock("fusion_casing_mk4",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FUSION_CASING_MK5 = registerBlock("fusion_casing_mk5",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> FUSION_CASING_MK6 = registerBlock("fusion_casing_mk6",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SUPER_STABLE_CONCRETE = registerBlock("super_stable_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(8f).requiresCorrectToolForDrops()));
//Glass
    public static final RegistryObject<Block> NEUTRONIUM_REINFORCED_GLASS= registerBlock("neutronium_reinforced_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .strength(8f).requiresCorrectToolForDrops().noOcclusion()));
    public static final RegistryObject<Block> ENERGY_RESTRAINT_LENS= registerBlock("energy_restraint_lens",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .strength(8f).requiresCorrectToolForDrops().noOcclusion()));
//Galaxy



    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
