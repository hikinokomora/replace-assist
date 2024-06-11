package com.replaceassist;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class ReplaceAssistScreen extends Screen {
    protected ReplaceAssistScreen(Text title) {
        super(title);
    }

    //  для отображения экрана
    public static void open() {
        // Открываем экран, передавая ему заголовок
        MinecraftClient.getInstance().openScreen(new ReplaceAssistScreen(Text.of("Replace Assist")));
    }

    //  для регистрации экрана
    public static void register() {
        // Здесь будет код регистрации кнопки или другого элемента управления
    }

    @Override
    protected void init() {
        super.init();
        int x = (this.width - 200) / 2;
        int y = (this.height - 100) / 2;
        this.addButton(new ButtonWidget(x, y, 200, 20, new TranslatableText("gui.replaceassist.button"), button -> {
            
        }))
    }

    @Override
    public void render(int mouseX, int mouseY, float delta) {
        super.render(mouseX, mouseY, delta);
        // Отрисовка текста и других элементов управления
    }
}
