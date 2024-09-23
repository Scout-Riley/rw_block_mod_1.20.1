package net.scout.rw_block_mod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TexturedModel;
import net.scout.rw_block_mod.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override

    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {




        blockStateModelGenerator.registerAxisRotated(ModBlocks.GREEN_PIPE, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GRAY_PIPE, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BLUE_PIPE, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BROWN_PIPE, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.RED_PIPE, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GREEN_PIPE_CORNER, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.GRAY_PIPE_CORNER, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BLUE_PIPE_CORNER, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BROWN_PIPE_CORNER, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.RED_PIPE_CORNER, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);




        BlockStateModelGenerator.BlockTexturePool BIG_BRICKS_WORN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIG_BRICKS_WORN_1);
        BlockStateModelGenerator.BlockTexturePool BIG_BRICKS_WORN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIG_BRICKS_WORN_2);
        BlockStateModelGenerator.BlockTexturePool BIG_BRICKS_WORN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIG_BRICKS_WORN_3);
        BlockStateModelGenerator.BlockTexturePool BIG_BRICKS_WORN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIG_BRICKS_WORN_4);
        BlockStateModelGenerator.BlockTexturePool BIG_BRICKS_WORN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIG_BRICKS_WORN_5);
        BlockStateModelGenerator.BlockTexturePool BIG_BRICKS_WORN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIG_BRICKS_WORN_6);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_CLEAN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_CLEAN_1);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_CLEAN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_CLEAN_2);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_CLEAN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_CLEAN_3);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_CLEAN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_CLEAN_4);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_CLEAN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_CLEAN_5);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_CLEAN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_CLEAN_6);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_WORN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_WORN_1);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_WORN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_WORN_2);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_WORN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_WORN_3);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_WORN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_WORN_4);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_WORN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_WORN_5);
        BlockStateModelGenerator.BlockTexturePool BIGMETAL_WORN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BIGMETAL_WORN_6);
        BlockStateModelGenerator.BlockTexturePool BRICKS_WORN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_WORN_1);
        BlockStateModelGenerator.BlockTexturePool BRICKS_WORN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_WORN_2);
        BlockStateModelGenerator.BlockTexturePool BRICKS_WORN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_WORN_3);
        BlockStateModelGenerator.BlockTexturePool BRICKS_WORN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_WORN_4);
        BlockStateModelGenerator.BlockTexturePool BRICKS_WORN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_WORN_5);
        BlockStateModelGenerator.BlockTexturePool BRICKS_WORN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRICKS_WORN_6);
        BlockStateModelGenerator.BlockTexturePool CHAOS_WORN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHAOS_WORN_1);
        BlockStateModelGenerator.BlockTexturePool CHAOS_WORN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHAOS_WORN_2);
        BlockStateModelGenerator.BlockTexturePool CHAOS_WORN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHAOS_WORN_3);
        BlockStateModelGenerator.BlockTexturePool CHAOS_WORN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHAOS_WORN_4);
        BlockStateModelGenerator.BlockTexturePool CHAOS_WORN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHAOS_WORN_5);
        BlockStateModelGenerator.BlockTexturePool CHAOS_WORN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHAOS_WORN_6);
        BlockStateModelGenerator.BlockTexturePool CONCRETE_CLEAN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_CLEAN_1);
        BlockStateModelGenerator.BlockTexturePool CONCRETE_CLEAN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_CLEAN_2);
        BlockStateModelGenerator.BlockTexturePool CONCRETE_CLEAN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_CLEAN_3);
        BlockStateModelGenerator.BlockTexturePool CONCRETE_CLEAN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_CLEAN_4);
        BlockStateModelGenerator.BlockTexturePool CONCRETE_CLEAN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_CLEAN_5);
        BlockStateModelGenerator.BlockTexturePool CONCRETE_CLEAN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_CLEAN_6);
        BlockStateModelGenerator.BlockTexturePool METAL_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAL_1);
        BlockStateModelGenerator.BlockTexturePool METAL_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAL_2);
        BlockStateModelGenerator.BlockTexturePool METAL_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAL_3);
        BlockStateModelGenerator.BlockTexturePool METAL_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAL_4);
        BlockStateModelGenerator.BlockTexturePool METAL_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAL_5);
        BlockStateModelGenerator.BlockTexturePool METAL_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.METAL_6);
        BlockStateModelGenerator.BlockTexturePool RAINSTONE_CLEAN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINSTONE_CLEAN_1);
        BlockStateModelGenerator.BlockTexturePool RAINSTONE_CLEAN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINSTONE_CLEAN_2);
        BlockStateModelGenerator.BlockTexturePool RAINSTONE_CLEAN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINSTONE_CLEAN_3);
        BlockStateModelGenerator.BlockTexturePool RAINSTONE_CLEAN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINSTONE_CLEAN_4);
        BlockStateModelGenerator.BlockTexturePool RAINSTONE_CLEAN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINSTONE_CLEAN_5);
        BlockStateModelGenerator.BlockTexturePool RAINSTONE_CLEAN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAINSTONE_CLEAN_6);
        BlockStateModelGenerator.BlockTexturePool RANDOM_MACHINES_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RANDOM_MACHINES_1);
        BlockStateModelGenerator.BlockTexturePool SMALL_PIPES_CLEAN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMALL_PIPES_CLEAN_1);
        BlockStateModelGenerator.BlockTexturePool SMALL_PIPES_WORN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMALL_PIPES_WORN_1);
        BlockStateModelGenerator.BlockTexturePool TRASH_CLEAN_1 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRASH_CLEAN_1);
        BlockStateModelGenerator.BlockTexturePool TRASH_CLEAN_2 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRASH_CLEAN_2);
        BlockStateModelGenerator.BlockTexturePool TRASH_CLEAN_3 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRASH_CLEAN_3);
        BlockStateModelGenerator.BlockTexturePool TRASH_CLEAN_4 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRASH_CLEAN_4);
        BlockStateModelGenerator.BlockTexturePool TRASH_CLEAN_5 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRASH_CLEAN_5);
        BlockStateModelGenerator.BlockTexturePool TRASH_CLEAN_6 = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TRASH_CLEAN_6);


  BIG_BRICKS_WORN_1.stairs(ModBlocks.BIG_BRICKS_WORN_STAIRS_1);
