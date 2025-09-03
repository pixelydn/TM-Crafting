package pixale.tmcrafting;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.inventory.TransientCraftingContainer;
import net.minecraft.world.item.ItemStack;
import smartin.miapi.client.gui.InteractAbleWidget;
import smartin.miapi.client.gui.crafting.CraftingScreen;
import net.minecraft.world.inventory.CraftingMenu;
import smartin.miapi.modules.edit_options.EditOption;
import smartin.miapi.upgrade.UpgradeSelection;

import java.util.function.Consumer;

public class CraftingTableWidget extends InteractAbleWidget{

    private final EditOption.EditContext editContext;
    //private final Consumer<UpgradeSelection> onChange;
    //private final Consumer<UpgradeSelection> onCraft;
    //private final CraftingMenu craftingMenu;
    //private final TransientCraftingContainer craftingContainer;
    //private final ItemStack[] craftingSlots;
    private ItemStack resultSlot;
    //private static final ResourceLocation CRAFTING_TABLE_LOCATION = new ResourceLocation("textures/gui/container/crafting_table.png");

    public CraftingTableWidget(int x, int y, int width, int height,
                               EditOption.EditContext editContext
                               //Consumer<UpgradeSelection> onChange,
                               //Consumer<UpgradeSelection> onCraft,
                               //TransientCraftingContainer craftingContainer,
                               //ItemStack[] craftingSlots
    ) {
        super(x, y, width, height, Component.empty());
        this.editContext = editContext;
        //this.onChange = onChange;
        //this.onCraft = onCraft;
        //this.craftingMenu = craftingMenu;


        //this.craftingSlots = new ItemStack[9];
        //this.craftingContainer = new TransientCraftingContainer(null, 3, 3);
        //this.resultSlot = ItemStack.EMPTY;
        /*for (int i = 0; i < 9; i++) {
            craftingSlots[i] = ItemStack.EMPTY;
        }*/



    }


}
