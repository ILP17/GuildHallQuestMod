package com.modmachine.guildhallquestmod.util;

import com.modmachine.guildhallquestmod.GuildHallQuesting;
import com.modmachine.guildhallquestmod.items.ItemBase;
import com.modmachine.guildhallquestmod.items.QuestBook;
import com.modmachine.guildhallquestmod.items.QuestBookConfigurator;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, GuildHallQuesting.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<QuestBook> QUEST_BOOK = ITEMS.register("quest_book", QuestBook::new);

    public static final RegistryObject<QuestBookConfigurator> QUEST_BOOK_CONFIGURATOR = ITEMS.register("quest_book_configurator", QuestBookConfigurator::new);
}