BIG_BRICKS_WORN_2.stairs(ModBlocks.BIG_BRICKS_WORN_STAIRS_2);
BIG_BRICKS_WORN_3.stairs(ModBlocks.BIG_BRICKS_WORN_STAIRS_3);
BIG_BRICKS_WORN_4.stairs(ModBlocks.BIG_BRICKS_WORN_STAIRS_4);
BIG_BRICKS_WORN_5.stairs(ModBlocks.BIG_BRICKS_WORN_STAIRS_5);
BIG_BRICKS_WORN_6.stairs(ModBlocks.BIG_BRICKS_WORN_STAIRS_6);
BIGMETAL_CLEAN_1.stairs(ModBlocks.BIGMETAL_CLEAN_STAIRS_1);
BIGMETAL_CLEAN_2.stairs(ModBlocks.BIGMETAL_CLEAN_STAIRS_2);
BIGMETAL_CLEAN_3.stairs(ModBlocks.BIGMETAL_CLEAN_STAIRS_3);
BIGMETAL_CLEAN_4.stairs(ModBlocks.BIGMETAL_CLEAN_STAIRS_4);
BIGMETAL_CLEAN_5.stairs(ModBlocks.BIGMETAL_CLEAN_STAIRS_5);
BIGMETAL_CLEAN_6.stairs(ModBlocks.BIGMETAL_CLEAN_STAIRS_6);
BIGMETAL_WORN_1.stairs(ModBlocks.BIGMETAL_WORN_STAIRS_1);
BIGMETAL_WORN_2.stairs(ModBlocks.BIGMETAL_WORN_STAIRS_2);
BIGMETAL_WORN_3.stairs(ModBlocks.BIGMETAL_WORN_STAIRS_3);
BIGMETAL_WORN_4.stairs(ModBlocks.BIGMETAL_WORN_STAIRS_4);
BIGMETAL_WORN_5.stairs(ModBlocks.BIGMETAL_WORN_STAIRS_5);
BIGMETAL_WORN_6.stairs(ModBlocks.BIGMETAL_WORN_STAIRS_6);
BRICKS_WORN_1.stairs(ModBlocks.BRICKS_WORN_STAIRS_1);
BRICKS_WORN_2.stairs(ModBlocks.BRICKS_WORN_STAIRS_2);
BRICKS_WORN_3.stairs(ModBlocks.BRICKS_WORN_STAIRS_3);
BRICKS_WORN_4.stairs(ModBlocks.BRICKS_WORN_STAIRS_4);
BRICKS_WORN_5.stairs(ModBlocks.BRICKS_WORN_STAIRS_5);
BRICKS_WORN_6.stairs(ModBlocks.BRICKS_WORN_STAIRS_6);
CHAOS_WORN_1.stairs(ModBlocks.CHAOS_WORN_STAIRS_1);
CHAOS_WORN_2.stairs(ModBlocks.CHAOS_WORN_STAIRS_2);
CHAOS_WORN_3.stairs(ModBlocks.CHAOS_WORN_STAIRS_3);
CHAOS_WORN_4.stairs(ModBlocks.CHAOS_WORN_STAIRS_4);
CHAOS_WORN_5.stairs(ModBlocks.CHAOS_WORN_STAIRS_5);
CHAOS_WORN_6.stairs(ModBlocks.CHAOS_WORN_STAIRS_6);
CONCRETE_CLEAN_1.stairs(ModBlocks.CONCRETE_CLEAN_STAIRS_1);
CONCRETE_CLEAN_2.stairs(ModBlocks.CONCRETE_CLEAN_STAIRS_2);
CONCRETE_CLEAN_3.stairs(ModBlocks.CONCRETE_CLEAN_STAIRS_3);
CONCRETE_CLEAN_4.stairs(ModBlocks.CONCRETE_CLEAN_STAIRS_4);
CONCRETE_CLEAN_5.stairs(ModBlocks.CONCRETE_CLEAN_STAIRS_5);
CONCRETE_CLEAN_6.stairs(ModBlocks.CONCRETE_CLEAN_STAIRS_6);
METAL_1.stairs(ModBlocks.METAL_STAIRS_1);
METAL_2.stairs(ModBlocks.METAL_STAIRS_2);
METAL_3.stairs(ModBlocks.METAL_STAIRS_3);
METAL_4.stairs(ModBlocks.METAL_STAIRS_4);
METAL_5.stairs(ModBlocks.METAL_STAIRS_5);
METAL_6.stairs(ModBlocks.METAL_STAIRS_6);
RAINSTONE_CLEAN_1.stairs(ModBlocks.RAINSTONE_CLEAN_STAIRS_1);
RAINSTONE_CLEAN_2.stairs(ModBlocks.RAINSTONE_CLEAN_STAIRS_2);
RAINSTONE_CLEAN_3.stairs(ModBlocks.RAINSTONE_CLEAN_STAIRS_3);
RAINSTONE_CLEAN_4.stairs(ModBlocks.RAINSTONE_CLEAN_STAIRS_4);
RAINSTONE_CLEAN_5.stairs(ModBlocks.RAINSTONE_CLEAN_STAIRS_5);
RAINSTONE_CLEAN_6.stairs(ModBlocks.RAINSTONE_CLEAN_STAIRS_6);
RANDOM_MACHINES_1.stairs(ModBlocks.RANDOM_MACHINES_STAIRS_1);
SMALL_PIPES_CLEAN_1.stairs(ModBlocks.SMALL_PIPES_CLEAN_STAIRS_1);
SMALL_PIPES_WORN_1.stairs(ModBlocks.SMALL_PIPES_WORN_STAIRS_1);
TRASH_CLEAN_1.stairs(ModBlocks.TRASH_CLEAN_STAIRS_1);
TRASH_CLEAN_2.stairs(ModBlocks.TRASH_CLEAN_STAIRS_2);
TRASH_CLEAN_3.stairs(ModBlocks.TRASH_CLEAN_STAIRS_3);
TRASH_CLEAN_4.stairs(ModBlocks.TRASH_CLEAN_STAIRS_4);
TRASH_CLEAN_5.stairs(ModBlocks.TRASH_CLEAN_STAIRS_5);
TRASH_CLEAN_6.stairs(ModBlocks.TRASH_CLEAN_STAIRS_6);




