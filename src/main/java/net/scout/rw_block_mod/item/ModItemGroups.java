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
                    .icon(() -> new ItemStack(ModBlocks.RED_GLYPH_STONE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLACK_CHEVRON);
                        entries.add(ModBlocks.BROWN_CHEVRON);
                        entries.add(ModBlocks.BLUE_SHIPMENT);
                        entries.add(ModBlocks.BLUE_SHIPMENT_EDGE);
                        entries.add(ModBlocks.GREEN_SHIPMENT);
                        entries.add(ModBlocks.GREEN_SHIPMENT_EDGE);
                        entries.add(ModBlocks.RED_SHIPMENT);
                        entries.add(ModBlocks.RED_SHIPMENT_EDGE);
                        entries.add(ModBlocks.YELLOW_SHIPMENT);
                        entries.add(ModBlocks.YELLOW_SHIPMENT_EDGE);
                        entries.add(ModBlocks.CC_BEAM_HORIZONTAL);
                        entries.add(ModBlocks.CC_BEAM_VERTICAL);
                        entries.add(ModBlocks.CC_DIAGONAL_BEAM);
                        entries.add(ModBlocks.CIRCUIT_BOARD_BLOCK);
                        entries.add(ModBlocks.DIAGONAL_BEAM);
                        entries.add(ModBlocks.X_BEAM);
                        entries.add(ModBlocks.HORIZONTAL_DIAGONAL_BEAM);
                        entries.add(ModBlocks.HORIZONTAL_X_BEAM);
                        entries.add(ModBlocks.GLASS_1);
                        entries.add(ModBlocks.GLASS_2);
                        entries.add(ModBlocks.GLASS_3);
                        entries.add(ModBlocks.GLASS_4);
                        entries.add(ModBlocks.GLASS_5);
                        entries.add(ModBlocks.GLASS_6);
                        entries.add(ModBlocks.GLASS_7);
                        entries.add(ModBlocks.GLASS_8);
                        entries.add(ModBlocks.GLASS_9);
                        entries.add(ModBlocks.GLASS_10);
                        entries.add(ModBlocks.GLASS_11);
                        entries.add(ModBlocks.GLASS_PANE_1);
                        entries.add(ModBlocks.GLASS_PANE_2);
                        entries.add(ModBlocks.GLASS_PANE_3);
                        entries.add(ModBlocks.GLASS_PANE_4);
                        entries.add(ModBlocks.GLASS_PANE_5);
                        entries.add(ModBlocks.GLASS_PANE_6);
                        entries.add(ModBlocks.GLASS_PANE_7);
                        entries.add(ModBlocks.GLASS_PANE_8);
                        entries.add(ModBlocks.GLASS_PANE_9);
                        entries.add(ModBlocks.GLASS_PANE_10);
                        entries.add(ModBlocks.GLASS_PANE_11);
                        entries.add(ModBlocks.GRATE_MIDDLE);
                        entries.add(ModBlocks.GRATE_SIDE);
                        entries.add(ModBlocks.GRAY_METAL);
                        entries.add(ModBlocks.GRAY_METAL_STAIRS);
                        entries.add(ModBlocks.GREEN_GLYPH_BLOCK);
                        entries.add(ModBlocks.MEAT_BLOCK);
                        entries.add(ModBlocks.RED_GLYPH_STONE);
                        entries.add(ModBlocks.ROT_BLOCK);
                        entries.add(ModBlocks.RW_DIRT);
                        entries.add(ModBlocks.SL_WORN_STONE);
                        entries.add(ModBlocks.WORN_STONE);
                        entries.add(ModBlocks.WORN_STONE_SLAB);
                        entries.add(ModBlocks.WORN_STONE_STAIRS);
                        entries.add(ModBlocks.WORN_STONE_WALL);
                        entries.add(ModBlocks.SLIGHTLY_DIRTY_WORN_STONE);
                        entries.add(ModBlocks.DIRTY_WORN_STONE);
                        entries.add(ModBlocks.YELLOW_GLYPH_BLOCK_1);
                        entries.add(ModBlocks.YELLOW_GLYPH_BLOCK_2);



                    }).build());

    public static final ItemGroup RAIN_WORLD_PLANTS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_plants"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_plants"))
                    .icon(() -> new ItemStack(ModBlocks.GREEN_SMALL_PLANT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BATGRASS);
                        entries.add(ModBlocks.BLACK_FERN);
                        entries.add(ModBlocks.BLACK_SEAWEED);
                        entries.add(ModBlocks.BROWN_SEAWEED);
                        entries.add(ModBlocks.GREEN_SEAWEED);
                        entries.add(ModBlocks.BLACK_SMALL_PLANT);
                        entries.add(ModBlocks.GREEN_SMALL_PLANT);
                        entries.add(ModBlocks.PINK_SMALL_PLANT);
                        entries.add(ModBlocks.GREEN_TALL_PLANT);
                        entries.add(ModBlocks.PINK_TALL_PLANT);
                        entries.add(ModBlocks.YELLOW_TALL_PLANT);
                        entries.add(ModBlocks.RED_TALL_PLANT);
                        entries.add(ModBlocks.THORNY_GROWER);
                        entries.add(ModBlocks.LEG_PLANT);
                        entries.add(ModBlocks.MUSHROOM);
                        entries.add(ModBlocks.HANGING_PLANT);
                        entries.add(ModBlocks.HANGING_PLANT_2);
                        entries.add(ModBlocks.HANGING_PLANT_3);
                        entries.add(ModBlocks.HANGING_PLANT_3_BASE);
                        entries.add(ModBlocks.LARGE_DEBRIS);
                        entries.add(ModBlocks.SMALL_DEBRIS);
                        entries.add(ModBlocks.LICHEN);
                        entries.add(ModBlocks.ROT_WALL);


                    }).build());

    public static final ItemGroup RAIN_WORLD_PIPES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_pipes"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_pipes"))
                    .icon(() -> new ItemStack(ModBlocks.BLUE_PIPE_STRAIGHT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLUE_PIPE);
                        entries.add(ModBlocks.BLUE_PIPE_CORNER);
                        entries.add(ModBlocks.BLUE_PIPE_ST);
                        entries.add(ModBlocks.BLUE_PIPE_SS);
                        entries.add(ModBlocks.BLUE_PIPE_SD);
                        entries.add(ModBlocks.BLUE_PIPE_STRAIGHT);
                        entries.add(ModBlocks.BROWN_PIPE);
                        entries.add(ModBlocks.BROWN_PIPE_CORNER);
                        entries.add(ModBlocks.BROWN_PIPE_ST);
                        entries.add(ModBlocks.BROWN_PIPE_SS);
                        entries.add(ModBlocks.BROWN_PIPE_SD);
                        entries.add(ModBlocks.BROWN_PIPE_STRAIGHT);
                        entries.add(ModBlocks.GRAY_PIPE);
                        entries.add(ModBlocks.GRAY_PIPE_CORNER);
                        entries.add(ModBlocks.GRAY_PIPE_ST);
                        entries.add(ModBlocks.GRAY_PIPE_SS);
                        entries.add(ModBlocks.GRAY_PIPE_SD);
                        entries.add(ModBlocks.GRAY_PIPE_STRAIGHT);
                        entries.add(ModBlocks.GREEN_PIPE);
                        entries.add(ModBlocks.GREEN_PIPE_CORNER);
                        entries.add(ModBlocks.RED_PIPE);
                        entries.add(ModBlocks.RED_PIPE_CORNER);
                        entries.add(ModBlocks.PIPE_2X2_ST);
                        entries.add(ModBlocks.PIPE_2X2_SS);
                        entries.add(ModBlocks.PIPE_2X2_SD);
                        entries.add(ModBlocks.PIPE_2X2_STRAIGHT);
                        entries.add(ModBlocks.PIPE_2X2_TOP);
                        entries.add(ModBlocks.HORIZONTAL_PIPES);
                        entries.add(ModBlocks.VERTICAL_PIPES);
                        entries.add(ModBlocks.MESSY_PIPES);



                    }).build());

    public static final ItemGroup RAIN_WORLD_MODELS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BlockMod.MOD_ID, "rain_world_models"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rain_world_models"))
                    .icon(() -> new ItemStack(ModBlocks.BIG_GEAR)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AC_UNIT);
                        entries.add(ModBlocks.BIG_GEAR);
                        entries.add(ModBlocks.GEAR_WEIRD);
                        entries.add(ModBlocks.GEAR_WEIRD_SMALL);
                        entries.add(ModBlocks.VALVE_BIG);
                        entries.add(ModBlocks.VALVE_SMALL);
                        entries.add(ModBlocks.BOX_3X3);
                        entries.add(ModBlocks.BROWN_FANBOX);
                        entries.add(ModBlocks.GRAY_FANBOX);
                        entries.add(ModBlocks.CABLE_1);
                        entries.add(ModBlocks.CABLE_2);
                        entries.add(ModBlocks.CABLE_3);
                        entries.add(ModBlocks.CHAIN_1);
                        entries.add(ModBlocks.CHAIN_2);
                        entries.add(ModBlocks.CHAIN_3);
                        entries.add(ModBlocks.CHAIN_4);
                        entries.add(ModBlocks.CHAIN_5);
                        entries.add(ModBlocks.DYSON_FAN);
                        entries.add(ModBlocks.GIRDER);
                        entries.add(ModBlocks.GW_BEAM_1);
                        entries.add(ModBlocks.GW_BEAM_2);
                        entries.add(ModBlocks.GW_BEAM_3);
                        entries.add(ModBlocks.LEG_CYLINDER);
                        entries.add(ModBlocks.PILLAR);
                        entries.add(ModBlocks.SCREW_BOX_1);
                        entries.add(ModBlocks.SCREW_BOX_2);
                        entries.add(ModBlocks.SCREW_BOX_3);
                        entries.add(ModBlocks.SCREW_BOX_4);
                        entries.add(ModBlocks.STONE_HEAD_1);
                        entries.add(ModBlocks.STONE_HEAD_2);
                        entries.add(ModBlocks.STONE_HEAD_3);
                        entries.add(ModBlocks.STONE_HEAD_4);
                        entries.add(ModBlocks.SUPPORT_CLOCKWISE);
                        entries.add(ModBlocks.SUPPORT_COUNTERCLOCKWISE);
                        entries.add(ModBlocks.VENT_HUB_4X4_1);
                        entries.add(ModBlocks.VENT_HUB_4X4_2);
                        entries.add(ModBlocks.VENT_HUB_4X6_1);
                        entries.add(ModBlocks.VENT_HUB_4X6_2);
                        entries.add(ModBlocks.VENT_HUB_6X6_1);
                        entries.add(ModBlocks.VENT_HUB_6X6_2);
                        entries.add(ModBlocks.VENT_HUB_6X6_3);
                        entries.add(ModBlocks.VENT_HUB_6X6_4);
                        entries.add(ModBlocks.VENT_HUB_SIDE);
                        entries.add(ModBlocks.WHEEL);
                        entries.add(ModBlocks.X_BOX_6X6_1);
                        entries.add(ModBlocks.X_BOX_6X6_2);
                        entries.add(ModBlocks.X_BOX_4X6_1);
                        entries.add(ModBlocks.X_BOX_4X6_2);
                        entries.add(ModBlocks.X_BOX_4X4_1);
                        entries.add(ModBlocks.X_BOX_4X4_2);


                    }).build());

    public static void registerItemGroups() {
        BlockMod.LOGGER.info("Registering Item Groups for " + BlockMod.MOD_ID);
    }
}
