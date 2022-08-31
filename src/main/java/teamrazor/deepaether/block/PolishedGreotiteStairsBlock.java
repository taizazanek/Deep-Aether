
package teamrazor.deepaether.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import teamrazor.deepaether.init.DeepAetherModBlocks;

import java.util.List;
import java.util.Collections;

public class PolishedGreotiteStairsBlock extends StairBlock {
	public PolishedGreotiteStairsBlock() {
		super(() -> DeepAetherModBlocks.POLISHED_GREOTITE.get().defaultBlockState(),
				BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f).requiresCorrectToolForDrops());
	}
}