BIG_BRICKS_WORN_1.slab(ModBlocks.BIG_BRICKS_WORN_SLAB_1);
BIG_BRICKS_WORN_2.slab(ModBlocks.BIG_BRICKS_WORN_SLAB_2);
BIG_BRICKS_WORN_3.slab(ModBlocks.BIG_BRICKS_WORN_SLAB_3);
BIG_BRICKS_WORN_4.slab(ModBlocks.BIG_BRICKS_WORN_SLAB_4);
BIG_BRICKS_WORN_5.slab(ModBlocks.BIG_BRICKS_WORN_SLAB_5);
BIG_BRICKS_WORN_6.slab(ModBlocks.BIG_BRICKS_WORN_SLAB_6);
BIGMETAL_CLEAN_1.slab(ModBlocks.BIGMETAL_CLEAN_SLAB_1);
BIGMETAL_CLEAN_2.slab(ModBlocks.BIGMETAL_CLEAN_SLAB_2);
BIGMETAL_CLEAN_3.slab(ModBlocks.BIGMETAL_CLEAN_SLAB_3);
BIGMETAL_CLEAN_4.slab(ModBlocks.BIGMETAL_CLEAN_SLAB_4);
BIGMETAL_CLEAN_5.slab(ModBlocks.BIGMETAL_CLEAN_SLAB_5);
BIGMETAL_CLEAN_6.slab(ModBlocks.BIGMETAL_CLEAN_SLAB_6);
BIGMETAL_WORN_1.slab(ModBlocks.BIGMETAL_WORN_SLAB_1);
BIGMETAL_WORN_2.slab(ModBlocks.BIGMETAL_WORN_SLAB_2);
BIGMETAL_WORN_3.slab(ModBlocks.BIGMETAL_WORN_SLAB_3);
BIGMETAL_WORN_4.slab(ModBlocks.BIGMETAL_WORN_SLAB_4);
BIGMETAL_WORN_5.slab(ModBlocks.BIGMETAL_WORN_SLAB_5);
BIGMETAL_WORN_6.slab(ModBlocks.BIGMETAL_WORN_SLAB_6);
BRICKS_WORN_1.slab(ModBlocks.BRICKS_WORN_SLAB_1);
BRICKS_WORN_2.slab(ModBlocks.BRICKS_WORN_SLAB_2);
BRICKS_WORN_3.slab(ModBlocks.BRICKS_WORN_SLAB_3);
BRICKS_WORN_4.slab(ModBlocks.BRICKS_WORN_SLAB_4);
BRICKS_WORN_5.slab(ModBlocks.BRICKS_WORN_SLAB_5);
BRICKS_WORN_6.slab(ModBlocks.BRICKS_WORN_SLAB_6);
CHAOS_WORN_1.slab(ModBlocks.CHAOS_WORN_SLAB_1);
CHAOS_WORN_2.slab(ModBlocks.CHAOS_WORN_SLAB_2);
CHAOS_WORN_3.slab(ModBlocks.CHAOS_WORN_SLAB_3);
CHAOS_WORN_4.slab(ModBlocks.CHAOS_WORN_SLAB_4);
CHAOS_WORN_5.slab(ModBlocks.CHAOS_WORN_SLAB_5);
CHAOS_WORN_6.slab(ModBlocks.CHAOS_WORN_SLAB_6);
CONCRETE_CLEAN_1.slab(ModBlocks.CONCRETE_CLEAN_SLAB_1);
CONCRETE_CLEAN_2.slab(ModBlocks.CONCRETE_CLEAN_SLAB_2);
CONCRETE_CLEAN_3.slab(ModBlocks.CONCRETE_CLEAN_SLAB_3);
CONCRETE_CLEAN_4.slab(ModBlocks.CONCRETE_CLEAN_SLAB_4);
CONCRETE_CLEAN_5.slab(ModBlocks.CONCRETE_CLEAN_SLAB_5);
CONCRETE_CLEAN_6.slab(ModBlocks.CONCRETE_CLEAN_SLAB_6);
METAL_1.slab(ModBlocks.METAL_SLAB_1);
METAL_2.slab(ModBlocks.METAL_SLAB_2);
METAL_3.slab(ModBlocks.METAL_SLAB_3);
METAL_4.slab(ModBlocks.METAL_SLAB_4);
METAL_5.slab(ModBlocks.METAL_SLAB_5);
METAL_6.slab(ModBlocks.METAL_SLAB_6);
RAINSTONE_CLEAN_1.slab(ModBlocks.RAINSTONE_CLEAN_SLAB_1);
RAINSTONE_CLEAN_2.slab(ModBlocks.RAINSTONE_CLEAN_SLAB_2);
RAINSTONE_CLEAN_3.slab(ModBlocks.RAINSTONE_CLEAN_SLAB_3);
RAINSTONE_CLEAN_4.slab(ModBlocks.RAINSTONE_CLEAN_SLAB_4);
RAINSTONE_CLEAN_5.slab(ModBlocks.RAINSTONE_CLEAN_SLAB_5);
RAINSTONE_CLEAN_6.slab(ModBlocks.RAINSTONE_CLEAN_SLAB_6);
RANDOM_MACHINES_1.slab(ModBlocks.RANDOM_MACHINES_SLAB_1);
SMALL_PIPES_CLEAN_1.slab(ModBlocks.SMALL_PIPES_CLEAN_SLAB_1);
SMALL_PIPES_WORN_1.slab(ModBlocks.SMALL_PIPES_WORN_SLAB_1);
TRASH_CLEAN_1.slab(ModBlocks.TRASH_CLEAN_SLAB_1);
TRASH_CLEAN_2.slab(ModBlocks.TRASH_CLEAN_SLAB_2);
TRASH_CLEAN_3.slab(ModBlocks.TRASH_CLEAN_SLAB_3);
TRASH_CLEAN_4.slab(ModBlocks.TRASH_CLEAN_SLAB_4);
TRASH_CLEAN_5.slab(ModBlocks.TRASH_CLEAN_SLAB_5);
TRASH_CLEAN_6.slab(ModBlocks.TRASH_CLEAN_SLAB_6);




