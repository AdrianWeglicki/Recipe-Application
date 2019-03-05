package com.adrianv.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RecipeTest {

    private Recipe recipe;

    @Before
    public void setUp() throws Exception {
        recipe = new Recipe();
    }

    @Test
    public void getId() {
        Long id = 2L;
        recipe.setId(id);
        assertEquals(id,recipe.getId());
    }

    @Test
    public void getDescription() {
        String description = "Perfect Guacamole";
        recipe.setDescription(description);
        assertEquals(description,recipe.getDescription());
    }

    @Test
    public void getPrepTime() {
        Integer prepTime = 10;
        recipe.setPrepTime(prepTime);
        assertEquals(prepTime,recipe.getPrepTime());
    }

    @Test
    public void getCookTime() {
        Integer cookTime = 0;
        recipe.setCookTime(cookTime);
        assertEquals(cookTime,recipe.getCookTime());
    }

    @Test
    public void getServings() {
        Integer servings = 2;
        recipe.setServings(servings);
        assertEquals(servings,recipe.getServings());
    }

    @Test
    public void getSource() {
        String source = "http://www.sourcepage.com/";
        recipe.setSource(source);
        assertEquals(source,recipe.getSource());
    }

    @Test
    public void getUrl() {
        String url = "http://www.recipepage.com/";
        recipe.setUrl(url);
        assertEquals(url,recipe.getUrl());
    }

    @Test
    public void getDirections() {
        String directions = "\"1 Cut avocado, remove flesh: Cut the avocados in half. Remove seed. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon\" +\n" +
                "                \"\\n\" +\n" +
                "                \"2 Mash with a fork: Using a fork, roughly mash the avocado. (Don't overdo it! The guacamole should be a little chunky.)\" +\n" +
                "                \"\\n\" +\n" +
                "                \"3 Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. The acid in the lime juice will provide some balance to the richness of the avocado and will help delay the avocados from turning brown.\\n\" +\n" +
                "                \"Add the chopped onion, cilantro, black pepper, and chiles. Chili peppers vary individually in their hotness. So, start with a half of one chili pepper and add to the guacamole to your desired degree of hotness.\\n\" +\n" +
                "                \"Remember that much of this is done to taste because of the variability in the fresh ingredients. Start with this recipe and adjust to your taste.\\n\" +\n" +
                "                \"4 Cover with plastic and chill to store: Place plastic wrap on the surface of the guacamole cover it and to prevent air reaching it. (The oxygen in the air causes oxidation which will turn the guacamole brown.) Refrigerate until ready to serve.\\n\" +\n" +
                "                \"Chilling tomatoes hurts their flavor, so if you want to add chopped tomato to your guacamole, add it just before serving.\\n\" +\n" +
                "                \"\\n\" ";

        recipe.setDirections(directions);
        assertEquals(directions,recipe.getDirections());
    }

    @Test
    public void getDifficulty() {
        Difficulty difficulty = Difficulty.EASY;
        recipe.setDifficulty(difficulty);
        assertEquals(difficulty,recipe.getDifficulty());
    }

    @Test
    public void getIngredients() {
        UnitOfMeasure eachUom = new UnitOfMeasure();
        eachUom.setId(1L);
        eachUom.setDescription("each");
        UnitOfMeasure teaspoonUom = new UnitOfMeasure();
        teaspoonUom.setId(2L);
        teaspoonUom.setDescription("tablespoon");
        Set<Ingredient> ingredientSet = new HashSet<>();
        ingredientSet.add(new Ingredient("ripe avocados", new BigDecimal(2), eachUom, recipe));
        ingredientSet.add(new Ingredient("Kosher salt", new BigDecimal(5), teaspoonUom, recipe));
        recipe.setIngredients(ingredientSet);

        assertEquals(ingredientSet, recipe.getIngredients());
    }

    @Test
    public void getNotes() {
        Notes notes = new Notes();
        notes.setRecipeNotes("For a very quick guacamole just take a 1/4 cup of salsa and mix it in with your mashed avocados.\n" +
                "Feel free to experiment! One classic Mexican guacamole has pomegranate seeds and chunks of peaches in it (a Diana Kennedy favorite). Try guacamole with added pineapple, mango, or strawberries.\n" +
                "The simplest version of guacamole is just mashed avocados with salt. Don't let the lack of availability of other ingredients stop you from making guacamole.\n" +
                "To extend a limited supply of avocados, add either sour cream or cottage cheese to your guacamole dip. Purists may be horrified, but so what? It tastes great.\n" +
                "\n");
        notes.setRecipe(recipe);
        recipe.setNotes(notes);
        assertEquals(notes,recipe.getNotes());
    }

    @Test
    public void getCategories() {
        Category category = new Category();
        category.setId(2L);
        category.setRecipes(new HashSet<>());
        category.setDescription("American");

        Set<Category> categorySet = new HashSet<>();
        categorySet.add(category);
        recipe.setCategories(categorySet);
        assertEquals(categorySet,recipe.getCategories());
    }

    @Test
    public void getImage() {
    }
}