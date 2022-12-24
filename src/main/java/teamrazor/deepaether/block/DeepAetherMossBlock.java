package teamrazor.deepaether.block;

import com.gildedgames.aether.block.AetherBlockStateProperties;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.MossBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.data.worldgen.features.CaveFeatures;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import teamrazor.deepaether.world.feature.DeepAetherModConfiguredFeatures;

public class DeepAetherMossBlock extends Block implements BonemealableBlock {
    public DeepAetherMossBlock(BlockBehaviour.Properties p_153790_) {
        super(p_153790_);
        this.registerDefaultState(this.defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, false));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(AetherBlockStateProperties.DOUBLE_DROPS);
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader p_256559_, BlockPos p_50898_, BlockState p_50899_, boolean p_50900_) {
        return p_256559_.getBlockState(p_50898_.above()).isAir();
    }

    @Override
    public boolean isBonemealSuccess(Level pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        return true;
    }

    @Override
    public void performBonemeal(ServerLevel pLevel, RandomSource pRanfom, BlockPos pPos, BlockState pState) {
        pLevel.registryAccess().registry(Registries.CONFIGURED_FEATURE).flatMap((p_258973_) -> {
            return p_258973_.getHolder(DeepAetherModConfiguredFeatures.AETHER_MOSS_PATCH_BONEMEAL);
        }).ifPresent((p_255669_) -> {
            p_255669_.value().place(pLevel, pLevel.getChunkSource().getGenerator(), pRanfom, pPos.above());
        });
    }
}