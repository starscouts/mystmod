
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.equestria.mysticalcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import dev.equestria.mysticalcraft.MystmodMod;

public class MystmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MystmodMod.MODID);
	public static final RegistryObject<CreativeModeTab> MYSTMOD = REGISTRY.register("mystmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mystmod.mystmod")).icon(() -> new ItemStack(MystmodModItems.MYSTIUM_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MystmodModBlocks.MYSTIUM_BLOCK.get().asItem());
				tabData.accept(MystmodModBlocks.MYSTIUM_ORE.get().asItem());
				tabData.accept(MystmodModItems.MYSTIUM_DUST.get());
				tabData.accept(MystmodModBlocks.CAVE_GLASS.get().asItem());
				tabData.accept(MystmodModItems.MYSTIUM_AXE.get());
				tabData.accept(MystmodModItems.MYSTIUM_PICKAXE.get());
				tabData.accept(MystmodModItems.MYSTIUM_SWORD.get());
				tabData.accept(MystmodModItems.MYSTIUM_SHOVEL.get());
				tabData.accept(MystmodModItems.MYSTIUM_HOE.get());
				tabData.accept(MystmodModItems.MYSTIUM_HAMMER.get());
			}).withSearchBar().build());
}
