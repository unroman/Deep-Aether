package teamrazor.deepaether.datagen.loot;

import com.gildedgames.aether.block.AetherBlocks;
import com.gildedgames.aether.data.providers.AetherBlockLootSubProvider;
import com.gildedgames.aether.item.AetherItems;
import com.gildedgames.aether.loot.functions.DoubleDrops;
import com.gildedgames.aether.mixin.mixins.common.accessor.BlockLootAccessor;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import teamrazor.deepaether.init.DABlocks;
import teamrazor.deepaether.init.DAItems;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DABlockLoot extends AetherBlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(AetherBlocks.TREASURE_CHEST.get()).map(ItemLike::asItem).collect(Collectors.toSet());

    public DABlockLoot() {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        this.otherWhenSilkTouch(DABlocks.TALL_AERLAVENDER.get(), DABlocks.AERLAVENDER.get());
        this.otherWhenSilkTouch(DABlocks.TALL_AETHER_CATTAILS.get(), DABlocks.AETHER_CATTAILS.get());


        this.dropSelf(DABlocks.ROSEROOT_WOOD.get());
        this.dropSelf(DABlocks.STRIPPED_ROSEROOT_WOOD.get());
        this.dropSelfDouble(DABlocks.ROSEROOT_LOG.get());
        this.dropSelfDouble(DABlocks.STRIPPED_ROSEROOT_LOG.get());
        this.dropSelf(DABlocks.ROSEROOT_PLANKS.get());
        this.dropSelf(DABlocks.ROSEROOT_SLAB.get());
        this.dropSelf(DABlocks.ROSEROOT_STAIRS.get());
        this.dropSelf(DABlocks.ROSEROOT_FENCE.get());
        this.dropSelf(DABlocks.ROSEROOT_FENCE_GATE.get());
        this.add(DABlocks.ROSEROOT_DOOR.get(), createDoorTable(DABlocks.ROSEROOT_DOOR.get()));
        this.dropSelf(DABlocks.ROSEROOT_TRAPDOOR.get());
        this.dropSelf(DABlocks.ROSEROOT_BUTTON.get());
        this.dropSelf(DABlocks.ROSEROOT_PRESSURE_PLATE.get());
        this.dropSelf(DABlocks.ROSEROOT_WALL.get());
        this.dropSelf(DABlocks.STRIPPED_ROSEROOT_WALL.get());
        this.dropSelf(DABlocks.ROSEROOT_SAPLING.get());
        this.dropPottedContents(DABlocks.POTTED_ROSEROOT_SAPLING.get());
        this.dropSelf(DABlocks.BLUE_ROSEROOT_SAPLING.get());
        this.dropPottedContents(DABlocks.POTTED_BLUE_ROSEROOT_SAPLING.get());
        this.add(DABlocks.ROSEROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.ROSEROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));

        this.add(DABlocks.FLOWERING_ROSEROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.ROSEROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.add(DABlocks.FLOWERING_BLUE_ROSEROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.BLUE_ROSEROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropOther(DABlocks.ROSEROOT_WALL_SIGN.get(), DABlocks.ROSEROOT_SIGN.get());
        this.dropSelf(DABlocks.ROSEROOT_SIGN.get());

        this.dropSelf(DABlocks.AERGLOW_PETAL_BLOCK.get());


        this.dropSelf(DABlocks.YAGROOT_WOOD.get());
        this.dropSelf(DABlocks.STRIPPED_YAGROOT_WOOD.get());
        this.dropSelfDouble(DABlocks.YAGROOT_LOG.get());
        this.dropSelfDouble(DABlocks.STRIPPED_YAGROOT_LOG.get());
        this.dropSelf(DABlocks.YAGROOT_PLANKS.get());
        this.dropSelf(DABlocks.YAGROOT_SLAB.get());
        this.dropSelf(DABlocks.YAGROOT_STAIRS.get());
        this.dropSelf(DABlocks.YAGROOT_FENCE.get());
        this.dropSelf(DABlocks.YAGROOT_FENCE_GATE.get());
        this.add(DABlocks.YAGROOT_DOOR.get(), createDoorTable(DABlocks.YAGROOT_DOOR.get()));
        this.dropSelf(DABlocks.YAGROOT_TRAPDOOR.get());
        this.dropSelf(DABlocks.YAGROOT_BUTTON.get());
        this.dropSelf(DABlocks.YAGROOT_PRESSURE_PLATE.get());
        this.dropSelf(DABlocks.YAGROOT_WALL.get());
        this.dropSelf(DABlocks.STRIPPED_YAGROOT_WALL.get());
        this.dropSelf(DABlocks.YAGROOT_SAPLING.get());
        this.dropPottedContents(DABlocks.POTTED_YAGROOT_SAPLING.get());
        this.add(DABlocks.YAGROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.YAGROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.add(DABlocks.BLUE_ROSEROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.BLUE_ROSEROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropOther(DABlocks.YAGROOT_WALL_SIGN.get(), DABlocks.YAGROOT_SIGN.get());
        this.dropSelf(DABlocks.YAGROOT_SIGN.get());

        this.dropSelf(DABlocks.YAGROOT_ROOTS.get());
        this.dropSelf(DABlocks.MUDDY_YAGROOT_ROOTS.get());



        this.dropSelf(DABlocks.CRUDEROOT_WOOD.get());
        this.dropSelf(DABlocks.STRIPPED_CRUDEROOT_WOOD.get());
        this.dropSelfDouble(DABlocks.CRUDEROOT_LOG.get());
        this.dropSelfDouble(DABlocks.STRIPPED_CRUDEROOT_LOG.get());
        this.dropSelf(DABlocks.CRUDEROOT_PLANKS.get());
        this.dropSelf(DABlocks.CRUDEROOT_SLAB.get());
        this.dropSelf(DABlocks.CRUDEROOT_STAIRS.get());
        this.dropSelf(DABlocks.CRUDEROOT_FENCE.get());
        this.dropSelf(DABlocks.CRUDEROOT_FENCE_GATE.get());
        this.add(DABlocks.CRUDEROOT_DOOR.get(), createDoorTable(DABlocks.CRUDEROOT_DOOR.get()));
        this.dropSelf(DABlocks.CRUDEROOT_TRAPDOOR.get());
        this.dropSelf(DABlocks.CRUDEROOT_BUTTON.get());
        this.dropSelf(DABlocks.CRUDEROOT_PRESSURE_PLATE.get());
        this.dropSelf(DABlocks.CRUDEROOT_WALL.get());
        this.dropSelf(DABlocks.STRIPPED_CRUDEROOT_WALL.get());
        this.dropSelf(DABlocks.CRUDEROOT_SAPLING.get());
        this.dropPottedContents(DABlocks.POTTED_CRUDEROOT_SAPLING.get());
        this.add(DABlocks.CRUDEROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.CRUDEROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropOther(DABlocks.CRUDEROOT_WALL_SIGN.get(), DABlocks.CRUDEROOT_SIGN.get());
        this.dropSelf(DABlocks.CRUDEROOT_SIGN.get());


        this.dropSelf(DABlocks.AMBERROOT_WOOD.get());
        this.dropSelf(DABlocks.STRIPPED_AMBERROOT_WOOD.get());
        this.dropSelfDouble(DABlocks.AMBERROOT_LOG.get());
        this.dropSelfDouble(DABlocks.STRIPPED_AMBERROOT_LOG.get());
        this.dropSelf(DABlocks.AMBERROOT_PLANKS.get());
        this.dropSelf(DABlocks.AMBERROOT_SLAB.get());
        this.dropSelf(DABlocks.AMBERROOT_STAIRS.get());
        this.dropSelf(DABlocks.AMBERROOT_FENCE.get());
        this.dropSelf(DABlocks.AMBERROOT_FENCE_GATE.get());
        this.add(DABlocks.AMBERROOT_DOOR.get(), createDoorTable(DABlocks.AMBERROOT_DOOR.get()));
        this.dropSelf(DABlocks.AMBERROOT_TRAPDOOR.get());
        this.dropSelf(DABlocks.AMBERROOT_BUTTON.get());
        this.dropSelf(DABlocks.AMBERROOT_PRESSURE_PLATE.get());
        this.dropSelf(DABlocks.AMBERROOT_WALL.get());
        this.dropSelf(DABlocks.STRIPPED_AMBERROOT_WALL.get());
        this.dropSelf(DABlocks.AMBERROOT_SAPLING.get());
        this.dropPottedContents(DABlocks.POTTED_AMBERROOT_SAPLING.get());
        this.add(DABlocks.AMBERROOT_LEAVES.get(),
                (leaves) -> droppingWithChancesAndSkyrootSticks(leaves, DABlocks.AMBERROOT_SAPLING.get(), BlockLootAccessor.aether$getNormalLeavesSaplingChances()));
        this.dropOther(DABlocks.AMBERROOT_WALL_SIGN.get(), DABlocks.AMBERROOT_SIGN.get());
        this.dropSelf(DABlocks.AMBERROOT_SIGN.get());


        this.dropSelf(DABlocks.AETHER_MUD.get());
        this.dropSelf(DABlocks.PACKED_AETHER_MUD.get());
        this.dropSelf(DABlocks.AETHER_MUD_BRICKS.get());
        this.dropSelf(DABlocks.AETHER_MUD_BRICKS_SLAB.get());
        this.dropSelf(DABlocks.AETHER_MUD_BRICKS_STAIRS.get());

        this.dropSelf(DABlocks.AETHER_MOSS_BLOCK.get());
        this.dropSelf(DABlocks.AETHER_MOSS_CARPET.get());
        this.dropDoubleWithSilk(DABlocks.GOLDEN_FIELD_GRASS_BLOCK.get(), AetherBlocks.AETHER_DIRT.get());

        //ORES
        this.dropWithFortune(DABlocks.SKYJADE_ORE.get(), DAItems.SKYJADE.get());
        this.dropSelf(DABlocks.SKYJADE_BLOCK.get());

        this.dropSelf(DABlocks.CLOUDIUM_DEBRIS.get());
        this.dropSelf(DABlocks.CLOUDIUM_BLOCK.get());


        //STONES

        this.dropSelf(DABlocks.ASETERITE.get());
        this.dropSelf(DABlocks.ASETERITE_SLAB.get());
        this.dropSelf(DABlocks.ASETERITE_STAIRS.get());
        this.dropSelf(DABlocks.ASETERITE_WALL.get());
        this.dropSelf(DABlocks.POLISHED_ASETERITE.get());
        this.dropSelf(DABlocks.POLISHED_ASETERITE_SLAB.get());
        this.dropSelf(DABlocks.POLISHED_ASETERITE_STAIRS.get());

        this.dropSelf(DABlocks.CLORITE.get());
        this.dropSelf(DABlocks.CLORITE_SLAB.get());
        this.dropSelf(DABlocks.CLORITE_STAIRS.get());
        this.dropSelf(DABlocks.CLORITE_WALL.get());
        this.dropSelf(DABlocks.POLISHED_CLORITE.get());
        this.dropSelf(DABlocks.POLISHED_CLORITE_SLAB.get());
        this.dropSelf(DABlocks.POLISHED_CLORITE_STAIRS.get());
        this.dropSelf(DABlocks.CLORITE_PILLAR.get());

        this.dropSelf(DABlocks.HOLYSTONE_TILES.get());
        this.dropSelf(DABlocks.HOLYSTONE_TILE_SLAB.get());
        this.dropSelf(DABlocks.HOLYSTONE_TILE_STAIRS.get());
        this.dropSelf(DABlocks.HOLYSTONE_TILE_WALL.get());

        this.dropSelf(DABlocks.MOSSY_HOLYSTONE_TILES.get());
        this.dropSelf(DABlocks.MOSSY_HOLYSTONE_TILE_WALL.get());
        this.dropSelf(DABlocks.MOSSY_HOLYSTONE_TILE_SLAB.get());
        this.dropSelf(DABlocks.MOSSY_HOLYSTONE_TILE_STAIRS.get());


        this.dropSelf(DABlocks.AERLAVENDER.get());


        this.dropSelf(DABlocks.AETHER_CATTAILS.get());
        this.dropNone(DABlocks.MINI_GOLDEN_GRASS.get());
        this.dropNone(DABlocks.SHORT_GOLDEN_GRASS.get());
        this.dropNone(DABlocks.MEDIUM_GOLDEN_GRASS.get());
        this.dropNone(DABlocks.TALL_GOLDEN_GRASS.get());

        this.dropSelf(DABlocks.RADIANT_ORCHID.get());
        this.dropPottedContents(DABlocks.POTTED_AERLAVENDER.get());
        this.dropPottedContents(DABlocks.POTTED_TALL_AERLAVENDER.get());
        this.dropPottedContents(DABlocks.POTTED_AETHER_CATTAILS.get());
        this.dropPottedContents(DABlocks.POTTED_TALL_AETHER_CATTAILS.get());
        this.dropPottedContents(DABlocks.POTTED_RADIANT_ORCHID.get());

        this.dropNone(DABlocks.VIRULENT_QUICKSAND.get());

        this.dropSelf(DABlocks.YAGROOT_VINE.get());

        this.dropNone(DABlocks.AGATE_BLOCK.get());
        this.dropNone(DABlocks.AGATE_ORE.get());
        this.dropNone(DABlocks.HIGHSTONE_AGATE_ORE.get());

        this.dropNone(DABlocks.ADIBIUM_BLOCK.get());
        this.dropNone(DABlocks.ADIBIUM_ORE.get());
        this.dropNone(DABlocks.HIGHSTONE_ADIBIUM_ORE.get());

        this.dropNone(DABlocks.ORATIE_BLOCK.get());
        this.dropNone(DABlocks.RAW_ORATIE_BLOCK.get());
        this.dropNone(DABlocks.ORATIE_ORE.get());
        this.dropNone(DABlocks.HIGHSTONE_ORATIE_ORE.get());

        this.dropOther(DABlocks.POISON_CAULDRON.get(), Blocks.CAULDRON.asItem());


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    public LootTable.Builder droppingWithChancesAndSkyrootSticksAndAerglowPetal(Block block, Block sapling, float... chances) {
        return createSilkTouchOrShearsDispatchTable(block, this.applyExplosionCondition(block, LootItem.lootTableItem(sapling)).when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, chances)))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1)).when(BlockLootAccessor.aether$hasShearsOrSilkTouch().invert())
                        .add(this.applyExplosionDecay(block,
                                        LootItem.lootTableItem(AetherItems.SKYROOT_STICK.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))))
                        .add(this.applyExplosionDecay(block,
                                    LootItem.lootTableItem(DAItems.AERGLOW_PETAL.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F))))
                                .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, 0.12F, 0.122222223F, 0.125F, 0.133333335F, 0.2F))))
                .apply(DoubleDrops.builder());
    }
}
