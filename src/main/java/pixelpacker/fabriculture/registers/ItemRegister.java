package pixelpacker.fabriculture.registers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pixelpacker.fabriculture.Fabriculture;

public class ItemRegister {

    //Examples
    //public static final Item STONE_SEED = new AliasedBlockItem(BlockRegister.STONE_CROP, new Item.Settings().group(ItemGroupRegister.FABRICULTURE_GROUP));
    //public static final Item STONE_ESSENCE = new Item(new FabricItemSettings().group(ItemGroupRegister.FABRICULTURE_GROUP));

    static ItemGroup generalItemGroup = ItemGroupRegister.FABRICULTURE_GROUP;

    public static final Item IRON_SEED = new AliasedBlockItem(BlockRegister.IRON_CROP, new Item.Settings().group(generalItemGroup));
    public static final Item IRON_ESSENCE = new Item(new FabricItemSettings().group(generalItemGroup));

    public static final Item FLUX_DUST = new Item(new FabricItemSettings().group(generalItemGroup));

    public void register(){
        //Examples
        //registerItem("stone_seed", STONE_SEED);
        //registerItem("stone_essence", STONE_ESSENCE);

        registerItem("iron_seed", IRON_SEED);
        registerItem("iron_essence", IRON_ESSENCE);
        registerItem("flux_dust", FLUX_DUST);
    }

    private void registerItem(String itemName, Item item){
        Registry.register(Registry.ITEM, new Identifier(Fabriculture.MODID, itemName), item);
    }
}
