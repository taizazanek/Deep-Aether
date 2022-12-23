
package teamrazor.deepaether.item.gear.skyjade;

import com.google.common.collect.Multimap;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import teamrazor.deepaether.init.DeepAetherModTiers;
import teamrazor.deepaether.tags.SkyjadeWeapon;

public class SkyjadeToolsSwordItem extends SwordItem implements SkyjadeWeapon {
	public SkyjadeToolsSwordItem() {
		super(DeepAetherModTiers.SKYJADE, 3, -3f, new Properties());
	}
	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
		return this.increaseDamage(super.getAttributeModifiers(slot, stack), stack, slot);
	}
}