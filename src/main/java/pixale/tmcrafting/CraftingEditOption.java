package pixale.tmcrafting;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.TransientCraftingContainer;
import net.minecraft.world.item.ItemStack;
import smartin.miapi.Miapi;
import smartin.miapi.client.gui.InteractAbleWidget;
import smartin.miapi.modules.edit_options.EditOption;
import smartin.miapi.modules.edit_options.EditOptionIcon;
import smartin.miapi.network.Networking;
import smartin.miapi.registries.RegistryInventory;
import smartin.miapi.upgrade.UpgradeEditView;
import smartin.miapi.upgrade.UpgradeSelection;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CraftingEditOption implements EditOption{


    @Override
    public ItemStack preview(
            FriendlyByteBuf friendlyByteBuf,
            EditContext editContext
    ) {
        return editContext.getItemstack();
    }

    @Override
    public ItemStack execute(FriendlyByteBuf buf
            , EditContext editContext
    ) {
        return editContext.getItemstack();
    }

    @Override
    public boolean isVisible(EditContext editContext) {
        return true;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public InteractAbleWidget getGui(
            int x,
            int y,
            int width,
            int height,
            EditContext editContext
    ) {
        return new CraftingTableWidget(x, y, width, height, editContext);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public InteractAbleWidget getIconGui(int x, int y, int width, int height, Consumer<EditOption> select, Supplier<EditOption> getSelected) {
        return new EditOptionIcon(x, y, width, height, select, getSelected, Miapi.id(
                TMCrafting.MOD_ID,
                "textures/gui/background.png"),
                0, 0, 64, 64,
                "miapi.ui.edit_option.hover.upgrade",
                this
        );
    }
}

