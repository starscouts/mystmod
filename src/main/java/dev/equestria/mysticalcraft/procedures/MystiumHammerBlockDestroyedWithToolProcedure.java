package dev.equestria.mysticalcraft.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MystiumHammerBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _pos = BlockPos.containing(x + 1, y, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y + 1, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y + 1, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y + 1, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y + 1, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y + 1, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y + 1, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y + 1, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y + 1, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y + 1, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y - 1, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y - 1, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y - 1, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y - 1, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x, y - 1, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y + 1, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x + 1, y - 1, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y - 1, z - 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		{
			BlockPos _pos = BlockPos.containing(x - 1, y - 1, z + 1);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
	}
}
