

package teamrazor.deepaether.init;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import teamrazor.deepaether.DeepAetherMod;

@Mod.EventBusSubscriber(modid = DeepAetherMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DATabs {
    public static CreativeModeTab TAB_DEEP_AETHER_BLOCKS_TAB;
    public static CreativeModeTab TAB_DEEP_AETHER_ITEMS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TAB_DEEP_AETHER_BLOCKS_TAB = event.registerCreativeModeTab(
                new ResourceLocation(DeepAetherMod.MODID, "deep_aether_blocks"),
                builder -> builder.icon(() -> new ItemStack(DABlocks.FLOWERING_ROSEROOT_LEAVES.get()))
                        .title(Component.translatable("itemGroup." + DeepAetherMod.MODID + ".deep_aether_blocks"))
                        .displayItems((features, output, hasPermissions) -> {
                            output.accept(DABlocks.ROSEROOT_LOG.get());
                            output.accept(DABlocks.ROSEROOT_WOOD.get());
                            output.accept(DABlocks.STRIPPED_ROSEROOT_LOG.get());
                            output.accept(DABlocks.STRIPPED_ROSEROOT_WOOD.get());
                            output.accept(DABlocks.ROSEROOT_PLANKS.get());
                            output.accept(DABlocks.ROSEROOT_STAIRS.get());
                            output.accept(DABlocks.ROSEROOT_SLAB.get());
                            output.accept(DABlocks.ROSEROOT_FENCE.get());
                            output.accept(DABlocks.ROSEROOT_FENCE_GATE.get());
                            output.accept(DABlocks.ROSEROOT_DOOR.get());
                            output.accept(DABlocks.ROSEROOT_TRAPDOOR.get());
                            output.accept(DABlocks.ROSEROOT_PRESSURE_PLATE.get());
                            output.accept(DABlocks.ROSEROOT_BUTTON.get());
                            output.accept(DABlocks.ROSEROOT_WALL.get());
                            output.accept(DABlocks.STRIPPED_ROSEROOT_WALL.get());
                            output.accept(DAItems.ROSEROOT_SIGN.get());
                            output.accept(DABlocks.ROSEROOT_LEAVES.get());
                            output.accept(DABlocks.FLOWERING_ROSEROOT_LEAVES.get());
                            output.accept(DABlocks.AERGLOW_PETAL_BLOCK.get());
                            output.accept(DABlocks.ROSEROOT_SAPLING.get());

                            output.accept(DABlocks.YAGROOT_LOG.get());
                            output.accept(DABlocks.YAGROOT_WOOD.get());
                            output.accept(DABlocks.STRIPPED_YAGROOT_LOG.get());
                            output.accept(DABlocks.STRIPPED_YAGROOT_WOOD.get());
                            output.accept(DABlocks.YAGROOT_PLANKS.get());
                            output.accept(DABlocks.YAGROOT_STAIRS.get());
                            output.accept(DABlocks.YAGROOT_SLAB.get());
                            output.accept(DABlocks.YAGROOT_FENCE.get());
                            output.accept(DABlocks.YAGROOT_FENCE_GATE.get());
                            output.accept(DABlocks.YAGROOT_DOOR.get());
                            output.accept(DABlocks.YAGROOT_TRAPDOOR.get());
                            output.accept(DABlocks.YAGROOT_PRESSURE_PLATE.get());
                            output.accept(DABlocks.YAGROOT_BUTTON.get());
                            output.accept(DABlocks.YAGROOT_WALL.get());
                            output.accept(DABlocks.STRIPPED_YAGROOT_WALL.get());
                            output.accept(DABlocks.YAGROOT_ROOTS.get());
                            output.accept(DABlocks.YAGROOT_VINE.get());
                            output.accept(DAItems.YAGROOT_SIGN.get());
                            output.accept(DABlocks.YAGROOT_LEAVES.get());
                            output.accept(DABlocks.YAGROOT_SAPLING.get());


                            output.accept(DABlocks.CRUDEROOT_LOG.get());
                            output.accept(DABlocks.CRUDEROOT_WOOD.get());
                            output.accept(DABlocks.STRIPPED_CRUDEROOT_LOG.get());
                            output.accept(DABlocks.STRIPPED_CRUDEROOT_WOOD.get());
                            output.accept(DABlocks.CRUDEROOT_PLANKS.get());
                            output.accept(DABlocks.CRUDEROOT_STAIRS.get());
                            output.accept(DABlocks.CRUDEROOT_SLAB.get());
                            output.accept(DABlocks.CRUDEROOT_FENCE.get());
                            output.accept(DABlocks.CRUDEROOT_FENCE_GATE.get());
                            output.accept(DABlocks.CRUDEROOT_DOOR.get());
                            output.accept(DABlocks.CRUDEROOT_TRAPDOOR.get());
                            output.accept(DABlocks.CRUDEROOT_PRESSURE_PLATE.get());
                            output.accept(DABlocks.CRUDEROOT_WALL.get());
                            output.accept(DABlocks.STRIPPED_CRUDEROOT_WALL.get());
                            output.accept(DABlocks.CRUDEROOT_BUTTON.get());
                            output.accept(DAItems.CRUDEROOT_SIGN.get());
                            output.accept(DABlocks.CRUDEROOT_LEAVES.get());
                            output.accept(DABlocks.CRUDEROOT_SAPLING.get());

                            output.accept(DABlocks.AETHER_MOSS_BLOCK.get());
                            output.accept(DABlocks.AETHER_MOSS_CARPET.get());

                            output.accept(DABlocks.AETHER_MUD.get());
                            output.accept(DABlocks.PACKED_AETHER_MUD.get());
                            output.accept(DABlocks.MUDDY_YAGROOT_ROOTS.get());
                            output.accept(DABlocks.AETHER_MUD_BRICKS_STAIRS.get());
                            output.accept(DABlocks.AETHER_MUD_BRICKS_SLAB.get());

                            output.accept(DABlocks.ASETERITE.get());
                            output.accept(DABlocks.ASETERITE_STAIRS.get());
                            output.accept(DABlocks.ASETERITE_SLAB.get());
                            output.accept(DABlocks.ASETERITE_WALL.get());
                            output.accept(DABlocks.POLISHED_ASETERITE.get());
                            output.accept(DABlocks.POLISHED_ASETERITE_STAIRS.get());
                            output.accept(DABlocks.POLISHED_ASETERITE_SLAB.get());

                            output.accept(DABlocks.JARINITE.get());
                            output.accept(DABlocks.JARINITE_STAIRS.get());
                            output.accept(DABlocks.JARINITE_SLAB.get());
                            output.accept(DABlocks.JARINITE_WALL.get());
                            output.accept(DABlocks.POLISHED_JARINITE.get());
                            output.accept(DABlocks.POLISHED_JARINITE_STAIRS.get());
                            output.accept(DABlocks.POLISHED_JARINITE_SLAB.get());

                            output.accept(DABlocks.GREOTITE.get());
                            output.accept(DABlocks.GREOTITE_STAIRS.get());
                            output.accept(DABlocks.GREOTITE_SLAB.get());
                            output.accept(DABlocks.GREOTITE_WALL.get());
                            output.accept(DABlocks.POLISHED_GREOTITE.get());
                            output.accept(DABlocks.POLISHED_GREOTITE_STAIRS.get());
                            output.accept(DABlocks.POLISHED_GREOTITE_SLAB.get());

                            output.accept(DABlocks.CLORITE.get());
                            output.accept(DABlocks.CLORITE_STAIRS.get());
                            output.accept(DABlocks.CLORITE_SLAB.get());
                            output.accept(DABlocks.CLORITE_WALL.get());
                            output.accept(DABlocks.POLISHED_CLORITE.get());
                            output.accept(DABlocks.POLISHED_CLORITE_STAIRS.get());
                            output.accept(DABlocks.POLISHED_CLORITE_SLAB.get());

                            output.accept(DABlocks.YALLESITE.get());
                            output.accept(DABlocks.YALLESITE_STAIRS.get());
                            output.accept(DABlocks.YALLESITE_SLAB.get());
                            output.accept(DABlocks.YALLESITE_WALL.get());
                            output.accept(DABlocks.POLISHED_YALLESITE.get());
                            output.accept(DABlocks.POLISHED_YALLESITE_STAIRS.get());
                            output.accept(DABlocks.POLISHED_YALLESITE_SLAB.get());

                            output.accept(DABlocks.DARKERITE.get());
                            output.accept(DABlocks.DARKERITE_STAIRS.get());
                            output.accept(DABlocks.DARKERITE_SLAB.get());
                            output.accept(DABlocks.DARKERITE_WALL.get());
                            output.accept(DABlocks.POLISHED_DARKERITE.get());
                            output.accept(DABlocks.POLISHED_DARKERITE_STAIRS.get());
                            output.accept(DABlocks.POLISHED_DARKERITE_SLAB.get());

                            output.accept(DABlocks.SKYJADE_ORE.get());
                            output.accept(DABlocks.SKYJADE_BLOCK.get());
                            output.accept(DABlocks.CLOUDIUM_DEBRIS.get());
                            output.accept(DABlocks.CLOUDIUM_BLOCK.get());

                            output.accept(DABlocks.HOLYSTONE_BRICKS.get());
                            output.accept(DABlocks.HOLYSTONE_BRICKS_SLAB.get());
                            output.accept(DABlocks.HOLYSTONE_BRICKS_STAIRS.get());

                            output.accept(DABlocks.RADIANT_ORCHID.get());
                            output.accept(DABlocks.AERLAVENDER.get());
                            output.accept(DABlocks.TALL_AERLAVENDER.get());

                            output.accept(DAItems.VIRULENT_QUICKSAND_BUCKET.get());
                            output.accept(DAItems.SKYROOT_VIRULENT_QUICKSAND_BUCKET.get());
                            output.accept(DAItems.PLACEABLE_POISON_BUCKET.get());
                        }));

        TAB_DEEP_AETHER_ITEMS_TAB = event.registerCreativeModeTab(
                new ResourceLocation(DeepAetherMod.MODID, "deep_aether_items"),
                builder -> builder.icon(() -> new ItemStack(DAItems.SKYJADE_TOOLS_SWORD.get()))
                        .title(Component.translatable("itemGroup." + DeepAetherMod.MODID + ".deep_aether_items"))
                        .displayItems((features, output, hasPermissions) -> {
                            output.accept(DAItems.SKYJADE.get());
                            output.accept(DAItems.SKYJADE_TOOLS_SWORD.get());
                            output.accept(DAItems.SKYJADE_TOOLS_AXE.get());
                            output.accept(DAItems.SKYJADE_TOOLS_PICKAXE.get());
                            output.accept(DAItems.SKYJADE_TOOLS_SHOVEL.get());
                            output.accept(DAItems.SKYJADE_TOOLS_HOE.get());
                            output.accept(DAItems.SKYJADE_ARMOR_BOOTS.get());
                            output.accept(DAItems.SKYJADE_ARMOR_LEGGINGS.get());
                            output.accept(DAItems.SKYJADE_ARMOR_CHESTPLATE.get());
                            output.accept(DAItems.SKYJADE_ARMOR_HELMET.get());
                            output.accept(DAItems.SKYJADE_RING.get());
                            output.accept(DAItems.SKYJADE_GLOVES.get());

                            output.accept(DAItems.CLOUDIUM_INGOT.get());
                            output.accept(DAItems.CLOUDIUM_SCRAP.get());
                            output.accept(DAItems.CLOUDIUM_SWORD.get());
                            output.accept(DAItems.CLOUDIUM_AXE.get());
                            output.accept(DAItems.CLOUDIUM_PICKAXE.get());
                            output.accept(DAItems.CLOUDIUM_SHOVEL.get());
                            output.accept(DAItems.CLOUDIUM_HOE.get());
                            output.accept(DAItems.CLOUDIUM_BOOTS.get());
                            output.accept(DAItems.CLOUDIUM_LEGGINGS.get());
                            output.accept(DAItems.CLOUDIUM_CHESTPLATE.get());
                            output.accept(DAItems.CLOUDIUM_HELMET.get());
                            output.accept(DAItems.CLOUDIUM_RING.get());
                            output.accept(DAItems.CLOUDIUM_GLOVES.get());

                            output.accept(DAItems.GRAVITIE_RING.get());

                            output.accept(DAItems.RAW_AERGLOW_FISH.get());
                            output.accept(DAItems.COOKED_AERGLOW_FISH.get());
                            output.accept(DAItems.RAW_QUAIL.get());
                            output.accept(DAItems.COOKED_QUAIL.get());

                            output.accept(DAItems.ROSEROOT_BOAT.get());
                            output.accept(DAItems.ROSEROOT_CHEST_BOAT.get());
                            output.accept(DAItems.YAGROOT_BOAT.get());
                            output.accept(DAItems.YAGROOT_CHEST_BOAT.get());
                            output.accept(DAItems.CRUDEROOT_BOAT.get());
                            output.accept(DAItems.CRUDEROOT_CHEST_BOAT.get());

                            output.accept(DAItems.MUSIC_DISC_NABOORU.get());
                            output.accept(DAItems.MUSIC_DISC_A_MORNING_WISH.get());

                            output.accept(DAItems.AERGLOW_FISH_EGG.get());
                            output.accept(DAItems.QUAIL_EGG.get());

                            output.accept(DAItems.AERGLOW_PETAL.get());
                        }));
    }
}



/*
		};
		TAB_DEEP_AETHER_ITEMS_TAB = new CreativeModeTab("tabdeep_aether_items_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DeepAetherModItems.SKYJADE_TOOLS_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
*/