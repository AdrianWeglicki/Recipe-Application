package com.adrianv.recipeapp.services;

import com.adrianv.recipeapp.domain.Recipe;
import com.adrianv.recipeapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {

    private RecipeServiceImpl recipeServiceImpl;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeServiceImpl = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {

        Set<Recipe> recipesData = new HashSet();
        recipesData.add(new Recipe());

        when(recipeRepository.findAll()).thenReturn(recipesData);
        Set<Recipe> recipes = recipeServiceImpl.getRecipes();
        assertEquals(recipes.size(),recipesData.size());
        verify(recipeRepository,times(1)).findAll();
    }
}