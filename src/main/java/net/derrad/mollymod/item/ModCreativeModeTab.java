package net.derrad.mollymod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOLLY_TAB = new CreativeModeTab("mollytab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.KINGSTAFF.get());
        }

    };

    }