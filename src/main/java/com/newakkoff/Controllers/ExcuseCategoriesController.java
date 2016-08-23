package com.newakkoff.Controllers;

import com.newakkoff.Models.ExcuseCategory;
import com.newakkoff.Repositories.ExcuseCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Фахош on 20.08.2016.
 */
@RestController
public class ExcuseCategoriesController {

    @Autowired
    private ExcuseCategoriesRepository excuseCategoriesRepository;

    @RequestMapping("/allexcusecategory")
    public List<ExcuseCategory> getAllExcuseCategories() {

        List<ExcuseCategory> allCategories = new ArrayList<>();
        allCategories.addAll(excuseCategoriesRepository.findAll());


        return allCategories  ;
    }

    @RequestMapping("/addexcusecategory")
    public String  addExcuseCategory(@RequestParam(value = "categoryName", defaultValue = "New Category") String categoryName,
                                  @RequestParam(value = "categoryDescription", defaultValue = "Empty")String categoryDescription) {

        ExcuseCategory excuseCategory = new ExcuseCategory(categoryName, categoryDescription);

        excuseCategoriesRepository.save(excuseCategory);

        return excuseCategory.toString();
    }

}
