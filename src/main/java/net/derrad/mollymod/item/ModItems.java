package net.derrad.mollymod.item;

import net.derrad.mollymod.MollyMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MollyMod.MODID);

    public static final RegistryObject<Item> KINGSTAFF  = ITEMS.register("kingstaff", () -> new KingStaffItem(new Item.Properties().tab(ModCreativeModeTab.MOLLY_TAB ).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
