package net.scout.rw_block_mod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scout.rw_block_mod.BlockMod;

public class ModBlocks {


    public static final Block VENT_HUB_6X6_1 = registerBlock("vent_hub_6x6_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_6X6_2 = registerBlock("vent_hub_6x6_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_6X6_3 = registerBlock("vent_hub_6x6_3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_6X6_4 = registerBlock("vent_hub_6x6_4",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_4X4_1 = registerBlock("vent_hub_4x4_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_4X4_2 = registerBlock("vent_hub_4x4_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_4X6_1 = registerBlock("vent_hub_4x6_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block VENT_HUB_4X6_2 = registerBlock("vent_hub_4x6_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block STONE_HEAD_1 = registerBlock("stone_head_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block STONE_HEAD_2 = registerBlock("stone_head_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block STONE_HEAD_3 = registerBlock("stone_head_3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block STONE_HEAD_4 = registerBlock("stone_head_4",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block X_BOX_4X4_1 = registerBlock("x_box_4x4_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block X_BOX_4X4_2 = registerBlock("x_box_4x4_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block X_BOX_4X6_1 = registerBlock("x_box_4x6_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block X_BOX_4X6_2 = registerBlock("x_box_4x6_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block X_BOX_6X6_1 = registerBlock("x_box_6x6_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block X_BOX_6X6_2 = registerBlock("x_box_6x6_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block AC_UNIT = registerBlock("ac_unit",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block DYSON_FAN = registerBlock("dyson_fan",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BOX_3X3 = registerBlock("box_3x3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block PILLAR = registerBlock("pillar",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GW_BEAM_1 = registerBlock("gw_beam_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GW_BEAM_2 = registerBlock("gw_beam_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GW_BEAM_3 = registerBlock("gw_beam_3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block VENT_HUB_SIDE = registerBlock("vent_hub_side",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SCREW_BOX_1 = registerBlock("screw_box_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SCREW_BOX_2 = registerBlock("screw_box_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SCREW_BOX_3 = registerBlock("screw_box_3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block SCREW_BOX_4 = registerBlock("screw_box_4",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CHAIN_1 = registerBlock("chain_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CHAIN_2 = registerBlock("chain_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CHAIN_3 = registerBlock("chain_3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CHAIN_4 = registerBlock("chain_4",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CHAIN_5 = registerBlock("chain_5",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CABLE_1 = registerBlock("cable_1",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CABLE_2 = registerBlock("cable_2",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CABLE_3 = registerBlock("cable_3",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));



    public static final Block BIG_GEAR = registerBlock("big_gear",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block WHEEL = registerBlock("wheel",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block VALVE_SMALL = registerBlock("valve_small",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block VALVE_BIG = registerBlock("valve_big",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GEAR_WEIRD = registerBlock("gear_weird",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GEAR_WEIRD_SMALL = registerBlock("gear_weird_small",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block CC_BEAM_HORIZONTAL = registerBlock("cc_beam_horizontal",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CC_BEAM_VERTICAL = registerBlock("cc_beam_vertical",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));


    public static final Block SUPPORT_CLOCKWISE = registerBlock("support_clockwise",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block SUPPORT_COUNTERCLOCKWISE = registerBlock("support_counterclockwise",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque().noCollision()));
    public static final Block RED_GLYPH_STONE = registerBlock("red_glyph_stone",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block CIRCUIT_BOARD_BLOCK = registerBlock("circuit_board_block",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block YELLOW_GLYPH_BLOCK_1 = registerBlock("yellow_glyph_block_1",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block YELLOW_GLYPH_BLOCK_2 = registerBlock("yellow_glyph_block_2",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GREEN_GLYPH_BLOCK = registerBlock("green_glyph_block",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block MEAT_BLOCK = registerBlock("meat_block",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block LEG_CYLINDER = registerBlock("leg_cylinder",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block ROT_BLOCK = registerBlock("rot_block",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));

    public static final Block HANGING_PLANT_3_BASE = registerBlock("hanging_plant_3_base",
            new WeepingVinesBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block HANGING_PLANT_3 = registerBlock("hanging_plant_3",
            new WeepingVinesPlantBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));


    public static final Block LICHEN = registerBlock("lichen",
            new GlowLichenBlock (FabricBlockSettings.copyOf(Blocks.GLOW_LICHEN).nonOpaque().noCollision().luminance(0)));
    public static final Block ROT_WALL = registerBlock("rot_wall",
            new SculkVeinBlock (FabricBlockSettings.copyOf(Blocks.GLOW_LICHEN).nonOpaque().noCollision()));

    public static final Block BATGRASS = registerBlock("batgrass",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block GRASS_BROWN = registerBlock("grass_brown",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block MUSHROOM = registerBlock("mushroom",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block BLACK_SMALL_PLANT = registerBlock("black_small_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block GREEN_SMALL_PLANT = registerBlock("green_small_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block PINK_SMALL_PLANT = registerBlock("pink_small_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block BLACK_FERN = registerBlock("black_fern",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block LEG_PLANT = registerBlock("leg_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block THORNY_GROWER = registerBlock("thorny_grower",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block BLACK_SEAWEED = registerBlock("black_seaweed",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block GREEN_SEAWEED = registerBlock("green_seaweed",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block BROWN_SEAWEED = registerBlock("brown_seaweed",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block HANGING_PLANT = registerBlock("hanging_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block HANGING_PLANT_2 = registerBlock("hanging_plant_2",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block RED_TALL_PLANT = registerBlock("red_tall_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block PINK_TALL_PLANT = registerBlock("pink_tall_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block GREEN_TALL_PLANT = registerBlock("green_tall_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block YELLOW_TALL_PLANT = registerBlock("yellow_tall_plant",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));

    public static final Block LARGE_DEBRIS = registerBlock("large_debris",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block CC_DIAGONAL_BEAM = registerBlock("cc_diagonal_beam",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block SMALL_DEBRIS = registerBlock("small_debris",
            new DeadCoralBlock (FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block DIAGONAL_BEAM = registerBlock("diagonal_beam",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block X_BEAM = registerBlock("x_beam",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block HORIZONTAL_PIPES = registerBlock("horizontal_pipes",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block MESSY_PIPES = registerBlock("messy_pipes",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block HORIZONTAL_DIAGONAL_BEAM = registerBlock("horizontal_diagonal_beam",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block HORIZONTAL_X_BEAM = registerBlock("horizontal_x_beam",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));
    public static final Block VERTICAL_PIPES = registerBlock("vertical_pipes",
            new DeadCoralWallFanBlock(FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision().offset(AbstractBlock.OffsetType.NONE)));


    public static final Block BROWN_PIPE_STRAIGHT = registerBlock("brown_pipe_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));
    public static final Block BROWN_PIPE_SS = registerBlock("brown_pipe_ss",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BROWN_PIPE_ST = registerBlock("brown_pipe_st",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BROWN_PIPE_SD = registerBlock("brown_pipe_sd",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BLUE_PIPE_STRAIGHT = registerBlock("blue_pipe_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));
    public static final Block BLUE_PIPE_SS = registerBlock("blue_pipe_ss",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BLUE_PIPE_ST = registerBlock("blue_pipe_st",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BLUE_PIPE_SD = registerBlock("blue_pipe_sd",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GRAY_PIPE_STRAIGHT = registerBlock("gray_pipe_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));
    public static final Block GRAY_PIPE_SS = registerBlock("gray_pipe_ss",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GRAY_PIPE_ST = registerBlock("gray_pipe_st",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GRAY_PIPE_SD = registerBlock("gray_pipe_sd",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block PIPE_2X2_STRAIGHT = registerBlock("pipe_2x2_straight",
            new PillarBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));
    public static final Block PIPE_2X2_SS = registerBlock("pipe_2x2_ss",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block PIPE_2X2_ST = registerBlock("pipe_2x2_st",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block PIPE_2X2_SD = registerBlock("pipe_2x2_sd",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block PIPE_2X2_TOP = registerBlock("pipe_2x2_top",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));

    public static final Block BROWN_CHEVRON = registerBlock("brown_chevron",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BLACK_CHEVRON = registerBlock("black_chevron",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GIRDER = registerBlock("girder",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GRAY_FANBOX = registerBlock("gray_fanbox",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block BROWN_FANBOX = registerBlock("brown_fanbox",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));




    public static final Block SL_WORN_STONE = registerBlock("sl_worn_stone",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RW_DIRT = registerBlock("rw_dirt",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GLASS_1 = registerBlock("glass_1",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_2 = registerBlock("glass_2",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_3 = registerBlock("glass_3",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_4 = registerBlock("glass_4",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_5 = registerBlock("glass_5",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_6 = registerBlock("glass_6",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_7 = registerBlock("glass_7",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_8 = registerBlock("glass_8",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_9 = registerBlock("glass_9",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_10 = registerBlock("glass_10",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_11 = registerBlock("glass_11",
            new GlassBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));


    public static final Block GLASS_PANE_1 = registerBlock("glass_pane_1",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_2 = registerBlock("glass_pane_2",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_3 = registerBlock("glass_pane_3",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_4 = registerBlock("glass_pane_4",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_5 = registerBlock("glass_pane_5",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_6 = registerBlock("glass_pane_6",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_7 = registerBlock("glass_pane_7",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_8 = registerBlock("glass_pane_8",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_9 = registerBlock("glass_pane_9",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_10 = registerBlock("glass_pane_10",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));
    public static final Block GLASS_PANE_11 = registerBlock("glass_pane_11",
            new PaneBlock (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).nonOpaque()));

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
    public static final Block GRATE_SIDE = registerBlock("grate_side",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));
    public static final Block GRATE_MIDDLE = registerBlock("grate_middle",
            new GlazedTerracottaBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));


    public static final Block RED_SHIPMENT = registerBlock("red_shipment",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block RED_SHIPMENT_EDGE = registerBlock("red_shipment_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BLUE_SHIPMENT = registerBlock("blue_shipment",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block BLUE_SHIPMENT_EDGE = registerBlock("blue_shipment_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GREEN_SHIPMENT = registerBlock("green_shipment",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block GREEN_SHIPMENT_EDGE = registerBlock("green_shipment_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block YELLOW_SHIPMENT = registerBlock("yellow_shipment",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block YELLOW_SHIPMENT_EDGE = registerBlock("yellow_shipment_edge",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static final Block WORN_STONE = registerBlock("worn_stone",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block SLIGHTLY_DIRTY_WORN_STONE = registerBlock("slightly_dirty_worn_stone",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block DIRTY_WORN_STONE = registerBlock("dirty_worn_stone",
            new Block (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block GRAY_METAL = registerBlock("gray_metal",
            new Block (FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block WORN_STONE_SLAB = registerBlock("worn_stone_slab",
            new SlabBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block WORN_STONE_STAIRS = registerBlock("worn_stone_stairs",
            new StairsBlock (ModBlocks.WORN_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block GRAY_METAL_STAIRS = registerBlock("gray_metal_stairs",
            new StairsBlock (ModBlocks.GRAY_METAL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block WORN_STONE_WALL = registerBlock("worn_stone_wall",
            new WallBlock (FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));



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
