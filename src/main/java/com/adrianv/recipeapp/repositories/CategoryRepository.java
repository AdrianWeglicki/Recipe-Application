package com.adrianv.recipeapp.repositories;

import com.adrianv.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
