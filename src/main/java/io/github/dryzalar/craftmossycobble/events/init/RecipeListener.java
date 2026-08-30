package io.github.dryzalar.craftmossycobble.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;

public class RecipeListener {
    @EventListener
    public static void registerRecipes(RecipeRegisterEvent event) {
        if (event.recipeId == RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            CraftingRegistry.addShapedRecipe(new ItemStack(Block.MOSSY_COBBLESTONE),
                    "SSS", "LCL", "SSS",
                    'S', Item.SLIMEBALL,
                    'L', Block.LEAVES,
                    'C', Block.COBBLESTONE);
        }
    }
}
