package com.newakkoff.Repositories;

import com.newakkoff.Models.ExcuseCategory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Фахош on 20.08.2016.
 */
public interface ExcuseCategoriesRepository extends MongoRepository<ExcuseCategory, String> {

    ExcuseCategory findExcuseCategoryBycategoryNameIgnoreCase(String name);

}
