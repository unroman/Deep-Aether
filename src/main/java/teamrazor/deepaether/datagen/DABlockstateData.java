package teamrazor.deepaether.datagen;

import com.gildedgames.aether.block.AetherBlockStateProperties;
import com.gildedgames.aether.data.providers.AetherBlockStateProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.init.DABlocks;


public class DABlockstateData extends AetherBlockStateProvider {
    public DABlockstateData(PackOutput output, ExistingFileHelper helper) {
        super(output, DeepAetherMod.MODID, helper);
    }

    @Override
    public void registerStatesAndModels() {

        //WOOD ROSEROOT

        this.wood((RotatedPillarBlock) DABlocks.ROSEROOT_WOOD.get(), (RotatedPillarBlock) DABlocks.ROSEROOT_LOG.get());
        this.log((RotatedPillarBlock) DABlocks.ROSEROOT_LOG.get());
        this.wood((RotatedPillarBlock) DABlocks.STRIPPED_ROSEROOT_WOOD.get(), (RotatedPillarBlock) DABlocks.STRIPPED_ROSEROOT_LOG.get());
        this.log((RotatedPillarBlock) DABlocks.STRIPPED_ROSEROOT_LOG.get());
        this.block(DABlocks.ROSEROOT_PLANKS.get());
        this.slab((SlabBlock) DABlocks.ROSEROOT_SLAB.get(), DABlocks.ROSEROOT_PLANKS.get());
        this.stairs((StairBlock) DABlocks.ROSEROOT_STAIRS.get(), DABlocks.ROSEROOT_PLANKS.get());
        this.fence((FenceBlock) DABlocks.ROSEROOT_FENCE.get(), DABlocks.ROSEROOT_PLANKS.get());
        this.fenceGateBlock((FenceGateBlock) DABlocks.ROSEROOT_FENCE_GATE.get(), DABlocks.ROSEROOT_PLANKS.get());
        this.doorBlock((DoorBlock) DABlocks.ROSEROOT_DOOR.get(), this.texture(this.name(DABlocks.ROSEROOT_DOOR.get()) + "_bottom"), this.texture(this.name(DABlocks.ROSEROOT_DOOR.get())+ "_top"));
        this.trapdoorBlock((TrapDoorBlock) DABlocks.ROSEROOT_TRAPDOOR.get(), this.texture(this.name(DABlocks.ROSEROOT_TRAPDOOR.get())), false);
        this.buttonBlock((ButtonBlock) DABlocks.ROSEROOT_BUTTON.get(), this.texture(this.name(DABlocks.ROSEROOT_PLANKS.get())));
        this.pressurePlateBlock((PressurePlateBlock) DABlocks.ROSEROOT_PRESSURE_PLATE.get(), this.texture(this.name(DABlocks.ROSEROOT_PLANKS.get())));
        this.wallBlock((WallBlock) DABlocks.ROSEROOT_WALL.get(), DABlocks.ROSEROOT_LOG.get());
        this.wallBlock((WallBlock) DABlocks.STRIPPED_ROSEROOT_WALL.get(), DABlocks.STRIPPED_ROSEROOT_LOG.get());
        this.saplingBlock(DABlocks.ROSEROOT_SAPLING.get());
        this.pottedPlant(DABlocks.POTTED_ROSEROOT_SAPLING.get(), DABlocks.ROSEROOT_SAPLING.get());
        this.block(DABlocks.ROSEROOT_LEAVES.get());
        this.block(DABlocks.FLOWERING_ROSEROOT_LEAVES.get());
        this.block(DABlocks.AERGLOW_PETAL_BLOCK.get());
        this.signBlock((StandingSignBlock) DABlocks.ROSEROOT_SIGN.get(), (WallSignBlock) DABlocks.ROSEROOT_WALL_SIGN.get(), this.texture(this.name(DABlocks.ROSEROOT_PLANKS.get())));

        //WOOD YAGROOT

        this.wood((RotatedPillarBlock) DABlocks.YAGROOT_WOOD.get(), (RotatedPillarBlock) DABlocks.YAGROOT_LOG.get());
        this.log((RotatedPillarBlock) DABlocks.YAGROOT_LOG.get());
        this.wood((RotatedPillarBlock) DABlocks.STRIPPED_YAGROOT_WOOD.get(), (RotatedPillarBlock) DABlocks.STRIPPED_YAGROOT_LOG.get());
        this.log((RotatedPillarBlock) DABlocks.STRIPPED_YAGROOT_LOG.get());
        this.block(DABlocks.YAGROOT_PLANKS.get());
        this.slab((SlabBlock) DABlocks.YAGROOT_SLAB.get(), DABlocks.YAGROOT_PLANKS.get());
        this.stairs((StairBlock) DABlocks.YAGROOT_STAIRS.get(), DABlocks.YAGROOT_PLANKS.get());
        this.fence((FenceBlock) DABlocks.YAGROOT_FENCE.get(), DABlocks.YAGROOT_PLANKS.get());
        this.fenceGateBlock((FenceGateBlock) DABlocks.YAGROOT_FENCE_GATE.get(), DABlocks.YAGROOT_PLANKS.get());
        this.doorBlock((DoorBlock) DABlocks.YAGROOT_DOOR.get(), this.texture(this.name(DABlocks.YAGROOT_DOOR.get())+ "_bottom"), this.texture(this.name(DABlocks.YAGROOT_DOOR.get())+ "_top"));
        this.trapdoorBlock((TrapDoorBlock) DABlocks.YAGROOT_TRAPDOOR.get(), this.texture(this.name(DABlocks.YAGROOT_TRAPDOOR.get())), false);
        this.buttonBlock((ButtonBlock) DABlocks.YAGROOT_BUTTON.get(), this.texture(this.name(DABlocks.YAGROOT_PLANKS.get())));
        this.pressurePlateBlock((PressurePlateBlock) DABlocks.YAGROOT_PRESSURE_PLATE.get(), this.texture(this.name(DABlocks.YAGROOT_PLANKS.get())));
        this.wallBlock((WallBlock) DABlocks.YAGROOT_WALL.get(), DABlocks.YAGROOT_LOG.get());
        this.wallBlock((WallBlock) DABlocks.STRIPPED_YAGROOT_WALL.get(), DABlocks.STRIPPED_YAGROOT_LOG.get());
        this.saplingBlock(DABlocks.YAGROOT_SAPLING.get());
        this.pottedPlant(DABlocks.POTTED_YAGROOT_SAPLING.get(), DABlocks.YAGROOT_SAPLING.get());
        this.block(DABlocks.YAGROOT_LEAVES.get());
        this.signBlock((StandingSignBlock) DABlocks.YAGROOT_SIGN.get(), (WallSignBlock) DABlocks.YAGROOT_WALL_SIGN.get(), this.texture(this.name(DABlocks.YAGROOT_PLANKS.get())));

        //WOOD CRUDEROOT

        this.wood((RotatedPillarBlock) DABlocks.CRUDEROOT_WOOD.get(), (RotatedPillarBlock) DABlocks.CRUDEROOT_LOG.get());
        this.log((RotatedPillarBlock) DABlocks.CRUDEROOT_LOG.get());
        this.wood((RotatedPillarBlock) DABlocks.STRIPPED_CRUDEROOT_WOOD.get(), (RotatedPillarBlock) DABlocks.STRIPPED_CRUDEROOT_LOG.get());
        this.log((RotatedPillarBlock) DABlocks.STRIPPED_CRUDEROOT_LOG.get());
        this.block(DABlocks.CRUDEROOT_PLANKS.get());
        this.slab((SlabBlock) DABlocks.CRUDEROOT_SLAB.get(), DABlocks.CRUDEROOT_PLANKS.get());
        this.stairs((StairBlock) DABlocks.CRUDEROOT_STAIRS.get(), DABlocks.CRUDEROOT_PLANKS.get());
        this.fence((FenceBlock) DABlocks.CRUDEROOT_FENCE.get(), DABlocks.CRUDEROOT_PLANKS.get());
        this.fenceGateBlock((FenceGateBlock) DABlocks.CRUDEROOT_FENCE_GATE.get(), DABlocks.CRUDEROOT_PLANKS.get());
        this.doorBlock((DoorBlock) DABlocks.CRUDEROOT_DOOR.get(), this.texture(this.name(DABlocks.CRUDEROOT_DOOR.get())+ "_bottom"), this.texture(this.name(DABlocks.CRUDEROOT_DOOR.get())+ "_top"));
        this.trapdoorBlock((TrapDoorBlock) DABlocks.CRUDEROOT_TRAPDOOR.get(), this.texture(this.name(DABlocks.CRUDEROOT_TRAPDOOR.get())), false);
        this.buttonBlock((ButtonBlock) DABlocks.CRUDEROOT_BUTTON.get(), this.texture(this.name(DABlocks.CRUDEROOT_PLANKS.get())));
        this.pressurePlateBlock((PressurePlateBlock) DABlocks.CRUDEROOT_PRESSURE_PLATE.get(), this.texture(this.name(DABlocks.CRUDEROOT_PLANKS.get())));
        this.wallBlock((WallBlock) DABlocks.CRUDEROOT_WALL.get(), DABlocks.CRUDEROOT_LOG.get());
        this.wallBlock((WallBlock) DABlocks.STRIPPED_CRUDEROOT_WALL.get(), DABlocks.STRIPPED_CRUDEROOT_LOG.get());
        this.saplingBlock(DABlocks.CRUDEROOT_SAPLING.get());
        this.pottedPlant(DABlocks.POTTED_CRUDEROOT_SAPLING.get(), DABlocks.CRUDEROOT_SAPLING.get());
        this.block(DABlocks.CRUDEROOT_LEAVES.get());
        this.signBlock((StandingSignBlock) DABlocks.CRUDEROOT_SIGN.get(), (WallSignBlock) DABlocks.CRUDEROOT_WALL_SIGN.get(), this.texture(this.name(DABlocks.CRUDEROOT_PLANKS.get())));

        //MUD

        this.blockDoubleDrops(DABlocks.AETHER_MUD.get());
        this.block(DABlocks.PACKED_AETHER_MUD.get());
        this.block(DABlocks.AETHER_MUD_BRICKS.get());
        this.slab((SlabBlock) DABlocks.AETHER_MUD_BRICKS_SLAB.get(), DABlocks.AETHER_MUD_BRICKS.get());
        this.stairs((StairBlock) DABlocks.AETHER_MUD_BRICKS_STAIRS.get(), DABlocks.AETHER_MUD_BRICKS.get());

        //ORES

        this.block(DABlocks.SKYJADE_ORE.get());
        this.block(DABlocks.SKYJADE_BLOCK.get());

        this.block(DABlocks.AGATE_ORE.get());
        this.block(DABlocks.HIGHSTONE_AGATE_ORE.get());
        this.block(DABlocks.AGATE_BLOCK.get());

        this.block(DABlocks.ADIBIUM_ORE.get());
        this.block(DABlocks.HIGHSTONE_ADIBIUM_ORE.get());
        this.block(DABlocks.ADIBIUM_BLOCK.get());

        this.block(DABlocks.ORATIE_BLOCK.get());
        this.block(DABlocks.ORATIE_ORE.get());
        this.block(DABlocks.RAW_ORATIE_BLOCK.get());
        this.block(DABlocks.HIGHSTONE_ORATIE_ORE.get());

        this.block(DABlocks.CLOUDIUM_BLOCK.get());

    
        //STONE
        //ASETERITE
    
        this.blockDoubleDrops(DABlocks.ASETERITE.get());
        this.stairs((StairBlock) DABlocks.ASETERITE_STAIRS.get(), DABlocks.ASETERITE.get());
        this.slab((SlabBlock) DABlocks.ASETERITE_SLAB.get(), DABlocks.ASETERITE.get());
        this.wallBlock((WallBlock) DABlocks.ASETERITE_WALL.get(), DABlocks.ASETERITE.get());
        this.block(DABlocks.POLISHED_ASETERITE.get());
        this.stairs((StairBlock) DABlocks.POLISHED_ASETERITE_STAIRS.get(), DABlocks.POLISHED_ASETERITE.get());
        this.slab((SlabBlock) DABlocks.POLISHED_ASETERITE_SLAB.get(), DABlocks.POLISHED_ASETERITE.get());
    
        //GREOTITE
    
        this.blockDoubleDrops(DABlocks.GREOTITE.get());
        this.stairs((StairBlock) DABlocks.GREOTITE_STAIRS.get(), DABlocks.GREOTITE.get());
        this.slab((SlabBlock) DABlocks.GREOTITE_SLAB.get(), DABlocks.GREOTITE.get());
        this.wallBlock((WallBlock) DABlocks.GREOTITE_WALL.get(), DABlocks.GREOTITE.get());
        this.block(DABlocks.POLISHED_GREOTITE.get());
        this.stairs((StairBlock) DABlocks.POLISHED_GREOTITE_STAIRS.get(), DABlocks.POLISHED_GREOTITE.get());
        this.slab((SlabBlock) DABlocks.POLISHED_GREOTITE_SLAB.get(), DABlocks.POLISHED_GREOTITE.get());
    
        //CLORITE        
        
        this.blockDoubleDrops(DABlocks.CLORITE.get());
        this.stairs((StairBlock) DABlocks.CLORITE_STAIRS.get(), DABlocks.CLORITE.get());
        this.slab((SlabBlock) DABlocks.CLORITE_SLAB.get(), DABlocks.CLORITE.get());
        this.wallBlock((WallBlock) DABlocks.CLORITE_WALL.get(), DABlocks.CLORITE.get());
        this.block(DABlocks.POLISHED_CLORITE.get());
        this.stairs((StairBlock) DABlocks.POLISHED_CLORITE_STAIRS.get(), DABlocks.POLISHED_CLORITE.get());
        this.slab((SlabBlock) DABlocks.POLISHED_CLORITE_SLAB.get(), DABlocks.POLISHED_CLORITE.get());
    
        //JARINITE

        this.blockDoubleDrops(DABlocks.JARINITE.get());
        this.stairs((StairBlock) DABlocks.JARINITE_STAIRS.get(), DABlocks.JARINITE.get());
        this.slab((SlabBlock) DABlocks.JARINITE_SLAB.get(), DABlocks.JARINITE.get());
        this.wallBlock((WallBlock) DABlocks.JARINITE_WALL.get(), DABlocks.JARINITE.get());
        this.block(DABlocks.POLISHED_JARINITE.get());
        this.stairs((StairBlock) DABlocks.POLISHED_JARINITE_STAIRS.get(), DABlocks.POLISHED_JARINITE.get());
        this.slab((SlabBlock) DABlocks.POLISHED_JARINITE_SLAB.get(), DABlocks.POLISHED_JARINITE.get());
    
        //YALLESITE

        this.blockDoubleDrops(DABlocks.YALLESITE.get());
        this.stairs((StairBlock) DABlocks.YALLESITE_STAIRS.get(), DABlocks.YALLESITE.get());
        this.slab((SlabBlock) DABlocks.YALLESITE_SLAB.get(), DABlocks.YALLESITE.get());
        this.wallBlock((WallBlock) DABlocks.YALLESITE_WALL.get(), DABlocks.YALLESITE.get());
        this.block(DABlocks.POLISHED_YALLESITE.get());
        this.stairs((StairBlock) DABlocks.POLISHED_YALLESITE_STAIRS.get(), DABlocks.POLISHED_YALLESITE.get());
        this.slab((SlabBlock) DABlocks.POLISHED_YALLESITE_SLAB.get(), DABlocks.POLISHED_YALLESITE.get());
    
        //DARKERITE

        this.blockDoubleDrops(DABlocks.DARKERITE.get());
        this.stairs((StairBlock) DABlocks.DARKERITE_STAIRS.get(), DABlocks.DARKERITE.get());
        this.slab((SlabBlock) DABlocks.DARKERITE_SLAB.get(), DABlocks.DARKERITE.get());
        this.wallBlock((WallBlock) DABlocks.DARKERITE_WALL.get(), DABlocks.DARKERITE.get());
        this.block(DABlocks.POLISHED_DARKERITE.get());
        this.stairs((StairBlock) DABlocks.POLISHED_DARKERITE_STAIRS.get(), DABlocks.POLISHED_DARKERITE.get());
        this.slab((SlabBlock) DABlocks.POLISHED_DARKERITE_SLAB.get(), DABlocks.POLISHED_DARKERITE.get());
    
        //HOLYSYONE BRICKS

        this.block(DABlocks.HOLYSTONE_BRICKS.get());
        this.stairs((StairBlock) DABlocks.HOLYSTONE_BRICKS_STAIRS.get(), DABlocks.HOLYSTONE_BRICKS.get());
        this.slab((SlabBlock) DABlocks.HOLYSTONE_BRICKS_SLAB.get(), DABlocks.HOLYSTONE_BRICKS.get());
    
        //PLANTS

        this.crossBlock(DABlocks.AERLAVENDER.get());
        this.crossBlock(DABlocks.TALL_AERLAVENDER.get());
        this.crossBlock(DABlocks.RADIANT_ORCHID.get());
        this.pottedPlant(DABlocks.POTTED_AERLAVENDER.get(), DABlocks.AERLAVENDER.get());
        this.pottedPlant(DABlocks.POTTED_TALL_AERLAVENDER.get(), DABlocks.TALL_AERLAVENDER.get());
        this.pottedPlant(DABlocks.POTTED_RADIANT_ORCHID.get(), DABlocks.RADIANT_ORCHID.get());

        //MISC

        this.block(DABlocks.VIRULENT_QUICKSAND.get());

        //MOSS
        this.block(DABlocks.AETHER_MOSS_BLOCK.get());
    }

