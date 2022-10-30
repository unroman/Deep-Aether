package teamrazor.deepaether.tags;
import net.minecraft.world.item.ItemStack;

public interface SkyjadeTool {
    default float decreaseSpeed(ItemStack stack, float speed) {
        return (float) ((float) speed * (2.0 * ((double) stack.getDamageValue()) / ((double) stack.getMaxDamage()) + 0.5));
    }
}
