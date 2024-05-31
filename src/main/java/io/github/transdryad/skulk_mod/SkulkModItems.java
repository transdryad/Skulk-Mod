package io.github.transdryad.skulk_mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class SkulkModItems {
	public static final Item SKULK_ORE = new Item(new QuiltItemSettings());
	public static final Item SKULK_INGOT = new Item(new QuiltItemSettings());

	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "skulk_ore"), SKULK_ORE);
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "skulk_ingot"), SKULK_INGOT);

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
			entries.addItem(SKULK_ORE);
			entries.addItem(SKULK_INGOT);
		});
	}
}
