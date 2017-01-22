/**
@author Chaz Kerby
 */
package tech.chazwarp923.modularadditions;

import mcjty.lib.compat.CompatCreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModularAdditionsTab extends CompatCreativeTabs {
	public static final ModularAdditionsTab tab = new ModularAdditionsTab();

	public ModularAdditionsTab() {
		super(Reference.MOD_ID);
		setBackgroundImageName("item_search.png");
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

	@Override
	protected Item getItem() {
		return Items.BAKED_POTATO;
	}
}