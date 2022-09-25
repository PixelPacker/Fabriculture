package pixelpacker.fabriculture.registers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pixelpacker.fabriculture.Fabriculture;
import pixelpacker.fabriculture.blocks.crops.IronCropBlock;

public class BlockRegister {
    //Example
    //public static final Block STONE_CROP = new StoneCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    public static final Block IRON_CROP = new IronCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
    public static final Block FLUX_ORE = new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(3.0f, 3.0f).requiresTool());

    public void register(){
        //Example
        //registerCrop("stone_crop", STONE_CROP);
        registerCrop("iron_crop", IRON_CROP);

        registerBlock("flux_ore", FLUX_ORE);
    }

    private void registerBlock(String blockName, Block block){
        Registry.register(Registry.BLOCK, new Identifier(Fabriculture.MODID, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(Fabriculture.MODID, blockName), new BlockItem(block, new FabricItemSettings().group(ItemGroupRegister.FABRICULTURE_GROUP)));
    }

    private void registerCrop(String blockName, Block block){
        Registry.register(Registry.BLOCK, new Identifier(Fabriculture.MODID, blockName), block);
    }
}
