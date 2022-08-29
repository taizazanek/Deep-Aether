
package teamrazor.deepaether.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import teamrazor.deepaether.init.DeepAetherModBlocks;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class RoseLeavesBlock extends LeavesBlock {
	public RoseLeavesBlock() {
		super(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));/*of(Material.LEAVES).sound(SoundType.GRASS).strength(0.2f).noOcclusion()
				.isRedstoneConductor((bs, br, bp) -> false));*/
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}
	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(DeepAetherModBlocks.ROSE_LEAVES.get(), renderType -> renderType == RenderType.cutout());
	}
}
