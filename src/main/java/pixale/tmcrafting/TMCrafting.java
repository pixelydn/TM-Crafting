package pixale.tmcrafting;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import smartin.miapi.Miapi;
import smartin.miapi.registries.RegistryInventory;

public class TMCrafting implements ModInitializer {
	public static final String MOD_ID = "tm-crafting";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		RegistryInventory.EDIT_OPTION_MIAPI_REGISTRY.register(Miapi.id("module_upgrades"),
				new CraftingEditOption());

		LOGGER.info("Yo Wassup");
	}
}