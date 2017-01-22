/**
@author Chaz Kerby
 */

package tech.chazwarp923.modularadditions.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tech.chazwarp923.modularadditions.ModularAdditionsTab;

public class MAItem extends Item {
	
	protected MAItem(String unlocalizedName) {
		super();
		
		setCreativeTab(ModularAdditionsTab.tab);
		setRegistryName(unlocalizedName);
		setUnlocalizedName(unlocalizedName);
		
		GameRegistry.register(this);
	}
	
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}