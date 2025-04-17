
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.equestria.mysticalcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import dev.equestria.mysticalcraft.world.features.ores.MystiumOreFeature;
import dev.equestria.mysticalcraft.MystmodMod;

@Mod.EventBusSubscriber
public class MystmodModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MystmodMod.MODID);
	public static final RegistryObject<Feature<?>> MYSTIUM_ORE = REGISTRY.register("mystium_ore", MystiumOreFeature::new);
}
