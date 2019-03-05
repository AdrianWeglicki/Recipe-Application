package com.adrianv.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {


    private Category category;

    @Before
    public void setUp(){
        category = new Category();
    }

    @Test
    public void getId(){
        Long idValue = 4L;
        category.setId(idValue);

        assertEquals(idValue,category.getId());
    }

    @Test
    public void getDescription(){
        String description = "description";
        category.setDescription(description);
        assertEquals(description,category.getDescription());
    }

    @Test
    public void getRecipes(){

        Set<Recipe> recipes = new HashSet<>();
        recipes.add(new Recipe());
        recipes.add(new Recipe());
        recipes.add(new Recipe());
        category.setRecipes(recipes);
        assertEquals(recipes.size(), category.getRecipes().size());

    }

}