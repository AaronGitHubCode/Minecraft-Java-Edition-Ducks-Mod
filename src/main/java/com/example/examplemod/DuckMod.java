package com.example.examplemod;

import com.example.examplemod.entities.Duck;

import net.minecraft.world.food.FoodProperties;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.component.ItemAttributeModifiers;

import net.minecraft.world.level.block.Block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraftforge.fml.common.Mod;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(DuckMod.MODID)
public final class DuckMod {
    public static final String MODID = "Minecraft: Ducks mod";

    private static final int DEFAULT_STACK_SIZE = 64;
    private static final int NUTRITION = 2;

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    // TODO: Implementar modelo 3D de un huevo de pato. (Por ahora para pruebas será un bloque de tierra).
    private static final RegistryObject<Block> DUCK_EGG_BLOCK = BLOCKS.register("duck_egg_block", () -> new Block(
            BlockBehaviour.Properties.of().mapColor(MapColor.DIRT)
    ));

    private static final RegistryObject<Item> DUCK_EGG_BLOCK_ITEM = ITEMS.register("duck_egg_block_item", () -> new Item(
            new Item.Properties()
                    .stacksTo(1)
    ));

    private static final RegistryObject<Item> SPAWN_EGG_ITEM = ITEMS.register("duck_egg", () -> new Item(
            new Item.Properties()
                    .overrideDescription(Duck.MOB_DESCRIPTION)
    ));

    // Definición de los atributos de la carne de pato sin cocinar.
    private static final RegistryObject<Item> DUCK_FOOD_ITEM_NO_BURNED = ITEMS.register("duck_food", () -> new Item(
            new Item.Properties()
                    .stacksTo(DEFAULT_STACK_SIZE)
                    .attributes(ItemAttributeModifiers.builder()
                            .build())
                    .food(new FoodProperties.Builder()
                            .nutrition(NUTRITION)
                            .build())
    ));

    // Definición de los atributos de la carne de pato cocinada.
    private static final RegistryObject<Item> DUCK_FOOD_ITEM_BURNED = ITEMS.register("duck_food_burn", () -> new Item(
            new Item.Properties()
                    .stacksTo(DEFAULT_STACK_SIZE)
                    .attributes(ItemAttributeModifiers.builder()
                            .build())
                    .food(new FoodProperties.Builder()
                            .nutrition(NUTRITION * 2)
                            .build())
    ));

    public DuckMod(final FMLJavaModLoadingContext context) {
        setup(context);
    }

    private void setup(final FMLJavaModLoadingContext context) {
        final var modEventBus = context.getModEventBus();
        modEventBus.addListener(this::addCreative);
        ITEMS.register(modEventBus);
    }

    // Añadir huevo de generación a la sección de huevos de generación.
    private void addCreative(final BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

        }
    }
}
