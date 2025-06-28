package mod.addon.ahzmcaaddon.mixin;

import net.minecraft.entity.monster.EntityZombie;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(EntityZombie.class)
public class noburn {

    /**
     * @author
     * e
     * @reason
     * e
     */
    @Overwrite
    protected boolean shouldBurnInDay(){
        return false;

    }

}
