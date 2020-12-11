package com.modmachine.guildhallquestmod.items;

import com.modmachine.guildhallquestmod.GuildHallQuesting;
import com.modmachine.guildhallquestmod.util.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class QuestBook extends Item {
    public QuestBook() {
        super(new Item.Properties().group(GuildHallQuesting.TAB).maxStackSize(1));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("Holds all of your important quests, dummy."));
        }
        else
        {
            tooltip.add(new StringTextComponent("Hold "+"\u00A72"+"Shift"+"\u00A7f"+" for more Information"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}