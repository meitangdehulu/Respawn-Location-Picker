package com.github.upcraftlp.respawnlocationpicker.proxy;

import com.github.upcraftlp.respawnlocationpicker.net.NetworkHandler;
import com.github.upcraftlp.respawnlocationpicker.net.packet.PacketRespawnLocations;
import com.github.upcraftlp.respawnlocationpicker.net.packet.PacketRespawnPlayer;
import com.github.upcraftlp.respawnlocationpicker.net.packet.PacketSetRespawnLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;

public abstract class CommonProxy {

    private static int packetID = 0;

    public void preInit(FMLPreInitializationEvent event) {
        NetworkHandler.INSTANCE.registerMessage(PacketRespawnPlayer.class, PacketRespawnPlayer.class, packetID++, Side.SERVER);
        NetworkHandler.INSTANCE.registerMessage(PacketRespawnLocations.class, PacketRespawnLocations.class, packetID++, Side.CLIENT);
        NetworkHandler.INSTANCE.registerMessage(PacketSetRespawnLocation.class, PacketSetRespawnLocation.class, packetID++, Side.SERVER);
    }

    public void init(FMLInitializationEvent event) {
        
    }

    public void postInit(FMLPostInitializationEvent event) {
        
    }

    public void serverStarting(FMLServerStartingEvent event) {
        
    }
}