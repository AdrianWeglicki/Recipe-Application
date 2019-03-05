package com.adrianv.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class IngredientTest {

    private Ingredient ingredient;
    private Recipe recipe;
    private UnitOfMeasure unitOfMeasure;


    @Before
    public void setUp(){

        unitOfMeasure = new UnitOfMeasure();
        unitOfMeasure.setId(2L);
        unitOfMeasure.setDescription("Description UOM");

        recipe = new Recipe();
        recipe.setId(1L);
        recipe.setDescription("Recipe Description");
        recipe.setCookTime(2);

        ingredient = new Ingredient("fresh lime juice or lemon juice", new BigDecimal(2), unitOfMeasure, recipe);
    }

    @Test
    public void getId() {
        Long id = 1L;
        ingredient.setId(id);
        assertEquals(id,ingredient.getId());
    }

    @Test
    public void getDescription() {
        String description = "fresh lime juice or lemon juice";
        assertEquals(description,ingredient.getDescription());
    }

    @Test
    public void getAmount() {
        BigDecimal amount = new BigDecimal(2);
        assertEquals(amount,ingredient.getAmount());
    }

    @Test
    public void getUnitOfMeasure() {
        assertEquals(unitOfMeasure, ingredient.getUnitOfMeasure());
    }

    @Test
    public void getRecipe() {
        assertEquals(recipe, ingredient.getRecipe());
    }
}