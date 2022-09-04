package teamrazor.deepaether.init;

import com.mojang.math.Vector3f;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import teamrazor.deepaether.DeepAetherMod;
import teamrazor.deepaether.block.PoisonBlock;
import teamrazor.deepaether.fluids.DeepAetherModFluidTypes;

public class DeepAetherModFluids {
    public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, DeepAetherMod.MODID);

    public static final RegistryObject<FlowingFluid> POISON_FLUID = REGISTRY.register("poison_fluid", () -> new ForgeFlowingFluid.Source(DeepAetherModFluids.POISON_PROPERTIES));

    public static final RegistryObject<FlowingFluid> POISON_FLOWING = REGISTRY.register("poison_flowing", () -> new ForgeFlowingFluid.Flowing(DeepAetherModFluids.POISON_PROPERTIES));

    public static final ForgeFlowingFluid.Properties POISON_PROPERTIES = new ForgeFlowingFluid.Properties(DeepAetherModFluidTypes.POISON_FLUID_TYPE, POISON_FLUID, POISON_FLOWING)
            .slopeFindDistance(2).levelDecreasePerBlock(2)
            .block(DeepAetherModBlocks.POISON_BLOCK).bucket(DeepAetherModItems.PLACEABLE_POISON_BUCKET);

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
