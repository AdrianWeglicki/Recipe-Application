package com.adrianv.recipeapp.services;

import com.adrianv.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
