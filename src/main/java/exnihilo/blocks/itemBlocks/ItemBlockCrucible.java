package exnihilo.blocks.itemBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCrucible extends ItemBlock {
  public ItemBlockCrucible(Block block) {
    super(block);
  }

  @Override
  public String getUnlocalizedName(ItemStack itemstack) {
    return "exnihilo.crucible";
  }

  @Override
  public int getMetadata(int meta) {
    return meta;
  }
}
