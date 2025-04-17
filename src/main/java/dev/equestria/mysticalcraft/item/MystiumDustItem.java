
package dev.equestria.mysticalcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MystiumDustItem extends Item {
	public MystiumDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
