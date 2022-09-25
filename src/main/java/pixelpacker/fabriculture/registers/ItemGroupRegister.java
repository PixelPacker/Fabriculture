package pixelpacker.fabriculture.registers;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import pixelpacker.fabriculture.Fabriculture;

public class ItemGroupRegister {
    public static final ItemGroup FABRICULTURE_GROUP = FabricItemGroupBuilder.build(new Identifier(Fabriculture.MODID, "general"), () -> new ItemStack(Items.WHEAT_SEEDS));

    public void register(){}
}