BIG_BRICKS_WORN_1.wall(ModBlocks.BIG_BRICKS_WORN_WALL_1);
BIG_BRICKS_WORN_2.wall(ModBlocks.BIG_BRICKS_WORN_WALL_2);
BIG_BRICKS_WORN_3.wall(ModBlocks.BIG_BRICKS_WORN_WALL_3);
BIG_BRICKS_WORN_4.wall(ModBlocks.BIG_BRICKS_WORN_WALL_4);
BIG_BRICKS_WORN_5.wall(ModBlocks.BIG_BRICKS_WORN_WALL_5);
BIG_BRICKS_WORN_6.wall(ModBlocks.BIG_BRICKS_WORN_WALL_6);
BIGMETAL_CLEAN_1.wall(ModBlocks.BIGMETAL_CLEAN_WALL_1);
BIGMETAL_CLEAN_2.wall(ModBlocks.BIGMETAL_CLEAN_WALL_2);
BIGMETAL_CLEAN_3.wall(ModBlocks.BIGMETAL_CLEAN_WALL_3);
BIGMETAL_CLEAN_4.wall(ModBlocks.BIGMETAL_CLEAN_WALL_4);
BIGMETAL_CLEAN_5.wall(ModBlocks.BIGMETAL_CLEAN_WALL_5);
BIGMETAL_CLEAN_6.wall(ModBlocks.BIGMETAL_CLEAN_WALL_6);
BIGMETAL_WORN_1.wall(ModBlocks.BIGMETAL_WORN_WALL_1);
BIGMETAL_WORN_2.wall(ModBlocks.BIGMETAL_WORN_WALL_2);
BIGMETAL_WORN_3.wall(ModBlocks.BIGMETAL_WORN_WALL_3);
BIGMETAL_WORN_4.wall(ModBlocks.BIGMETAL_WORN_WALL_4);
BIGMETAL_WORN_5.wall(ModBlocks.BIGMETAL_WORN_WALL_5);
BIGMETAL_WORN_6.wall(ModBlocks.BIGMETAL_WORN_WALL_6);
BRICKS_WORN_1.wall(ModBlocks.BRICKS_WORN_WALL_1);
BRICKS_WORN_2.wall(ModBlocks.BRICKS_WORN_WALL_2);
BRICKS_WORN_3.wall(ModBlocks.BRICKS_WORN_WALL_3);
BRICKS_WORN_4.wall(ModBlocks.BRICKS_WORN_WALL_4);
BRICKS_WORN_5.wall(ModBlocks.BRICKS_WORN_WALL_5);
BRICKS_WORN_6.wall(ModBlocks.BRICKS_WORN_WALL_6);
CHAOS_WORN_1.wall(ModBlocks.CHAOS_WORN_WALL_1);
CHAOS_WORN_2.wall(ModBlocks.CHAOS_WORN_WALL_2);
CHAOS_WORN_3.wall(ModBlocks.CHAOS_WORN_WALL_3);
CHAOS_WORN_4.wall(ModBlocks.CHAOS_WORN_WALL_4);
CHAOS_WORN_5.wall(ModBlocks.CHAOS_WORN_WALL_5);
CHAOS_WORN_6.wall(ModBlocks.CHAOS_WORN_WALL_6);
CONCRETE_CLEAN_1.wall(ModBlocks.CONCRETE_CLEAN_WALL_1);
CONCRETE_CLEAN_2.wall(ModBlocks.CONCRETE_CLEAN_WALL_2);
CONCRETE_CLEAN_3.wall(ModBlocks.CONCRETE_CLEAN_WALL_3);
CONCRETE_CLEAN_4.wall(ModBlocks.CONCRETE_CLEAN_WALL_4);
CONCRETE_CLEAN_5.wall(ModBlocks.CONCRETE_CLEAN_WALL_5);
CONCRETE_CLEAN_6.wall(ModBlocks.CONCRETE_CLEAN_WALL_6);
METAL_1.wall(ModBlocks.METAL_WALL_1);
METAL_2.wall(ModBlocks.METAL_WALL_2);
METAL_3.wall(ModBlocks.METAL_WALL_3);
METAL_4.wall(ModBlocks.METAL_WALL_4);
METAL_5.wall(ModBlocks.METAL_WALL_5);
METAL_6.wall(ModBlocks.METAL_WALL_6);
RAINSTONE_CLEAN_1.wall(ModBlocks.RAINSTONE_CLEAN_WALL_1);
RAINSTONE_CLEAN_2.wall(ModBlocks.RAINSTONE_CLEAN_WALL_2);
RAINSTONE_CLEAN_3.wall(ModBlocks.RAINSTONE_CLEAN_WALL_3);
RAINSTONE_CLEAN_4.wall(ModBlocks.RAINSTONE_CLEAN_WALL_4);
RAINSTONE_CLEAN_5.wall(ModBlocks.RAINSTONE_CLEAN_WALL_5);
RAINSTONE_CLEAN_6.wall(ModBlocks.RAINSTONE_CLEAN_WALL_6);
RANDOM_MACHINES_1.wall(ModBlocks.RANDOM_MACHINES_WALL_1);
SMALL_PIPES_CLEAN_1.wall(ModBlocks.SMALL_PIPES_CLEAN_WALL_1);
SMALL_PIPES_WORN_1.wall(ModBlocks.SMALL_PIPES_WORN_WALL_1);
TRASH_CLEAN_1.wall(ModBlocks.TRASH_CLEAN_WALL_1);
TRASH_CLEAN_2.wall(ModBlocks.TRASH_CLEAN_WALL_2);
TRASH_CLEAN_3.wall(ModBlocks.TRASH_CLEAN_WALL_3);
TRASH_CLEAN_4.wall(ModBlocks.TRASH_CLEAN_WALL_4);
TRASH_CLEAN_5.wall(ModBlocks.TRASH_CLEAN_WALL_5);
TRASH_CLEAN_6.wall(ModBlocks.TRASH_CLEAN_WALL_6);




