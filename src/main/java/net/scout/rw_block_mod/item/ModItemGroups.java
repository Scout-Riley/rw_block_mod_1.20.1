package net.scout.rw_block_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scout.rw_block_mod.BlockMod;
import net.scout.rw_block_mod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup RAIN_WORLD_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.BIG_BRICKS_WORN_1)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BIG_BRICKS_WORN_1);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_2);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_3);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_4);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_5);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_6);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_1);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_2);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_3);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_4);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_5);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_6);
                        entries.add(ModBlocks.BIGMETAL_WORN_1);
                        entries.add(ModBlocks.BIGMETAL_WORN_2);
                        entries.add(ModBlocks.BIGMETAL_WORN_3);
                        entries.add(ModBlocks.BIGMETAL_WORN_4);
                        entries.add(ModBlocks.BIGMETAL_WORN_5);
                        entries.add(ModBlocks.BIGMETAL_WORN_6);
                        entries.add(ModBlocks.BRICKS_WORN_1);
                        entries.add(ModBlocks.BRICKS_WORN_2);
                        entries.add(ModBlocks.BRICKS_WORN_3);
                        entries.add(ModBlocks.BRICKS_WORN_4);
                        entries.add(ModBlocks.BRICKS_WORN_5);
                        entries.add(ModBlocks.BRICKS_WORN_6);
                        entries.add(ModBlocks.CHAOS_WORN_1);
                        entries.add(ModBlocks.CHAOS_WORN_2);
                        entries.add(ModBlocks.CHAOS_WORN_3);
                        entries.add(ModBlocks.CHAOS_WORN_4);
                        entries.add(ModBlocks.CHAOS_WORN_5);
                        entries.add(ModBlocks.CHAOS_WORN_6);
                        entries.add(ModBlocks.CONCRETE_CLEAN_1);
                        entries.add(ModBlocks.CONCRETE_CLEAN_2);
                        entries.add(ModBlocks.CONCRETE_CLEAN_3);
                        entries.add(ModBlocks.CONCRETE_CLEAN_4);
                        entries.add(ModBlocks.CONCRETE_CLEAN_5);
                        entries.add(ModBlocks.CONCRETE_CLEAN_6);
                        entries.add(ModBlocks.METAL_1);
                        entries.add(ModBlocks.METAL_2);
                        entries.add(ModBlocks.METAL_3);
                        entries.add(ModBlocks.METAL_4);
                        entries.add(ModBlocks.METAL_5);
                        entries.add(ModBlocks.METAL_6);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_1);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_2);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_3);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_4);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_5);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_6);
                        entries.add(ModBlocks.RANDOM_MACHINES_1);
                        entries.add(ModBlocks.SMALL_PIPES_CLEAN_1);
                        entries.add(ModBlocks.SMALL_PIPES_WORN_1);
                        entries.add(ModBlocks.TRASH_CLEAN_1);
                        entries.add(ModBlocks.TRASH_CLEAN_2);
                        entries.add(ModBlocks.TRASH_CLEAN_3);
                        entries.add(ModBlocks.TRASH_CLEAN_4);
                        entries.add(ModBlocks.TRASH_CLEAN_5);
                        entries.add(ModBlocks.TRASH_CLEAN_6);



                        entries.add(ModBlocks.BIG_BRICKS_WORN_STAIRS_1);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_STAIRS_2);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_STAIRS_3);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_STAIRS_4);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_STAIRS_5);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_STAIRS_6);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_STAIRS_1);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_STAIRS_2);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_STAIRS_3);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_STAIRS_4);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_STAIRS_5);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_STAIRS_6);
                        entries.add(ModBlocks.BIGMETAL_WORN_STAIRS_1);
                        entries.add(ModBlocks.BIGMETAL_WORN_STAIRS_2);
                        entries.add(ModBlocks.BIGMETAL_WORN_STAIRS_3);
                        entries.add(ModBlocks.BIGMETAL_WORN_STAIRS_4);
                        entries.add(ModBlocks.BIGMETAL_WORN_STAIRS_5);
                        entries.add(ModBlocks.BIGMETAL_WORN_STAIRS_6);
                        entries.add(ModBlocks.BRICKS_WORN_STAIRS_1);
                        entries.add(ModBlocks.BRICKS_WORN_STAIRS_2);
                        entries.add(ModBlocks.BRICKS_WORN_STAIRS_3);
                        entries.add(ModBlocks.BRICKS_WORN_STAIRS_4);
                        entries.add(ModBlocks.BRICKS_WORN_STAIRS_5);
                        entries.add(ModBlocks.BRICKS_WORN_STAIRS_6);
                        entries.add(ModBlocks.CHAOS_WORN_STAIRS_1);
                        entries.add(ModBlocks.CHAOS_WORN_STAIRS_2);
                        entries.add(ModBlocks.CHAOS_WORN_STAIRS_3);
                        entries.add(ModBlocks.CHAOS_WORN_STAIRS_4);
                        entries.add(ModBlocks.CHAOS_WORN_STAIRS_5);
                        entries.add(ModBlocks.CHAOS_WORN_STAIRS_6);
                        entries.add(ModBlocks.CONCRETE_CLEAN_STAIRS_1);
                        entries.add(ModBlocks.CONCRETE_CLEAN_STAIRS_2);
                        entries.add(ModBlocks.CONCRETE_CLEAN_STAIRS_3);
                        entries.add(ModBlocks.CONCRETE_CLEAN_STAIRS_4);
                        entries.add(ModBlocks.CONCRETE_CLEAN_STAIRS_5);
                        entries.add(ModBlocks.CONCRETE_CLEAN_STAIRS_6);
                        entries.add(ModBlocks.METAL_STAIRS_1);
                        entries.add(ModBlocks.METAL_STAIRS_2);
                        entries.add(ModBlocks.METAL_STAIRS_3);
                        entries.add(ModBlocks.METAL_STAIRS_4);
                        entries.add(ModBlocks.METAL_STAIRS_5);
                        entries.add(ModBlocks.METAL_STAIRS_6);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_STAIRS_1);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_STAIRS_2);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_STAIRS_3);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_STAIRS_4);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_STAIRS_5);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_STAIRS_6);
                        entries.add(ModBlocks.RANDOM_MACHINES_STAIRS_1);
                        entries.add(ModBlocks.SMALL_PIPES_CLEAN_STAIRS_1);
                        entries.add(ModBlocks.SMALL_PIPES_WORN_STAIRS_1);
                        entries.add(ModBlocks.TRASH_CLEAN_STAIRS_1);
                        entries.add(ModBlocks.TRASH_CLEAN_STAIRS_2);
                        entries.add(ModBlocks.TRASH_CLEAN_STAIRS_3);
                        entries.add(ModBlocks.TRASH_CLEAN_STAIRS_4);
                        entries.add(ModBlocks.TRASH_CLEAN_STAIRS_5);
                        entries.add(ModBlocks.TRASH_CLEAN_STAIRS_6);




                        entries.add(ModBlocks.BIG_BRICKS_WORN_SLAB_1);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_SLAB_2);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_SLAB_3);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_SLAB_4);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_SLAB_5);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_SLAB_6);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_SLAB_1);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_SLAB_2);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_SLAB_3);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_SLAB_4);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_SLAB_5);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_SLAB_6);
                        entries.add(ModBlocks.BIGMETAL_WORN_SLAB_1);
                        entries.add(ModBlocks.BIGMETAL_WORN_SLAB_2);
                        entries.add(ModBlocks.BIGMETAL_WORN_SLAB_3);
                        entries.add(ModBlocks.BIGMETAL_WORN_SLAB_4);
                        entries.add(ModBlocks.BIGMETAL_WORN_SLAB_5);
                        entries.add(ModBlocks.BIGMETAL_WORN_SLAB_6);
                        entries.add(ModBlocks.BRICKS_WORN_SLAB_1);
                        entries.add(ModBlocks.BRICKS_WORN_SLAB_2);
                        entries.add(ModBlocks.BRICKS_WORN_SLAB_3);
                        entries.add(ModBlocks.BRICKS_WORN_SLAB_4);
                        entries.add(ModBlocks.BRICKS_WORN_SLAB_5);
                        entries.add(ModBlocks.BRICKS_WORN_SLAB_6);
                        entries.add(ModBlocks.CHAOS_WORN_SLAB_1);
                        entries.add(ModBlocks.CHAOS_WORN_SLAB_2);
                        entries.add(ModBlocks.CHAOS_WORN_SLAB_3);
                        entries.add(ModBlocks.CHAOS_WORN_SLAB_4);
                        entries.add(ModBlocks.CHAOS_WORN_SLAB_5);
                        entries.add(ModBlocks.CHAOS_WORN_SLAB_6);
                        entries.add(ModBlocks.CONCRETE_CLEAN_SLAB_1);
                        entries.add(ModBlocks.CONCRETE_CLEAN_SLAB_2);
                        entries.add(ModBlocks.CONCRETE_CLEAN_SLAB_3);
                        entries.add(ModBlocks.CONCRETE_CLEAN_SLAB_4);
                        entries.add(ModBlocks.CONCRETE_CLEAN_SLAB_5);
                        entries.add(ModBlocks.CONCRETE_CLEAN_SLAB_6);
                        entries.add(ModBlocks.METAL_SLAB_1);
                        entries.add(ModBlocks.METAL_SLAB_2);
                        entries.add(ModBlocks.METAL_SLAB_3);
                        entries.add(ModBlocks.METAL_SLAB_4);
                        entries.add(ModBlocks.METAL_SLAB_5);
                        entries.add(ModBlocks.METAL_SLAB_6);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_SLAB_1);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_SLAB_2);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_SLAB_3);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_SLAB_4);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_SLAB_5);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_SLAB_6);
                        entries.add(ModBlocks.RANDOM_MACHINES_SLAB_1);
                        entries.add(ModBlocks.SMALL_PIPES_CLEAN_SLAB_1);
                        entries.add(ModBlocks.SMALL_PIPES_WORN_SLAB_1);
                        entries.add(ModBlocks.TRASH_CLEAN_SLAB_1);
                        entries.add(ModBlocks.TRASH_CLEAN_SLAB_2);
                        entries.add(ModBlocks.TRASH_CLEAN_SLAB_3);
                        entries.add(ModBlocks.TRASH_CLEAN_SLAB_4);
                        entries.add(ModBlocks.TRASH_CLEAN_SLAB_5);
                        entries.add(ModBlocks.TRASH_CLEAN_SLAB_6);




                        entries.add(ModBlocks.BIG_BRICKS_WORN_WALL_1);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_WALL_2);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_WALL_3);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_WALL_4);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_WALL_5);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_WALL_6);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_WALL_1);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_WALL_2);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_WALL_3);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_WALL_4);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_WALL_5);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_WALL_6);
                        entries.add(ModBlocks.BIGMETAL_WORN_WALL_1);
                        entries.add(ModBlocks.BIGMETAL_WORN_WALL_2);
                        entries.add(ModBlocks.BIGMETAL_WORN_WALL_3);
                        entries.add(ModBlocks.BIGMETAL_WORN_WALL_4);
                        entries.add(ModBlocks.BIGMETAL_WORN_WALL_5);
                        entries.add(ModBlocks.BIGMETAL_WORN_WALL_6);
                        entries.add(ModBlocks.BRICKS_WORN_WALL_1);
                        entries.add(ModBlocks.BRICKS_WORN_WALL_2);
                        entries.add(ModBlocks.BRICKS_WORN_WALL_3);
                        entries.add(ModBlocks.BRICKS_WORN_WALL_4);
                        entries.add(ModBlocks.BRICKS_WORN_WALL_5);
                        entries.add(ModBlocks.BRICKS_WORN_WALL_6);
                        entries.add(ModBlocks.CHAOS_WORN_WALL_1);
                        entries.add(ModBlocks.CHAOS_WORN_WALL_2);
                        entries.add(ModBlocks.CHAOS_WORN_WALL_3);
                        entries.add(ModBlocks.CHAOS_WORN_WALL_4);
                        entries.add(ModBlocks.CHAOS_WORN_WALL_5);
                        entries.add(ModBlocks.CHAOS_WORN_WALL_6);
                        entries.add(ModBlocks.CONCRETE_CLEAN_WALL_1);
                        entries.add(ModBlocks.CONCRETE_CLEAN_WALL_2);
                        entries.add(ModBlocks.CONCRETE_CLEAN_WALL_3);
                        entries.add(ModBlocks.CONCRETE_CLEAN_WALL_4);
                        entries.add(ModBlocks.CONCRETE_CLEAN_WALL_5);
                        entries.add(ModBlocks.CONCRETE_CLEAN_WALL_6);
                        entries.add(ModBlocks.METAL_WALL_1);
                        entries.add(ModBlocks.METAL_WALL_2);
                        entries.add(ModBlocks.METAL_WALL_3);
                        entries.add(ModBlocks.METAL_WALL_4);
                        entries.add(ModBlocks.METAL_WALL_5);
                        entries.add(ModBlocks.METAL_WALL_6);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_WALL_1);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_WALL_2);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_WALL_3);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_WALL_4);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_WALL_5);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_WALL_6);
                        entries.add(ModBlocks.RANDOM_MACHINES_WALL_1);
                        entries.add(ModBlocks.SMALL_PIPES_CLEAN_WALL_1);
                        entries.add(ModBlocks.SMALL_PIPES_WORN_WALL_1);
                        entries.add(ModBlocks.TRASH_CLEAN_WALL_1);
                        entries.add(ModBlocks.TRASH_CLEAN_WALL_2);
                        entries.add(ModBlocks.TRASH_CLEAN_WALL_3);
                        entries.add(ModBlocks.TRASH_CLEAN_WALL_4);
                        entries.add(ModBlocks.TRASH_CLEAN_WALL_5);
                        entries.add(ModBlocks.TRASH_CLEAN_WALL_6);




                        entries.add(ModBlocks.BIG_BRICKS_WORN_FENCE_1);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_FENCE_2);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_FENCE_3);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_FENCE_4);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_FENCE_5);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_FENCE_6);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_FENCE_1);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_FENCE_2);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_FENCE_3);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_FENCE_4);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_FENCE_5);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_FENCE_6);
                        entries.add(ModBlocks.BIGMETAL_WORN_FENCE_1);
                        entries.add(ModBlocks.BIGMETAL_WORN_FENCE_2);
                        entries.add(ModBlocks.BIGMETAL_WORN_FENCE_3);
                        entries.add(ModBlocks.BIGMETAL_WORN_FENCE_4);
                        entries.add(ModBlocks.BIGMETAL_WORN_FENCE_5);
                        entries.add(ModBlocks.BIGMETAL_WORN_FENCE_6);
                        entries.add(ModBlocks.BRICKS_WORN_FENCE_1);
                        entries.add(ModBlocks.BRICKS_WORN_FENCE_2);
                        entries.add(ModBlocks.BRICKS_WORN_FENCE_3);
                        entries.add(ModBlocks.BRICKS_WORN_FENCE_4);
                        entries.add(ModBlocks.BRICKS_WORN_FENCE_5);
                        entries.add(ModBlocks.BRICKS_WORN_FENCE_6);
                        entries.add(ModBlocks.CHAOS_WORN_FENCE_1);
                        entries.add(ModBlocks.CHAOS_WORN_FENCE_2);
                        entries.add(ModBlocks.CHAOS_WORN_FENCE_3);
                        entries.add(ModBlocks.CHAOS_WORN_FENCE_4);
                        entries.add(ModBlocks.CHAOS_WORN_FENCE_5);
                        entries.add(ModBlocks.CHAOS_WORN_FENCE_6);
                        entries.add(ModBlocks.CONCRETE_CLEAN_FENCE_1);
                        entries.add(ModBlocks.CONCRETE_CLEAN_FENCE_2);
                        entries.add(ModBlocks.CONCRETE_CLEAN_FENCE_3);
                        entries.add(ModBlocks.CONCRETE_CLEAN_FENCE_4);
                        entries.add(ModBlocks.CONCRETE_CLEAN_FENCE_5);
                        entries.add(ModBlocks.CONCRETE_CLEAN_FENCE_6);
                        entries.add(ModBlocks.METAL_FENCE_1);
                        entries.add(ModBlocks.METAL_FENCE_2);
                        entries.add(ModBlocks.METAL_FENCE_3);
                        entries.add(ModBlocks.METAL_FENCE_4);
                        entries.add(ModBlocks.METAL_FENCE_5);
                        entries.add(ModBlocks.METAL_FENCE_6);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_FENCE_1);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_FENCE_2);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_FENCE_3);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_FENCE_4);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_FENCE_5);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_FENCE_6);
                        entries.add(ModBlocks.RANDOM_MACHINES_FENCE_1);
                        entries.add(ModBlocks.SMALL_PIPES_CLEAN_FENCE_1);
                        entries.add(ModBlocks.SMALL_PIPES_WORN_FENCE_1);
                        entries.add(ModBlocks.TRASH_CLEAN_FENCE_1);
                        entries.add(ModBlocks.TRASH_CLEAN_FENCE_2);
                        entries.add(ModBlocks.TRASH_CLEAN_FENCE_3);
                        entries.add(ModBlocks.TRASH_CLEAN_FENCE_4);
                        entries.add(ModBlocks.TRASH_CLEAN_FENCE_5);
                        entries.add(ModBlocks.TRASH_CLEAN_FENCE_6);



                        entries.add(ModBlocks.BIG_BRICKS_WORN_BUTTON_1);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_BUTTON_2);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_BUTTON_3);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_BUTTON_4);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_BUTTON_5);
                        entries.add(ModBlocks.BIG_BRICKS_WORN_BUTTON_6);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_BUTTON_1);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_BUTTON_2);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_BUTTON_3);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_BUTTON_4);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_BUTTON_5);
                        entries.add(ModBlocks.BIGMETAL_CLEAN_BUTTON_6);
                        entries.add(ModBlocks.BIGMETAL_WORN_BUTTON_1);
                        entries.add(ModBlocks.BIGMETAL_WORN_BUTTON_2);
                        entries.add(ModBlocks.BIGMETAL_WORN_BUTTON_3);
                        entries.add(ModBlocks.BIGMETAL_WORN_BUTTON_4);
                        entries.add(ModBlocks.BIGMETAL_WORN_BUTTON_5);
                        entries.add(ModBlocks.BIGMETAL_WORN_BUTTON_6);
                        entries.add(ModBlocks.BRICKS_WORN_BUTTON_1);
                        entries.add(ModBlocks.BRICKS_WORN_BUTTON_2);
                        entries.add(ModBlocks.BRICKS_WORN_BUTTON_3);
                        entries.add(ModBlocks.BRICKS_WORN_BUTTON_4);
                        entries.add(ModBlocks.BRICKS_WORN_BUTTON_5);
                        entries.add(ModBlocks.BRICKS_WORN_BUTTON_6);
                        entries.add(ModBlocks.CHAOS_WORN_BUTTON_1);
                        entries.add(ModBlocks.CHAOS_WORN_BUTTON_2);
                        entries.add(ModBlocks.CHAOS_WORN_BUTTON_3);
                        entries.add(ModBlocks.CHAOS_WORN_BUTTON_4);
                        entries.add(ModBlocks.CHAOS_WORN_BUTTON_5);
                        entries.add(ModBlocks.CHAOS_WORN_BUTTON_6);
                        entries.add(ModBlocks.CONCRETE_CLEAN_BUTTON_1);
                        entries.add(ModBlocks.CONCRETE_CLEAN_BUTTON_2);
                        entries.add(ModBlocks.CONCRETE_CLEAN_BUTTON_3);
                        entries.add(ModBlocks.CONCRETE_CLEAN_BUTTON_4);
                        entries.add(ModBlocks.CONCRETE_CLEAN_BUTTON_5);
                        entries.add(ModBlocks.CONCRETE_CLEAN_BUTTON_6);
                        entries.add(ModBlocks.METAL_BUTTON_1);
                        entries.add(ModBlocks.METAL_BUTTON_2);
                        entries.add(ModBlocks.METAL_BUTTON_3);
                        entries.add(ModBlocks.METAL_BUTTON_4);
                        entries.add(ModBlocks.METAL_BUTTON_5);
                        entries.add(ModBlocks.METAL_BUTTON_6);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_BUTTON_1);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_BUTTON_2);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_BUTTON_3);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_BUTTON_4);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_BUTTON_5);
                        entries.add(ModBlocks.RAINSTONE_CLEAN_BUTTON_6);
                        entries.add(ModBlocks.RANDOM_MACHINES_BUTTON_1);
                        entries.add(ModBlocks.SMALL_PIPES_CLEAN_BUTTON_1);
                        entries.add(ModBlocks.SMALL_PIPES_WORN_BUTTON_1);
                        entries.add(ModBlocks.TRASH_CLEAN_BUTTON_1);
                        entries.add(ModBlocks.TRASH_CLEAN_BUTTON_2);
                        entries.add(ModBlocks.TRASH_CLEAN_BUTTON_3);
                        entries.add(ModBlocks.TRASH_CLEAN_BUTTON_4);
                        entries.add(ModBlocks.TRASH_CLEAN_BUTTON_5);
                        entries.add(ModBlocks.TRASH_CLEAN_BUTTON_6);




                    }).build());


    public static final ItemGroup RAIN_WORLD_BLOCKS_2 = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_blocks_2"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_blocks_2"))
                    .icon(() -> new ItemStack(ModBlocks.BIG_BRICKS_WORN_1)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BIG_BRICKS_WORN_1);


                    }).build());

    public static final ItemGroup RAIN_WORLD_PLANTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_plants"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_plants"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_SMALL_PLANT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BIG_BRICKS_WORN_1);


                    }).build());

    public static final ItemGroup RAIN_WORLD_PIPES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_pipes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_pipes"))
                    .icon(() -> new ItemStack(ModBlocks.BLUE_PIPE_STRAIGHT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BIG_BRICKS_WORN_1);


                    }).build());

    public static final ItemGroup RAIN_WORLD_MODELS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_models"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_models"))
                    .icon(() -> new ItemStack(ModBlocks.BIG_GEAR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BIG_BRICKS_WORN_1);


                    }).build());

    public static void registerItemGroups() {
        BlockMod.LOGGER.info("Registering Item Groups for " + BlockMod.MOD_ID);
    }
}
