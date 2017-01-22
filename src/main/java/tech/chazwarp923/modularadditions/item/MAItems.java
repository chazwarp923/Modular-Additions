package tech.chazwarp923.modularadditions.item;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MAItems {

	public static void preInit() {
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void preInitClient() {
		
	}
	
	@SideOnly(Side.CLIENT)
    public static void initModel(MAItem item) {
        item.initModel();
    }
}