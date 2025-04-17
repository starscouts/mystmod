
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.equestria.mysticalcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import dev.equestria.mysticalcraft.block.MystiumOreBlock;
import dev.equestria.mysticalcraft.block.MystiumBlockBlock;
import dev.equestria.mysticalcraft.block.CaveGlassBlock;
import dev.equestria.mysticalcraft.MystmodMod;

public class MystmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MystmodMod.MODID);
	public static final RegistryObject<Block> MYSTIUM_BLOCK = REGISTRY.register("mystium_block", () -> new MystiumBlockBlock());
	public static final RegistryObject<Block> MYSTIUM_ORE = REGISTRY.register("mystium_ore", () -> new MystiumOreBlock());
	public static final RegistryObject<Block> CAVE_GLASS = REGISTRY.register("cave_glass", () -> new CaveGlassBlock());
}
