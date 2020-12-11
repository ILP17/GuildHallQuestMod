package com.modmachine.guildhallquestmod.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

public class KeyboardHelper {
    public static final long WINDOW = Minecraft.getInstance().getMainWindow().getHandle();
    //returns true is the user is holding either shifts
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift()
    {
        return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT) || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_SHIFT);
    }

    //returns true is the user is holding either ctrls
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingCTRL()
    {
        return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_CONTROL) || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_CONTROL);
    }
}
