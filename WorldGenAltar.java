package mods.runecraft;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenAltar extends WorldGenerator
{

	@Override
	public boolean generate(World world, Random random, int i, int j, int k) {
		while (world.isAirBlock(i, j, k) && j > 2)
        {
            --j;
        }
		int rand1=random.nextInt(75);
		
		if(world.doesBlockHaveSolidTopSurface(i, j, k)&& rand1==1){
		
			
        world.setBlockAndMetadataWithNotify(i, j, k, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i+1, j, k, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i+2, j, k, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i, j, k+1, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i, j, k+2, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i+1, j, k+1, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i+2, j, k+2, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i+1, j, k+2, Block.obsidian.blockID, 0, 1);
        world.setBlockAndMetadataWithNotify(i+2, j, k+1, Block.obsidian.blockID, 0, 1);
        int rand2=random.nextInt(4);
        switch(rand2){
        case 0 : world.setBlockAndMetadataWithNotify(i+1, j+1, k+1, Runecraft.blockAltarWater.blockID, 0, 1);
        break;
        case 1 : world.setBlockAndMetadataWithNotify(i+1, j+1, k+1, Runecraft.blockAltarAir.blockID, 0, 1);
        break;
        case 2 : world.setBlockAndMetadataWithNotify(i+1, j+1, k+1, Runecraft.blockAltarEarth.blockID, 0, 1);
        break;
        case 3 : world.setBlockAndMetadataWithNotify(i+1, j+1, k+1, Runecraft.blockAltarFire.blockID, 0, 1);
        break;
        }
		
		return true;
	}else{
		return false;
	}
}

}
