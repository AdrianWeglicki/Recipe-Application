package com.adrianv.recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnitOfMeasureTest {

    private UnitOfMeasure unitOfMeasure;

    @Before
    public void setUp(){
        unitOfMeasure = new UnitOfMeasure();
    }

    @Test
    public void getId() {
        Long id = 1L;
        unitOfMeasure.setId(id);
        assertEquals(id,unitOfMeasure.getId());
    }

    @Test
    public void getDescription() {
        String description = "description UOM";
        unitOfMeasure.setDescription(description);
        assertEquals(description,unitOfMeasure.getDescription());
    }
}