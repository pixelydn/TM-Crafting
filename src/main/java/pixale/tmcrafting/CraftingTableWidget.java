package pixale.tmcrafting;

import net.minecraft.network.chat.Component;
import smartin.miapi.client.gui.InteractAbleWidget;
import smartin.miapi.client.gui.crafting.CraftingScreen;
import smartin.miapi.modules.edit_options.EditOption;

public class CraftingTableWidget extends InteractAbleWidget{

    private final EditOption.EditContext editContext;

    public CraftingTableWidget(int x, int y, int width, int height, EditOption.EditContext editContext) {
        super(x, y, width, height, Component.translatable("miapi.ui.crafting_table"));
        this.editContext = editContext;



    }


}
