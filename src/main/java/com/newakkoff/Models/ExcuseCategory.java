package com.newakkoff.Models;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by Фахош on 20.08.2016.
 */

public class ExcuseCategory {

    @Id
    private String id;

    private String categoryName;
    private String categoryDescription;
    private List<Excuse> allExcuses;

    public ExcuseCategory() {
    }

    public ExcuseCategory(String categoryName, String categoryDescription) {

        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public List<Excuse> getAllExcuses() {
        return allExcuses;
    }

    public void setAllExcuses(List<Excuse> allExcuses) {
        this.allExcuses = allExcuses;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getId() {
        return id;
    }
}
