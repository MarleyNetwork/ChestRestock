package com.dumptruckman.chestrestock.api;

import com.dumptruckman.chestrestock.util.Language;
import com.dumptruckman.minecraft.pluginbase.config.ConfigEntry;
import com.dumptruckman.minecraft.pluginbase.config.EntryBuilder;
import com.dumptruckman.minecraft.pluginbase.util.Null;

public interface CRDefaults extends CRChestOptions {

    ConfigEntry<Null> OTHER = new EntryBuilder<Null>(Null.class, "other")
            .comment("# These are options that pertain to chests but are not properties of individual chests.")
            .build();

    ConfigEntry<Boolean> AUTO_CREATE = new EntryBuilder<Boolean>(Boolean.class, "other.auto_create").def(false)
            .description(Language.AUTO_CREATE_DESC)
            .comment("# This will automatically initialize any chest not already managed by ChestRestock with these defaults.")
            .comment("# Essentially the same thing as using \"/cr create\" on every chest encountered")
            .stringSerializer().build();

    ConfigEntry<String> EMPTY_LOOT_TABLE = new EntryBuilder<String>(String.class, "other.empty_loot_table").def("")
            .description(Language.EMPTY_LOOT_TABLE_DESC)
            .comment("# This is the loot table that will be used when intializing a restock chest that is empty when created.")
            .stringSerializer().build();
}