    public ResourceLocation texture(String name, String suffix) {
        return this.modLoc("block/"  + name + suffix);
    }

    public void fence(FenceBlock block, Block baseBlock) {
        this.fenceBlock(block, this.texture(this.name(baseBlock)));
        this.fenceColumn(block, this.name(baseBlock));
    }
    public void fenceColumn(CrossCollisionBlock block, String side) {
        String baseName = this.name(block);
        this.fourWayBlock(block,
                this.models().fencePost(baseName + "_post", this.texture(side)),
                this.models().fenceSide(baseName + "_side", this.texture(side)));
    }

    public ModelFile cubeBottomTop(String block, ResourceLocation side, ResourceLocation bottom, ResourceLocation top) {
        return this.models().cubeBottomTop(block, side, bottom, top);
    }

    public void fenceGateBlock(FenceGateBlock block, Block baseBlock) {
        this.fenceGateBlockInternal(block, this.name(block), this.texture(this.name(baseBlock)));
    }
    public void log(RotatedPillarBlock block) {
        this.axisBlock(block, this.texture(this.name(block)), this.extend(this.texture(this.name(block)), "_top"));
    }

    public void wood(RotatedPillarBlock block, RotatedPillarBlock baseBlock) {
        this.axisBlock(block, this.texture(this.name(baseBlock)), this.texture(this.name(baseBlock)));
    }

