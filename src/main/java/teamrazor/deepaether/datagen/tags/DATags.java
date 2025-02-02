package teamrazor.deepaether.datagen.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import teamrazor.deepaether.DeepAetherMod;

public class DATags {
    public class Items {
        public static final TagKey<Item> CRAFTS_ROSEROOT_PLANKS = tag("crafts_roseroot_planks");
        public static final TagKey<Item> CRAFTS_YAGROOT_PLANKS = tag("crafts_yagroot_planks");
        public static final TagKey<Item> CRAFTS_CRUDEROOT_PLANKS = tag("crafts_cruderoot_planks");
        public static final TagKey<Item> CRAFTS_AMBERROOT_PLANKS = tag("crafts_cruderoot_planks");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(DeepAetherMod.MODID, name));
        }
    }
    public static class Blocks {

        public static final TagKey<Block> CAN_GOLDEN_VINES_SURVIVE_ON = tag("can_golden_vines_survive_on");
        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registries.BLOCK, new ResourceLocation(DeepAetherMod.MODID, name));
        }
    }

    public static class Biomes {

        public static final TagKey<Biome> IS_NOT_SWAMP = tag("is_not_swamp");
        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registries.BIOME, new ResourceLocation(DeepAetherMod.MODID, name));
        }
    }
}
