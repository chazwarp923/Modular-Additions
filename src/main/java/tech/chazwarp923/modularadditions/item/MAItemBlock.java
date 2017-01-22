/**
@author Chaz Kerby
 */

package tech.chazwarp923.modularadditions.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class MAItemBlock extends ItemBlock {

	public MAItemBlock(Block block) {
		super(block);
		setHasSubtypes(true);
	}
}