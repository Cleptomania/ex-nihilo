package exnihilo.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import exnihilo.data.BlockData;
import exnihilo.data.ModData;
import net.minecraft.block.BlockSand;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockDust extends BlockSand {

    public BlockDust() {
        setHardness(0.4F);
        setStepSound(soundTypeSnow);
    }

    @Override
    public String getUnlocalizedName() {
        return ModData.ID + "." + BlockData.DUST_UNLOCALIZED_NAME;
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(ModData.TEXTURE_LOCATION + ":IconBlockDust");
    }

    @Override
    @SideOnly(Side.CLIENT)
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void getSubBlocks(Item item, CreativeTabs tabs, List items) {
        items.add(new ItemStack(item, 1, 0));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int id, int meta) {
        return this.blockIcon;
    }
}
