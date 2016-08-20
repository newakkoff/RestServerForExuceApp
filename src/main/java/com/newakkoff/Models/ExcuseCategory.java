package com.newakkoff.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Фахош on 20.08.2016.
 */

 public class ExcuseCategory {
    @Id
    private String id;

    private String categoryName;
    private String categoryDescription;

    public ExcuseCategory() {
    }

    public ExcuseCategory(String categoryName, String categoryDescription) {

        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
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

    @Override
    public String toString() {
        return String.format("ExcuseCategory{id=%s, categoryName='%s', categoryDescription='%s'}",
                id, categoryName, categoryDescription);
    }
}