    public void block(Block block) {
        this.simpleBlock(block, this.cubeAll(block));
    }

    public void crossBlock(Block block) {
        this.crossBlock(block, models().cross(this.name(block), this.texture(this.name(block))).renderType(new ResourceLocation("cutout")));
    }
    public void pottedPlant(Block block, Block flower) {
        ModelFile pot = this.models().withExistingParent(this.name(block), this.mcLoc("block/flower_pot_cross")).texture("plant", this.modLoc("block/"  + this.name(flower))).renderType(new ResourceLocation("cutout"));
        this.getVariantBuilder(block).partialState().addModels(new ConfiguredModel(pot));
    }

    public void saplingBlock(Block block) {
        ModelFile sapling = models().cross(this.name(block), this.texture(this.name(block))).renderType(new ResourceLocation("cutout"));
        this.getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(sapling).build(), SaplingBlock.STAGE);
    }

    public void stairs(StairBlock block, Block baseBlock) {
        this.stairsBlock(block, this.texture(this.name(baseBlock)));
    }

    public void slab(SlabBlock block, Block baseBlock) {
        this.slabBlock(block, this.texture(this.name(baseBlock)), this.texture(this.name(baseBlock)));
    }

    public void wallBlock(WallBlock block, Block baseBlock) {
        this.wallBlockInternal(block, this.name(block), this.texture(this.name(baseBlock)));
    }
    public void blockDoubleDrops(Block block) {
        this.getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(this.cubeAll(block)).build(), AetherBlockStateProperties.DOUBLE_DROPS);
    }
}