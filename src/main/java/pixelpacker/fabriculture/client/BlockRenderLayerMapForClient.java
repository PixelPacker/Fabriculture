package pixelpacker.fabriculture.client;

import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import pixelpacker.fabriculture.registers.BlockRegister;

public class BlockRenderLayerMapForClient {
    public void doLayerMaps(){
        changeRenderLayerMap(BlockRegister.IRON_CROP);
    }

    private void changeRenderLayerMap(Block block){
        net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), block);
    }
}
