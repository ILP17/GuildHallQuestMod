package com.modmachine.guildhallquestmod.items;

import com.modmachine.guildhallquestmod.GuildHallQuesting;
import net.minecraft.item.Item;

public class ItemBase  extends Item {
    public ItemBase() {
        super(new Item.Properties().group(GuildHallQuesting.TAB).maxStackSize(1)); }
}