BIG_BRICKS_WORN_1.fence(ModBlocks.BIG_BRICKS_WORN_FENCE_1);
BIG_BRICKS_WORN_2.fence(ModBlocks.BIG_BRICKS_WORN_FENCE_2);
BIG_BRICKS_WORN_3.fence(ModBlocks.BIG_BRICKS_WORN_FENCE_3);
BIG_BRICKS_WORN_4.fence(ModBlocks.BIG_BRICKS_WORN_FENCE_4);
BIG_BRICKS_WORN_5.fence(ModBlocks.BIG_BRICKS_WORN_FENCE_5);
BIG_BRICKS_WORN_6.fence(ModBlocks.BIG_BRICKS_WORN_FENCE_6);
BIGMETAL_CLEAN_1.fence(ModBlocks.BIGMETAL_CLEAN_FENCE_1);
BIGMETAL_CLEAN_2.fence(ModBlocks.BIGMETAL_CLEAN_FENCE_2);
BIGMETAL_CLEAN_3.fence(ModBlocks.BIGMETAL_CLEAN_FENCE_3);
BIGMETAL_CLEAN_4.fence(ModBlocks.BIGMETAL_CLEAN_FENCE_4);
BIGMETAL_CLEAN_5.fence(ModBlocks.BIGMETAL_CLEAN_FENCE_5);
BIGMETAL_CLEAN_6.fence(ModBlocks.BIGMETAL_CLEAN_FENCE_6);
BIGMETAL_WORN_1.fence(ModBlocks.BIGMETAL_WORN_FENCE_1);
BIGMETAL_WORN_2.fence(ModBlocks.BIGMETAL_WORN_FENCE_2);
BIGMETAL_WORN_3.fence(ModBlocks.BIGMETAL_WORN_FENCE_3);
BIGMETAL_WORN_4.fence(ModBlocks.BIGMETAL_WORN_FENCE_4);
BIGMETAL_WORN_5.fence(ModBlocks.BIGMETAL_WORN_FENCE_5);
BIGMETAL_WORN_6.fence(ModBlocks.BIGMETAL_WORN_FENCE_6);
BRICKS_WORN_1.fence(ModBlocks.BRICKS_WORN_FENCE_1);
BRICKS_WORN_2.fence(ModBlocks.BRICKS_WORN_FENCE_2);
BRICKS_WORN_3.fence(ModBlocks.BRICKS_WORN_FENCE_3);
BRICKS_WORN_4.fence(ModBlocks.BRICKS_WORN_FENCE_4);
BRICKS_WORN_5.fence(ModBlocks.BRICKS_WORN_FENCE_5);
BRICKS_WORN_6.fence(ModBlocks.BRICKS_WORN_FENCE_6);
CHAOS_WORN_1.fence(ModBlocks.CHAOS_WORN_FENCE_1);
CHAOS_WORN_2.fence(ModBlocks.CHAOS_WORN_FENCE_2);
CHAOS_WORN_3.fence(ModBlocks.CHAOS_WORN_FENCE_3);
CHAOS_WORN_4.fence(ModBlocks.CHAOS_WORN_FENCE_4);
CHAOS_WORN_5.fence(ModBlocks.CHAOS_WORN_FENCE_5);
CHAOS_WORN_6.fence(ModBlocks.CHAOS_WORN_FENCE_6);
CONCRETE_CLEAN_1.fence(ModBlocks.CONCRETE_CLEAN_FENCE_1);
CONCRETE_CLEAN_2.fence(ModBlocks.CONCRETE_CLEAN_FENCE_2);
CONCRETE_CLEAN_3.fence(ModBlocks.CONCRETE_CLEAN_FENCE_3);
CONCRETE_CLEAN_4.fence(ModBlocks.CONCRETE_CLEAN_FENCE_4);
CONCRETE_CLEAN_5.fence(ModBlocks.CONCRETE_CLEAN_FENCE_5);
CONCRETE_CLEAN_6.fence(ModBlocks.CONCRETE_CLEAN_FENCE_6);
METAL_1.fence(ModBlocks.METAL_FENCE_1);
METAL_2.fence(ModBlocks.METAL_FENCE_2);
METAL_3.fence(ModBlocks.METAL_FENCE_3);
METAL_4.fence(ModBlocks.METAL_FENCE_4);
METAL_5.fence(ModBlocks.METAL_FENCE_5);
METAL_6.fence(ModBlocks.METAL_FENCE_6);
RAINSTONE_CLEAN_1.fence(ModBlocks.RAINSTONE_CLEAN_FENCE_1);
RAINSTONE_CLEAN_2.fence(ModBlocks.RAINSTONE_CLEAN_FENCE_2);
RAINSTONE_CLEAN_3.fence(ModBlocks.RAINSTONE_CLEAN_FENCE_3);
RAINSTONE_CLEAN_4.fence(ModBlocks.RAINSTONE_CLEAN_FENCE_4);
RAINSTONE_CLEAN_5.fence(ModBlocks.RAINSTONE_CLEAN_FENCE_5);
RAINSTONE_CLEAN_6.fence(ModBlocks.RAINSTONE_CLEAN_FENCE_6);
RANDOM_MACHINES_1.fence(ModBlocks.RANDOM_MACHINES_FENCE_1);
SMALL_PIPES_CLEAN_1.fence(ModBlocks.SMALL_PIPES_CLEAN_FENCE_1);
SMALL_PIPES_WORN_1.fence(ModBlocks.SMALL_PIPES_WORN_FENCE_1);
TRASH_CLEAN_1.fence(ModBlocks.TRASH_CLEAN_FENCE_1);
TRASH_CLEAN_2.fence(ModBlocks.TRASH_CLEAN_FENCE_2);
TRASH_CLEAN_3.fence(ModBlocks.TRASH_CLEAN_FENCE_3);
TRASH_CLEAN_4.fence(ModBlocks.TRASH_CLEAN_FENCE_4);
TRASH_CLEAN_5.fence(ModBlocks.TRASH_CLEAN_FENCE_5);
TRASH_CLEAN_6.fence(ModBlocks.TRASH_CLEAN_FENCE_6);



