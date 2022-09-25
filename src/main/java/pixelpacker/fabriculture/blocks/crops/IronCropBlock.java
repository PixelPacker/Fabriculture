package pixelpacker.fabriculture.blocks.crops;

import net.minecraft.item.ItemConvertible;
import pixelpacker.fabriculture.blocks.baseclasses.FabricultureCropBlock;
import pixelpacker.fabriculture.registers.ItemRegister;

public class IronCropBlock extends FabricultureCropBlock {
    public IronCropBlock(Settings settings) {
        super(settings);
    }

    public ItemConvertible getSeedsItem(){
        return ItemRegister.IRON_SEED;
    }
}
