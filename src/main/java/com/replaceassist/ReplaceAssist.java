package com.replaceassist;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class ReplaceAssist implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ReplaceAssistScreen.register();
    }

    public void onInitializeClient() {
        //регистрация клавиши для открытия интерфейса
        ModKeybinds.registerKeybinds()
    }

    public void tick() {
        //обработка нажатия клавиши для открытия интерфейса
        super.tick();
        if (ModKeybinds.openGui.wasPressed()) {
            ReplaceAssistScreen.open();
        }
    }
}
