package net.pedroksl.advanced_ae.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.pedroksl.advanced_ae.AdvancedAE;
import net.pedroksl.advanced_ae.common.AAEItemAndBlock;

public class AAEBlockStateProvider extends BlockStateProvider {
	public AAEBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, AdvancedAE.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		blockWithItem(ForgeRegistries.BLOCKS.getValue(AAEItemAndBlock.ADV_PATTERN_PROVIDER.getRegistryName()));
	}

	private void blockWithItem(Block blockRegistryObject) {
		simpleBlockWithItem(blockRegistryObject, cubeAll(blockRegistryObject));
	}
}