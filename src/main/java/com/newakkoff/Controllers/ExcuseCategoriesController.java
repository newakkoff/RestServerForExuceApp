package com.newakkoff.Controllers;

import com.newakkoff.Models.Excuse;
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

    @RequestMapping("/ExcuseCategory/getAllExcuseCategories")
    public List<ExcuseCategory> getAllExcuseCategories() {

        List<ExcuseCategory> allCategories = new ArrayList<>();
        allCategories.addAll(excuseCategoriesRepository.findAll());


        return allCategories;
    }

    @RequestMapping("/ExcuseCategory/setNewExcuseCategory")
    public ExcuseCategory setNewExcuseCategory(@RequestParam(value = "categoryName", defaultValue = "New Category") String categoryName,
                                               @RequestParam(value = "categoryDescription", defaultValue = "Empty") String categoryDescription) {

        ExcuseCategory excuseCategory = new ExcuseCategory(categoryName, categoryDescription);

        excuseCategoriesRepository.save(excuseCategory);

        return excuseCategory;
    }

    @RequestMapping("/ExcuseCategory/setNewExcuseToCategory")
    public ExcuseCategory setNewExcuseToCategory(@RequestParam(value = "categoryName") String categoryName,
                                                 @RequestParam(value = "excuseTitle") String excuseTitle,
                                                 @RequestParam(value = "excuseContent") String excuseContent) {

        if (excuseTitle != null && excuseContent != null) {
            Excuse excuse = new Excuse(excuseTitle, excuseContent);

            ExcuseCategory excuseCategory = excuseCategoriesRepository.findExcuseCategoryBycategoryNameIgnoreCase(categoryName);
            List<Excuse> allExcuses = new ArrayList<>();
            List<Excuse> allExcusesFromCategory = excuseCategory.getAllExcuses();
            if (allExcusesFromCategory != null) {
                allExcuses = allExcusesFromCategory;
            }
            allExcuses.add(excuse);
            excuseCategory.setAllExcuses(allExcuses);
            excuseCategoriesRepository.save(excuseCategory);
            return excuseCategory;
        } else {
            return null;
        }
    }
}
