package com.replaceassist;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class ModKeybinds {
    public static KeyBinding openGui;

    public static void registerKeybinds() {
        // Создание клавиши для открытия интерфейса
        openGui = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.replaceassist.open_gui",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_F8,
                "category.replaceassist"
        ));
    }
}
