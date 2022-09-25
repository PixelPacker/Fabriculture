package pixelpacker.fabriculture.registers;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import pixelpacker.fabriculture.Fabriculture;

import java.util.Arrays;


public class FeaturesRegister {

    private static final ConfiguredFeature<?, ?> OVERWORLD_FLUX_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>(
            Feature.ORE, new OreFeatureConfig(
            OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
            BlockRegister.FLUX_ORE.getDefaultState(),
            6
        )
    );

    private static final PlacedFeature OVERWORLD_FLUX_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(OVERWORLD_FLUX_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(17),
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(60))
            )
    );

    public void registerFeatures(){
        registerOreFeature("flux_ore", OVERWORLD_FLUX_ORE_CONFIGURED_FEATURE, OVERWORLD_FLUX_ORE_PLACED_FEATURE);
    }

    private void registerOreFeature(String featureName, ConfiguredFeature configuredFeature, PlacedFeature placedFeature){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier(Fabriculture.MODID, featureName), configuredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE,
                new Identifier(Fabriculture.MODID, featureName), placedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Fabriculture.MODID, featureName)));
    }
}
