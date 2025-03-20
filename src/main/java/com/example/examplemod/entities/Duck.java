package com.example.examplemod.entities;

import net.minecraft.nbt.CompoundTag;

import net.minecraft.network.syncher.SynchedEntityData;

import net.minecraft.server.level.ServerLevel;

import net.minecraft.world.damagesource.DamageSource;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import net.minecraft.world.level.Level;

public final class Duck extends Entity {
    public static final String MOB_DESCRIPTION = "TEST!";

    public Duck(final EntityType<?> p_19870_, final Level p_19871_) {
        super(p_19870_, p_19871_);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder p_333664_) {

    }

    @Override
    public boolean hurtServer(ServerLevel p_365506_, DamageSource p_366233_, float p_368913_) {
        return false;
    }

    @Override
    protected void readAdditionalSaveData(CompoundTag p_20052_) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag p_20139_) {

    }
}
