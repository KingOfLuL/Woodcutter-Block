package com.gmail.pascald701.WoodcutterMod.recipe;

import com.gmail.pascald701.registry.ModItems;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class WoodcuttingRecipe extends CuttingRecipe {

	   public WoodcuttingRecipe(RecipeType<?> type, RecipeSerializer<?> serializer, Identifier id, String group, Ingredient input, ItemStack output) {
		super(ModItems.WOODCUTTING_RECIPE_TYPE, ModItems.WOODCUTTING_SERIALIZER, id, group, input, output);
	}

	public boolean matches(Inventory inv, World world) {
	      return this.input.test(inv.getStack(0));
	   }

	   @Environment(EnvType.CLIENT)
	   public ItemStack getRecipeKindIcon() {
	      return new ItemStack(ModItems.WOOD_CUTTER_BLOCK);
	   }

}
