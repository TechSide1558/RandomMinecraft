
package net.mcreator.random.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.random.RandomModElements;

@RandomModElements.ModElement.Tag
public class EmaraldSwordItem extends RandomModElements.ModElement {
	@ObjectHolder("random:emarald_sword")
	public static final Item block = null;
	public EmaraldSwordItem(RandomModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.DIAMOND_SWORD, (int) (1)));
			}
		}, 3, 6f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("emarald_sword"));
	}
}
