package com.craft1x.thesdtmfix.mixin;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = EntityLiving.class)
public class TargetMix {

    @Inject(method = "canAttackClass", at = @At("HEAD"), cancellable = true)
    private void canAttack(Class<? extends EntityLivingBase> cls, CallbackInfoReturnable<Boolean> cir) {

        EntityLiving this1 = (EntityLiving) (Object) this;


        if (cls.getName().equals("nuparu.sevendaystomine.entity.EntityBandit") && this1.getClass().getName().equals(cls.getName())) {
            {
                //      System.out.println("FALSED");
                cir.setReturnValue(false);
            }
        }


    }

}
