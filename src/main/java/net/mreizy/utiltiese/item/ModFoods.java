package net.mreizy.utiltiese.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties COOKED_APPLE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(1).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 200 ), 0.1F).build();
}
