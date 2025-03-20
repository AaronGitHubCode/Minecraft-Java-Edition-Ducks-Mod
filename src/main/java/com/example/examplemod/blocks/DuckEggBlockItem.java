package com.example.examplemod.blocks;

import net.minecraft.world.entity.Entity;

import net.minecraft.world.entity.player.Player;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.level.block.Block;


public class DuckEggBlockItem extends BlockItem {
    private int hatchingTime = 100;

    public DuckEggBlockItem(Block p_40565_, Properties p_40566_) {
        super(p_40565_, p_40566_);
    }
}