BIG_BRICKS_WORN_1.button(ModBlocks.BIG_BRICKS_WORN_BUTTON_1);
BIG_BRICKS_WORN_2.button(ModBlocks.BIG_BRICKS_WORN_BUTTON_2);
BIG_BRICKS_WORN_3.button(ModBlocks.BIG_BRICKS_WORN_BUTTON_3);
BIG_BRICKS_WORN_4.button(ModBlocks.BIG_BRICKS_WORN_BUTTON_4);
BIG_BRICKS_WORN_5.button(ModBlocks.BIG_BRICKS_WORN_BUTTON_5);
BIG_BRICKS_WORN_6.button(ModBlocks.BIG_BRICKS_WORN_BUTTON_6);
BIGMETAL_CLEAN_1.button(ModBlocks.BIGMETAL_CLEAN_BUTTON_1);
BIGMETAL_CLEAN_2.button(ModBlocks.BIGMETAL_CLEAN_BUTTON_2);
BIGMETAL_CLEAN_3.button(ModBlocks.BIGMETAL_CLEAN_BUTTON_3);
BIGMETAL_CLEAN_4.button(ModBlocks.BIGMETAL_CLEAN_BUTTON_4);
BIGMETAL_CLEAN_5.button(ModBlocks.BIGMETAL_CLEAN_BUTTON_5);
BIGMETAL_CLEAN_6.button(ModBlocks.BIGMETAL_CLEAN_BUTTON_6);
BIGMETAL_WORN_1.button(ModBlocks.BIGMETAL_WORN_BUTTON_1);
BIGMETAL_WORN_2.button(ModBlocks.BIGMETAL_WORN_BUTTON_2);
BIGMETAL_WORN_3.button(ModBlocks.BIGMETAL_WORN_BUTTON_3);
BIGMETAL_WORN_4.button(ModBlocks.BIGMETAL_WORN_BUTTON_4);
BIGMETAL_WORN_5.button(ModBlocks.BIGMETAL_WORN_BUTTON_5);
BIGMETAL_WORN_6.button(ModBlocks.BIGMETAL_WORN_BUTTON_6);
BRICKS_WORN_1.button(ModBlocks.BRICKS_WORN_BUTTON_1);
BRICKS_WORN_2.button(ModBlocks.BRICKS_WORN_BUTTON_2);
BRICKS_WORN_3.button(ModBlocks.BRICKS_WORN_BUTTON_3);
BRICKS_WORN_4.button(ModBlocks.BRICKS_WORN_BUTTON_4);
BRICKS_WORN_5.button(ModBlocks.BRICKS_WORN_BUTTON_5);
BRICKS_WORN_6.button(ModBlocks.BRICKS_WORN_BUTTON_6);
CHAOS_WORN_1.button(ModBlocks.CHAOS_WORN_BUTTON_1);
CHAOS_WORN_2.button(ModBlocks.CHAOS_WORN_BUTTON_2);
CHAOS_WORN_3.button(ModBlocks.CHAOS_WORN_BUTTON_3);
CHAOS_WORN_4.button(ModBlocks.CHAOS_WORN_BUTTON_4);
CHAOS_WORN_5.button(ModBlocks.CHAOS_WORN_BUTTON_5);
CHAOS_WORN_6.button(ModBlocks.CHAOS_WORN_BUTTON_6);
CONCRETE_CLEAN_1.button(ModBlocks.CONCRETE_CLEAN_BUTTON_1);
CONCRETE_CLEAN_2.button(ModBlocks.CONCRETE_CLEAN_BUTTON_2);
CONCRETE_CLEAN_3.button(ModBlocks.CONCRETE_CLEAN_BUTTON_3);
CONCRETE_CLEAN_4.button(ModBlocks.CONCRETE_CLEAN_BUTTON_4);
CONCRETE_CLEAN_5.button(ModBlocks.CONCRETE_CLEAN_BUTTON_5);
CONCRETE_CLEAN_6.button(ModBlocks.CONCRETE_CLEAN_BUTTON_6);
METAL_1.button(ModBlocks.METAL_BUTTON_1);
METAL_2.button(ModBlocks.METAL_BUTTON_2);
METAL_3.button(ModBlocks.METAL_BUTTON_3);
METAL_4.button(ModBlocks.METAL_BUTTON_4);
METAL_5.button(ModBlocks.METAL_BUTTON_5);
METAL_6.button(ModBlocks.METAL_BUTTON_6);
RAINSTONE_CLEAN_1.button(ModBlocks.RAINSTONE_CLEAN_BUTTON_1);
RAINSTONE_CLEAN_2.button(ModBlocks.RAINSTONE_CLEAN_BUTTON_2);
RAINSTONE_CLEAN_3.button(ModBlocks.RAINSTONE_CLEAN_BUTTON_3);
RAINSTONE_CLEAN_4.button(ModBlocks.RAINSTONE_CLEAN_BUTTON_4);
RAINSTONE_CLEAN_5.button(ModBlocks.RAINSTONE_CLEAN_BUTTON_5);
RAINSTONE_CLEAN_6.button(ModBlocks.RAINSTONE_CLEAN_BUTTON_6);
RANDOM_MACHINES_1.button(ModBlocks.RANDOM_MACHINES_BUTTON_1);
SMALL_PIPES_CLEAN_1.button(ModBlocks.SMALL_PIPES_CLEAN_BUTTON_1);
SMALL_PIPES_WORN_1.button(ModBlocks.SMALL_PIPES_WORN_BUTTON_1);
TRASH_CLEAN_1.button(ModBlocks.TRASH_CLEAN_BUTTON_1);
TRASH_CLEAN_2.button(ModBlocks.TRASH_CLEAN_BUTTON_2);
TRASH_CLEAN_3.button(ModBlocks.TRASH_CLEAN_BUTTON_3);
TRASH_CLEAN_4.button(ModBlocks.TRASH_CLEAN_BUTTON_4);
TRASH_CLEAN_5.button(ModBlocks.TRASH_CLEAN_BUTTON_5);
TRASH_CLEAN_6.button(ModBlocks.TRASH_CLEAN_BUTTON_6);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


    }
}
