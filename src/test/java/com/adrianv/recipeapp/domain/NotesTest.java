package com.adrianv.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NotesTest {

    private Notes notes;
    private Recipe recipe;
    @Before
    public void setUp(){
        notes = new Notes();

        recipe = new Recipe();
        recipe.setId(1L);
        recipe.setDescription("Recipe Description");
        recipe.setCookTime(2);
    }

    @Test
    public void getId() {
        Long id = 1L;
        notes.setId(id);
        assertEquals(id,notes.getId());
    }

    @Test
    public void getRecipe() {

        Ingredient ingredient = new Ingredient("fresh lime juice or lemon juice", new BigDecimal(2), new UnitOfMeasure(), recipe);
        Set<Ingredient> ingredientsSet = new HashSet<>();
        ingredientsSet.add(ingredient);
        recipe.setIngredients(ingredientsSet);

        notes.setRecipe(recipe);
        assertEquals(recipe,notes.getRecipe());
    }

    @Test
    public void getRecipeNotes() {
        String recipeNotes = "recipe Notes";
        notes.setRecipeNotes(recipeNotes);

        assertEquals(recipeNotes, notes.getRecipeNotes());

    }
}