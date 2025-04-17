
package dev.equestria.mysticalcraft.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import dev.equestria.mysticalcraft.init.MystmodModItems;

public class MystiumPickaxeItem extends PickaxeItem {
	public MystiumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 6280;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 0;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MystmodModItems.MYSTIUM_DUST.get()));
			}
		}, 1, -3f, new Item.Properties());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
