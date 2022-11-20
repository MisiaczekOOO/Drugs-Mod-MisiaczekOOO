package net.kaupenjoe.tutorialmod.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

import java.util.function.Supplier;

public class ModFoods {
    public static final FoodProperties mushroom = (new FoodProperties.Builder()).
            nutrition(1).saturationMod(0.3f).alwaysEat().
            effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,600,4),0.75f).
            effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED,600,4),0.5f).
            effect(() -> new MobEffectInstance(MobEffects.LUCK,600,2),0.25f).build();

    public static final FoodProperties weed = (new FoodProperties.Builder()).
            nutrition(1).saturationMod(0.1f).
            effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 150,1),1f).
            effect(()-> new MobEffectInstance(MobEffects.HUNGER,300,1),1f).
            effect(()-> new MobEffectInstance(MobEffects.CONFUSION, 300,1),1f).build();


}
