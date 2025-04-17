
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.equestria.mysticalcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import dev.equestria.mysticalcraft.item.MystiumSwordItem;
import dev.equestria.mysticalcraft.item.MystiumShovelItem;
import dev.equestria.mysticalcraft.item.MystiumPickaxeItem;
import dev.equestria.mysticalcraft.item.MystiumHoeItem;
import dev.equestria.mysticalcraft.item.MystiumHammerItem;
import dev.equestria.mysticalcraft.item.MystiumDustItem;
import dev.equestria.mysticalcraft.item.MystiumAxeItem;
import dev.equestria.mysticalcraft.MystmodMod;

public class MystmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MystmodMod.MODID);
	public static final RegistryObject<Item> MYSTIUM_BLOCK = block(MystmodModBlocks.MYSTIUM_BLOCK);
	public static final RegistryObject<Item> MYSTIUM_ORE = block(MystmodModBlocks.MYSTIUM_ORE);
	public static final RegistryObject<Item> MYSTIUM_DUST = REGISTRY.register("mystium_dust", () -> new MystiumDustItem());
	public static final RegistryObject<Item> CAVE_GLASS = block(MystmodModBlocks.CAVE_GLASS);
	public static final RegistryObject<Item> MYSTIUM_AXE = REGISTRY.register("mystium_axe", () -> new MystiumAxeItem());
	public static final RegistryObject<Item> MYSTIUM_PICKAXE = REGISTRY.register("mystium_pickaxe", () -> new MystiumPickaxeItem());
	public static final RegistryObject<Item> MYSTIUM_SWORD = REGISTRY.register("mystium_sword", () -> new MystiumSwordItem());
	public static final RegistryObject<Item> MYSTIUM_SHOVEL = REGISTRY.register("mystium_shovel", () -> new MystiumShovelItem());
	public static final RegistryObject<Item> MYSTIUM_HOE = REGISTRY.register("mystium_hoe", () -> new MystiumHoeItem());
	public static final RegistryObject<Item> MYSTIUM_HAMMER = REGISTRY.register("mystium_hammer", () -> new MystiumHammerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
