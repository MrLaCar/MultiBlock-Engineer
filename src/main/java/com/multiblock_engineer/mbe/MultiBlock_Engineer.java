package com.multiblock_engineer.mbe;
import com.mojang.logging.LogUtils;
import com.multiblock_engineer.mbe.block.MBEBlocks;
import com.multiblock_engineer.mbe.item.MBECreativeTabs;
import com.multiblock_engineer.mbe.item.MBEItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.swing.*;

@Mod(MultiBlock_Engineer.MOD_ID)
public class MultiBlock_Engineer
{
    public static final String MOD_ID = "mbe";
    private static final Logger LOGGER = LogUtils.getLogger();
       public MultiBlock_Engineer()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MBEItems.register(modEventBus);
        MBECreativeTabs.register(modEventBus);
        MBEBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {}
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {}
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(MBEBlocks.ENERGY_RESTRAINT_LENS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(MBEBlocks.NEUTRONIUM_REINFORCED_GLASS.get(), RenderType.translucent());
        }
    }
}
