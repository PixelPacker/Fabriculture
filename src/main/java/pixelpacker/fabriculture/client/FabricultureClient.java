package pixelpacker.fabriculture.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import pixelpacker.fabriculture.registers.BlockRegister;

@Environment(EnvType.CLIENT)
public class FabricultureClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMapForClient blockRenderLayerMapForClient = new BlockRenderLayerMapForClient();
        blockRenderLayerMapForClient.doLayerMaps();
    }
}
