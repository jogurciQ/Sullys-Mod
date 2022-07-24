package com.uraneptus.sullysmod.core.data.server.tags;

import com.teamabnormals.blueprint.core.other.tags.BlueprintBiomeTags;
import com.uraneptus.sullysmod.SullysMod;
import com.uraneptus.sullysmod.core.other.tags.SMBiomeTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBiomeTagsProvider;
import org.jetbrains.annotations.Nullable;

public class SMBiomeTagsProvider extends BiomeTagsProvider {
    public SMBiomeTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper fileHelper) {
        super(generator, SullysMod.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        //Our Tags
        tag(SMBiomeTags.JADE_GENERATES_IN).addTag(BiomeTags.IS_JUNGLE);
        tag(SMBiomeTags.TORTOISES_SPAWN_IN).addTag(BiomeTags.IS_SAVANNA).addTag(BiomeTags.IS_JUNGLE).add(
                Biomes.BIRCH_FOREST,
                Biomes.OLD_GROWTH_BIRCH_FOREST
        );
        tag(SMBiomeTags.LANTERNFISH_SPAWN_IN)
                .addTag(BiomeTags.IS_OCEAN)
                .addTag(BiomeTags.IS_FOREST)
                .addTag(BiomeTags.IS_SAVANNA)
                .addTag(BiomeTags.IS_MOUNTAIN)
                .addTag(BiomeTags.IS_BADLANDS)
                .addTag(BiomeTags.IS_JUNGLE)
                .addTag(BiomeTags.IS_BEACH)
                .addTag(BiomeTags.IS_RIVER)
                .addTag(BiomeTags.IS_HILL)
                .addTag(BiomeTags.IS_TAIGA)
                .addTag(Tags.Biomes.IS_SNOWY)
                .addTag(Tags.Biomes.IS_PLAINS)
                .addTag(Tags.Biomes.IS_SANDY)
                .addTag(Tags.Biomes.IS_SWAMP)
                .addTag(Tags.Biomes.IS_MUSHROOM)
                .add(Biomes.DRIPSTONE_CAVES);
    }
}
