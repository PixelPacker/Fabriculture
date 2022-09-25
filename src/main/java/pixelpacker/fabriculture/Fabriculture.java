package pixelpacker.fabriculture;

import net.fabricmc.api.ModInitializer;
import pixelpacker.fabriculture.registers.BlockRegister;
import pixelpacker.fabriculture.registers.FeaturesRegister;
import pixelpacker.fabriculture.registers.ItemGroupRegister;
import pixelpacker.fabriculture.registers.ItemRegister;

public class Fabriculture implements ModInitializer {
    public static final String MODID = "fabriculture";

    @Override
    public void onInitialize() {
        BlockRegister blockRegister = new BlockRegister();
        ItemRegister itemRegister = new ItemRegister();
        ItemGroupRegister itemGroupRegister = new ItemGroupRegister();
        FeaturesRegister featuresRegister = new FeaturesRegister();

        blockRegister.register();
        itemRegister.register();
        featuresRegister.registerFeatures();
    }
}
