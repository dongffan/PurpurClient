package org.purpurmc.purpur.client.mixin.mob;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.MuleEntity;
import net.minecraft.world.World;
import org.purpurmc.purpur.client.entity.RidableEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MuleEntity.class)
public abstract class MixinMule extends MobEntity implements RidableEntity {
    public MixinMule(EntityType<? extends MuleEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public double getMountedHeightOffset() {
        return (double) getHeight() * getSeats().mule.y;
    }

    @Override
    public void updatePassengerPosition(Entity passenger) {
        updatePassengerPosition(passenger, getSeats().mule);
    }
}
