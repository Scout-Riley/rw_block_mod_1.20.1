package net.scout.rw_block_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scout.rw_block_mod.BlockMod;

public class ModBlocks {
    public static final Block GREEN_PIPE = registerBlock("green_pipe_block_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block GREEN_PIPE_CORNER = registerBlock("green_pipe_block_corner",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block GRAY_PIPE = registerBlock("gray_pipe_block_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block GRAY_PIPE_CORNER = registerBlock("gray_pipe_block_corner",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BROWN_PIPE = registerBlock("brown_pipe_block_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BROWN_PIPE_CORNER = registerBlock("brown_pipe_block_corner",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BLUE_PIPE = registerBlock("blue_pipe_block_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BLUE_PIPE_CORNER = registerBlock("blue_pipe_block_corner",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_PIPE = registerBlock("red_pipe_block_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RED_PIPE_CORNER = registerBlock("red_pipe_block_corner",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    public static final Block RED_SHEET_METAL = registerBlock("red_sheet_metal",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RED_SHEET_METAL_EDGE = registerBlock("red_sheet_metal_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BLUE_SHEET_METAL = registerBlock("blue_sheet_metal",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BLUE_SHEET_METAL_EDGE = registerBlock("blue_sheet_metal_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GREEN_SHEET_METAL = registerBlock("green_sheet_metal",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GREEN_SHEET_METAL_EDGE = registerBlock("green_sheet_metal_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block YELLOW_SHEET_METAL = registerBlock("yellow_sheet_metal",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block YELLOW_SHEET_METAL_EDGE = registerBlock("yellow_sheet_metal_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));



    public static final Block BIG_BRICKS_WORN_1 = registerBlock("big_bricks_worn_1",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_2 = registerBlock("big_bricks_worn_2",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_3 = registerBlock("big_bricks_worn_3",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_4 = registerBlock("big_bricks_worn_4",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_5 = registerBlock("big_bricks_worn_5",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_6 = registerBlock("big_bricks_worn_6",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIGMETAL_CLEAN_1 = registerBlock("bigmetal_clean_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_2 = registerBlock("bigmetal_clean_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_3 = registerBlock("bigmetal_clean_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_4 = registerBlock("bigmetal_clean_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_5 = registerBlock("bigmetal_clean_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_6 = registerBlock("bigmetal_clean_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_1 = registerBlock("bigmetal_worn_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_2 = registerBlock("bigmetal_worn_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_3 = registerBlock("bigmetal_worn_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_4 = registerBlock("bigmetal_worn_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_5 = registerBlock("bigmetal_worn_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_6 = registerBlock("bigmetal_worn_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_1 = registerBlock("bricks_worn_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_2 = registerBlock("bricks_worn_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_3 = registerBlock("bricks_worn_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_4 = registerBlock("bricks_worn_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_5 = registerBlock("bricks_worn_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_6 = registerBlock("bricks_worn_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_1 = registerBlock("chaos_worn_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_2 = registerBlock("chaos_worn_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_3 = registerBlock("chaos_worn_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_4 = registerBlock("chaos_worn_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_5 = registerBlock("chaos_worn_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_6 = registerBlock("chaos_worn_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_1 = registerBlock("concrete_clean_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_2 = registerBlock("concrete_clean_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_3 = registerBlock("concrete_clean_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_4 = registerBlock("concrete_clean_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_5 = registerBlock("concrete_clean_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_6 = registerBlock("concrete_clean_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_1 = registerBlock("metal_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_2 = registerBlock("metal_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_3 = registerBlock("metal_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_4 = registerBlock("metal_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_5 = registerBlock("metal_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_6 = registerBlock("metal_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAINSTONE_CLEAN_1 = registerBlock("rainstone_clean_1",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_2 = registerBlock("rainstone_clean_2",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_3 = registerBlock("rainstone_clean_3",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_4 = registerBlock("rainstone_clean_4",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_5 = registerBlock("rainstone_clean_5",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_6 = registerBlock("rainstone_clean_6",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RANDOM_MACHINES_1 = registerBlock("random_machines_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block SMALL_PIPES_CLEAN_1 = registerBlock("small_pipes_clean_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SMALL_PIPES_WORN_1 = registerBlock("small_pipes_worn_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block TRASH_CLEAN_1 = registerBlock("trash_clean_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_2 = registerBlock("trash_clean_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_3 = registerBlock("trash_clean_3",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_4 = registerBlock("trash_clean_4",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_5 = registerBlock("trash_clean_5",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_6 = registerBlock("trash_clean_6",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));


    public static final Block BIG_BRICKS_WORN_STAIRS_1 = registerBlock("big_bricks_worn_stairs_1",
            new StairsBlock(ModBlocks.BIG_BRICKS_WORN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_STAIRS_2 = registerBlock("big_bricks_worn_stairs_2",
            new StairsBlock (ModBlocks.BIG_BRICKS_WORN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_STAIRS_3 = registerBlock("big_bricks_worn_stairs_3",
            new StairsBlock (ModBlocks.BIG_BRICKS_WORN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_STAIRS_4 = registerBlock("big_bricks_worn_stairs_4",
            new StairsBlock (ModBlocks.BIG_BRICKS_WORN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_STAIRS_5 = registerBlock("big_bricks_worn_stairs_5",
            new StairsBlock (ModBlocks.BIG_BRICKS_WORN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_STAIRS_6 = registerBlock("big_bricks_worn_stairs_6",
            new StairsBlock (ModBlocks.BIG_BRICKS_WORN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIGMETAL_CLEAN_STAIRS_1 = registerBlock("bigmetal_clean_stairs_1",
            new StairsBlock (ModBlocks.BIGMETAL_CLEAN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_STAIRS_2 = registerBlock("bigmetal_clean_stairs_2",
            new StairsBlock (ModBlocks.BIGMETAL_CLEAN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_STAIRS_3 = registerBlock("bigmetal_clean_stairs_3",
            new StairsBlock (ModBlocks.BIGMETAL_CLEAN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_STAIRS_4 = registerBlock("bigmetal_clean_stairs_4",
            new StairsBlock (ModBlocks.BIGMETAL_CLEAN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_STAIRS_5 = registerBlock("bigmetal_clean_stairs_5",
            new StairsBlock (ModBlocks.BIGMETAL_CLEAN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_STAIRS_6 = registerBlock("bigmetal_clean_stairs_6",
            new StairsBlock (ModBlocks.BIGMETAL_CLEAN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_STAIRS_1 = registerBlock("bigmetal_worn_stairs_1",
            new StairsBlock (ModBlocks.BIGMETAL_WORN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_STAIRS_2 = registerBlock("bigmetal_worn_stairs_2",
            new StairsBlock (ModBlocks.BIGMETAL_WORN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_STAIRS_3 = registerBlock("bigmetal_worn_stairs_3",
            new StairsBlock (ModBlocks.BIGMETAL_WORN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_STAIRS_4 = registerBlock("bigmetal_worn_stairs_4",
            new StairsBlock (ModBlocks.BIGMETAL_WORN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_STAIRS_5 = registerBlock("bigmetal_worn_stairs_5",
            new StairsBlock (ModBlocks.BIGMETAL_WORN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_STAIRS_6 = registerBlock("bigmetal_worn_stairs_6",
            new StairsBlock (ModBlocks.BIGMETAL_WORN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_STAIRS_1 = registerBlock("bricks_worn_stairs_1",
            new StairsBlock (ModBlocks.BRICKS_WORN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_STAIRS_2 = registerBlock("bricks_worn_stairs_2",
            new StairsBlock (ModBlocks.BRICKS_WORN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_STAIRS_3 = registerBlock("bricks_worn_stairs_3",
            new StairsBlock (ModBlocks.BRICKS_WORN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_STAIRS_4 = registerBlock("bricks_worn_stairs_4",
            new StairsBlock (ModBlocks.BRICKS_WORN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_STAIRS_5 = registerBlock("bricks_worn_stairs_5",
            new StairsBlock (ModBlocks.BRICKS_WORN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_STAIRS_6 = registerBlock("bricks_worn_stairs_6",
            new StairsBlock (ModBlocks.BRICKS_WORN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_STAIRS_1 = registerBlock("chaos_worn_stairs_1",
            new StairsBlock (ModBlocks.CHAOS_WORN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_STAIRS_2 = registerBlock("chaos_worn_stairs_2",
            new StairsBlock (ModBlocks.CHAOS_WORN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_STAIRS_3 = registerBlock("chaos_worn_stairs_3",
            new StairsBlock (ModBlocks.CHAOS_WORN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_STAIRS_4 = registerBlock("chaos_worn_stairs_4",
            new StairsBlock (ModBlocks.CHAOS_WORN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_STAIRS_5 = registerBlock("chaos_worn_stairs_5",
            new StairsBlock (ModBlocks.CHAOS_WORN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_STAIRS_6 = registerBlock("chaos_worn_stairs_6",
            new StairsBlock (ModBlocks.CHAOS_WORN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_STAIRS_1 = registerBlock("concrete_clean_stairs_1",
            new StairsBlock (ModBlocks.CONCRETE_CLEAN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_STAIRS_2 = registerBlock("concrete_clean_stairs_2",
            new StairsBlock (ModBlocks.CONCRETE_CLEAN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_STAIRS_3 = registerBlock("concrete_clean_stairs_3",
            new StairsBlock (ModBlocks.CONCRETE_CLEAN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_STAIRS_4 = registerBlock("concrete_clean_stairs_4",
            new StairsBlock (ModBlocks.CONCRETE_CLEAN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_STAIRS_5 = registerBlock("concrete_clean_stairs_5",
            new StairsBlock (ModBlocks.CONCRETE_CLEAN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_STAIRS_6 = registerBlock("concrete_clean_stairs_6",
            new StairsBlock (ModBlocks.CONCRETE_CLEAN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_STAIRS_1 = registerBlock("metal_stairs_1",
            new StairsBlock (ModBlocks.METAL_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_STAIRS_2 = registerBlock("metal_stairs_2",
            new StairsBlock (ModBlocks.METAL_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_STAIRS_3 = registerBlock("metal_stairs_3",
            new StairsBlock (ModBlocks.METAL_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_STAIRS_4 = registerBlock("metal_stairs_4",
            new StairsBlock (ModBlocks.METAL_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_STAIRS_5 = registerBlock("metal_stairs_5",
            new StairsBlock (ModBlocks.METAL_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_STAIRS_6 = registerBlock("metal_stairs_6",
            new StairsBlock (ModBlocks.METAL_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAINSTONE_CLEAN_STAIRS_1 = registerBlock("rainstone_clean_stairs_1",
            new StairsBlock (ModBlocks.RAINSTONE_CLEAN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_STAIRS_2 = registerBlock("rainstone_clean_stairs_2",
            new StairsBlock (ModBlocks.RAINSTONE_CLEAN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_STAIRS_3 = registerBlock("rainstone_clean_stairs_3",
            new StairsBlock (ModBlocks.RAINSTONE_CLEAN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_STAIRS_4 = registerBlock("rainstone_clean_stairs_4",
            new StairsBlock (ModBlocks.RAINSTONE_CLEAN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_STAIRS_5 = registerBlock("rainstone_clean_stairs_5",
            new StairsBlock (ModBlocks.RAINSTONE_CLEAN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_STAIRS_6 = registerBlock("rainstone_clean_stairs_6",
            new StairsBlock (ModBlocks.RAINSTONE_CLEAN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RANDOM_MACHINES_STAIRS_1 = registerBlock("random_machines_stairs_1",
            new StairsBlock (ModBlocks.RANDOM_MACHINES_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block SMALL_PIPES_CLEAN_STAIRS_1 = registerBlock("small_pipes_clean_stairs_1",
            new StairsBlock (ModBlocks.SMALL_PIPES_CLEAN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SMALL_PIPES_WORN_STAIRS_1 = registerBlock("small_pipes_worn_stairs_1",
            new StairsBlock (ModBlocks.SMALL_PIPES_WORN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block TRASH_CLEAN_STAIRS_1 = registerBlock("trash_clean_stairs_1",
            new StairsBlock (ModBlocks.TRASH_CLEAN_1.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_STAIRS_2 = registerBlock("trash_clean_stairs_2",
            new StairsBlock (ModBlocks.TRASH_CLEAN_2.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_STAIRS_3 = registerBlock("trash_clean_stairs_3",
            new StairsBlock (ModBlocks.TRASH_CLEAN_3.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_STAIRS_4 = registerBlock("trash_clean_stairs_4",
            new StairsBlock (ModBlocks.TRASH_CLEAN_4.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_STAIRS_5 = registerBlock("trash_clean_stairs_5",
            new StairsBlock (ModBlocks.TRASH_CLEAN_5.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_STAIRS_6 = registerBlock("trash_clean_stairs_6",
            new StairsBlock (ModBlocks.TRASH_CLEAN_6.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));


    public static final Block BIG_BRICKS_WORN_SLAB_1 = registerBlock("big_bricks_worn_slab_1",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_SLAB_2 = registerBlock("big_bricks_worn_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_SLAB_3 = registerBlock("big_bricks_worn_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_SLAB_4 = registerBlock("big_bricks_worn_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_SLAB_5 = registerBlock("big_bricks_worn_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_SLAB_6 = registerBlock("big_bricks_worn_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIGMETAL_CLEAN_SLAB_1 = registerBlock("bigmetal_clean_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_SLAB_2 = registerBlock("bigmetal_clean_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_SLAB_3 = registerBlock("bigmetal_clean_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_SLAB_4 = registerBlock("bigmetal_clean_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_SLAB_5 = registerBlock("bigmetal_clean_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_SLAB_6 = registerBlock("bigmetal_clean_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_SLAB_1 = registerBlock("bigmetal_worn_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_SLAB_2 = registerBlock("bigmetal_worn_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_SLAB_3 = registerBlock("bigmetal_worn_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_SLAB_4 = registerBlock("bigmetal_worn_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_SLAB_5 = registerBlock("bigmetal_worn_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_SLAB_6 = registerBlock("bigmetal_worn_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_SLAB_1 = registerBlock("bricks_worn_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_SLAB_2 = registerBlock("bricks_worn_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_SLAB_3 = registerBlock("bricks_worn_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_SLAB_4 = registerBlock("bricks_worn_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_SLAB_5 = registerBlock("bricks_worn_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_SLAB_6 = registerBlock("bricks_worn_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_SLAB_1 = registerBlock("chaos_worn_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_SLAB_2 = registerBlock("chaos_worn_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_SLAB_3 = registerBlock("chaos_worn_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_SLAB_4 = registerBlock("chaos_worn_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_SLAB_5 = registerBlock("chaos_worn_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_SLAB_6 = registerBlock("chaos_worn_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_SLAB_1 = registerBlock("concrete_clean_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_SLAB_2 = registerBlock("concrete_clean_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_SLAB_3 = registerBlock("concrete_clean_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_SLAB_4 = registerBlock("concrete_clean_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_SLAB_5 = registerBlock("concrete_clean_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_SLAB_6 = registerBlock("concrete_clean_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_SLAB_1 = registerBlock("metal_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_SLAB_2 = registerBlock("metal_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_SLAB_3 = registerBlock("metal_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_SLAB_4 = registerBlock("metal_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_SLAB_5 = registerBlock("metal_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_SLAB_6 = registerBlock("metal_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAINSTONE_CLEAN_SLAB_1 = registerBlock("rainstone_clean_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_SLAB_2 = registerBlock("rainstone_clean_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_SLAB_3 = registerBlock("rainstone_clean_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_SLAB_4 = registerBlock("rainstone_clean_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_SLAB_5 = registerBlock("rainstone_clean_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_SLAB_6 = registerBlock("rainstone_clean_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RANDOM_MACHINES_SLAB_1 = registerBlock("random_machines_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block SMALL_PIPES_CLEAN_SLAB_1 = registerBlock("small_pipes_clean_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SMALL_PIPES_WORN_SLAB_1 = registerBlock("small_pipes_worn_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block TRASH_CLEAN_SLAB_1 = registerBlock("trash_clean_slab_1",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_SLAB_2 = registerBlock("trash_clean_slab_2",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_SLAB_3 = registerBlock("trash_clean_slab_3",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_SLAB_4 = registerBlock("trash_clean_slab_4",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_SLAB_5 = registerBlock("trash_clean_slab_5",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_SLAB_6 = registerBlock("trash_clean_slab_6",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));


    public static final Block BIG_BRICKS_WORN_WALL_1 = registerBlock("big_bricks_worn_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_WALL_2 = registerBlock("big_bricks_worn_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_WALL_3 = registerBlock("big_bricks_worn_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_WALL_4 = registerBlock("big_bricks_worn_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_WALL_5 = registerBlock("big_bricks_worn_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_WALL_6 = registerBlock("big_bricks_worn_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIGMETAL_CLEAN_WALL_1 = registerBlock("bigmetal_clean_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_WALL_2 = registerBlock("bigmetal_clean_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_WALL_3 = registerBlock("bigmetal_clean_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_WALL_4 = registerBlock("bigmetal_clean_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_WALL_5 = registerBlock("bigmetal_clean_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_WALL_6 = registerBlock("bigmetal_clean_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_WALL_1 = registerBlock("bigmetal_worn_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_WALL_2 = registerBlock("bigmetal_worn_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_WALL_3 = registerBlock("bigmetal_worn_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_WALL_4 = registerBlock("bigmetal_worn_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_WALL_5 = registerBlock("bigmetal_worn_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_WALL_6 = registerBlock("bigmetal_worn_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_WALL_1 = registerBlock("bricks_worn_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_WALL_2 = registerBlock("bricks_worn_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_WALL_3 = registerBlock("bricks_worn_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_WALL_4 = registerBlock("bricks_worn_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_WALL_5 = registerBlock("bricks_worn_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_WALL_6 = registerBlock("bricks_worn_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_WALL_1 = registerBlock("chaos_worn_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_WALL_2 = registerBlock("chaos_worn_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_WALL_3 = registerBlock("chaos_worn_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_WALL_4 = registerBlock("chaos_worn_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_WALL_5 = registerBlock("chaos_worn_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_WALL_6 = registerBlock("chaos_worn_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_WALL_1 = registerBlock("concrete_clean_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_WALL_2 = registerBlock("concrete_clean_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_WALL_3 = registerBlock("concrete_clean_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_WALL_4 = registerBlock("concrete_clean_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_WALL_5 = registerBlock("concrete_clean_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_WALL_6 = registerBlock("concrete_clean_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_WALL_1 = registerBlock("metal_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_WALL_2 = registerBlock("metal_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_WALL_3 = registerBlock("metal_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_WALL_4 = registerBlock("metal_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_WALL_5 = registerBlock("metal_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_WALL_6 = registerBlock("metal_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAINSTONE_CLEAN_WALL_1 = registerBlock("rainstone_clean_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_WALL_2 = registerBlock("rainstone_clean_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_WALL_3 = registerBlock("rainstone_clean_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_WALL_4 = registerBlock("rainstone_clean_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_WALL_5 = registerBlock("rainstone_clean_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_WALL_6 = registerBlock("rainstone_clean_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RANDOM_MACHINES_WALL_1 = registerBlock("random_machines_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block SMALL_PIPES_CLEAN_WALL_1 = registerBlock("small_pipes_clean_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SMALL_PIPES_WORN_WALL_1 = registerBlock("small_pipes_worn_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block TRASH_CLEAN_WALL_1 = registerBlock("trash_clean_wall_1",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_WALL_2 = registerBlock("trash_clean_wall_2",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_WALL_3 = registerBlock("trash_clean_wall_3",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_WALL_4 = registerBlock("trash_clean_wall_4",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_WALL_5 = registerBlock("trash_clean_wall_5",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_WALL_6 = registerBlock("trash_clean_wall_6",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));


    public static final Block BIG_BRICKS_WORN_BUTTON_1 = registerBlock("big_bricks_worn_button_1",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block BIG_BRICKS_WORN_BUTTON_2 = registerBlock("big_bricks_worn_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block BIG_BRICKS_WORN_BUTTON_3 = registerBlock("big_bricks_worn_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block BIG_BRICKS_WORN_BUTTON_4 = registerBlock("big_bricks_worn_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block BIG_BRICKS_WORN_BUTTON_5 = registerBlock("big_bricks_worn_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block BIG_BRICKS_WORN_BUTTON_6 = registerBlock("big_bricks_worn_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_CLEAN_BUTTON_1 = registerBlock("bigmetal_clean_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_CLEAN_BUTTON_2 = registerBlock("bigmetal_clean_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_CLEAN_BUTTON_3 = registerBlock("bigmetal_clean_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_CLEAN_BUTTON_4 = registerBlock("bigmetal_clean_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_CLEAN_BUTTON_5 = registerBlock("bigmetal_clean_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_CLEAN_BUTTON_6 = registerBlock("bigmetal_clean_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_WORN_BUTTON_1 = registerBlock("bigmetal_worn_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_WORN_BUTTON_2 = registerBlock("bigmetal_worn_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_WORN_BUTTON_3 = registerBlock("bigmetal_worn_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_WORN_BUTTON_4 = registerBlock("bigmetal_worn_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_WORN_BUTTON_5 = registerBlock("bigmetal_worn_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BIGMETAL_WORN_BUTTON_6 = registerBlock("bigmetal_worn_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BRICKS_WORN_BUTTON_1 = registerBlock("bricks_worn_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BRICKS_WORN_BUTTON_2 = registerBlock("bricks_worn_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BRICKS_WORN_BUTTON_3 = registerBlock("bricks_worn_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BRICKS_WORN_BUTTON_4 = registerBlock("bricks_worn_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BRICKS_WORN_BUTTON_5 = registerBlock("bricks_worn_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block BRICKS_WORN_BUTTON_6 = registerBlock("bricks_worn_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHAOS_WORN_BUTTON_1 = registerBlock("chaos_worn_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHAOS_WORN_BUTTON_2 = registerBlock("chaos_worn_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHAOS_WORN_BUTTON_3 = registerBlock("chaos_worn_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHAOS_WORN_BUTTON_4 = registerBlock("chaos_worn_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHAOS_WORN_BUTTON_5 = registerBlock("chaos_worn_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CHAOS_WORN_BUTTON_6 = registerBlock("chaos_worn_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CONCRETE_CLEAN_BUTTON_1 = registerBlock("concrete_clean_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CONCRETE_CLEAN_BUTTON_2 = registerBlock("concrete_clean_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CONCRETE_CLEAN_BUTTON_3 = registerBlock("concrete_clean_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CONCRETE_CLEAN_BUTTON_4 = registerBlock("concrete_clean_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CONCRETE_CLEAN_BUTTON_5 = registerBlock("concrete_clean_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block CONCRETE_CLEAN_BUTTON_6 = registerBlock("concrete_clean_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block METAL_BUTTON_1 = registerBlock("metal_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block METAL_BUTTON_2 = registerBlock("metal_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block METAL_BUTTON_3 = registerBlock("metal_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block METAL_BUTTON_4 = registerBlock("metal_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block METAL_BUTTON_5 = registerBlock("metal_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block METAL_BUTTON_6 = registerBlock("metal_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block RAINSTONE_CLEAN_BUTTON_1 = registerBlock("rainstone_clean_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block RAINSTONE_CLEAN_BUTTON_2 = registerBlock("rainstone_clean_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block RAINSTONE_CLEAN_BUTTON_3 = registerBlock("rainstone_clean_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block RAINSTONE_CLEAN_BUTTON_4 = registerBlock("rainstone_clean_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block RAINSTONE_CLEAN_BUTTON_5 = registerBlock("rainstone_clean_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block RAINSTONE_CLEAN_BUTTON_6 = registerBlock("rainstone_clean_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE), BlockSetType.IRON, 10, true));
    public static final Block RANDOM_MACHINES_BUTTON_1 = registerBlock("random_machines_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block SMALL_PIPES_CLEAN_BUTTON_1 = registerBlock("small_pipes_clean_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque(), BlockSetType.IRON, 10, true));
    public static final Block SMALL_PIPES_WORN_BUTTON_1 = registerBlock("small_pipes_worn_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque(), BlockSetType.IRON, 10, true));
    public static final Block TRASH_CLEAN_BUTTON_1 = registerBlock("trash_clean_button_1",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block TRASH_CLEAN_BUTTON_2 = registerBlock("trash_clean_button_2",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block TRASH_CLEAN_BUTTON_3 = registerBlock("trash_clean_button_3",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block TRASH_CLEAN_BUTTON_4 = registerBlock("trash_clean_button_4",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block TRASH_CLEAN_BUTTON_5 = registerBlock("trash_clean_button_5",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));
    public static final Block TRASH_CLEAN_BUTTON_6 = registerBlock("trash_clean_button_6",
            new ButtonBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK), BlockSetType.IRON, 10, true));


    public static final Block BIG_BRICKS_WORN_FENCE_1 = registerBlock("big_bricks_worn_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_FENCE_2 = registerBlock("big_bricks_worn_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_FENCE_3 = registerBlock("big_bricks_worn_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_FENCE_4 = registerBlock("big_bricks_worn_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_FENCE_5 = registerBlock("big_bricks_worn_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIG_BRICKS_WORN_FENCE_6 = registerBlock("big_bricks_worn_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BIGMETAL_CLEAN_FENCE_1 = registerBlock("bigmetal_clean_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_FENCE_2 = registerBlock("bigmetal_clean_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_FENCE_3 = registerBlock("bigmetal_clean_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_FENCE_4 = registerBlock("bigmetal_clean_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_FENCE_5 = registerBlock("bigmetal_clean_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_CLEAN_FENCE_6 = registerBlock("bigmetal_clean_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_FENCE_1 = registerBlock("bigmetal_worn_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_FENCE_2 = registerBlock("bigmetal_worn_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_FENCE_3 = registerBlock("bigmetal_worn_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_FENCE_4 = registerBlock("bigmetal_worn_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_FENCE_5 = registerBlock("bigmetal_worn_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BIGMETAL_WORN_FENCE_6 = registerBlock("bigmetal_worn_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_FENCE_1 = registerBlock("bricks_worn_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_FENCE_2 = registerBlock("bricks_worn_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_FENCE_3 = registerBlock("bricks_worn_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_FENCE_4 = registerBlock("bricks_worn_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_FENCE_5 = registerBlock("bricks_worn_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BRICKS_WORN_FENCE_6 = registerBlock("bricks_worn_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_FENCE_1 = registerBlock("chaos_worn_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_FENCE_2 = registerBlock("chaos_worn_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_FENCE_3 = registerBlock("chaos_worn_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_FENCE_4 = registerBlock("chaos_worn_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_FENCE_5 = registerBlock("chaos_worn_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CHAOS_WORN_FENCE_6 = registerBlock("chaos_worn_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_FENCE_1 = registerBlock("concrete_clean_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_FENCE_2 = registerBlock("concrete_clean_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_FENCE_3 = registerBlock("concrete_clean_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_FENCE_4 = registerBlock("concrete_clean_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_FENCE_5 = registerBlock("concrete_clean_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CONCRETE_CLEAN_FENCE_6 = registerBlock("concrete_clean_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_FENCE_1 = registerBlock("metal_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_FENCE_2 = registerBlock("metal_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_FENCE_3 = registerBlock("metal_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_FENCE_4 = registerBlock("metal_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_FENCE_5 = registerBlock("metal_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block METAL_FENCE_6 = registerBlock("metal_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RAINSTONE_CLEAN_FENCE_1 = registerBlock("rainstone_clean_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_FENCE_2 = registerBlock("rainstone_clean_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_FENCE_3 = registerBlock("rainstone_clean_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_FENCE_4 = registerBlock("rainstone_clean_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_FENCE_5 = registerBlock("rainstone_clean_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RAINSTONE_CLEAN_FENCE_6 = registerBlock("rainstone_clean_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block RANDOM_MACHINES_FENCE_1 = registerBlock("random_machines_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block SMALL_PIPES_CLEAN_FENCE_1 = registerBlock("small_pipes_clean_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SMALL_PIPES_WORN_FENCE_1 = registerBlock("small_pipes_worn_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block TRASH_CLEAN_FENCE_1 = registerBlock("trash_clean_fence_1",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_FENCE_2 = registerBlock("trash_clean_fence_2",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_FENCE_3 = registerBlock("trash_clean_fence_3",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_FENCE_4 = registerBlock("trash_clean_fence_4",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_FENCE_5 = registerBlock("trash_clean_fence_5",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block TRASH_CLEAN_FENCE_6 = registerBlock("trash_clean_fence_6",
            new FenceBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BlockMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BlockMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BlockMod.LOGGER.info("Registering ModBlocks for " + BlockMod.MOD_ID);
    }
}
