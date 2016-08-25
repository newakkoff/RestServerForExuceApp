package com.newakkoff.Models;

/**
 * Created by Фахош on 25.08.2016.
 */

public class Excuse {
    private String excuseTitle;
    private String excuseContent;

    public Excuse() {
    }

    public Excuse(String excuseTitle, String excuseContent) {
        this.excuseTitle = excuseTitle;
        this.excuseContent = excuseContent;
    }

    public String getExcuseTitle() {
        return excuseTitle;
    }

    public void setExcuseTitle(String excuseTitle) {
        this.excuseTitle = excuseTitle;
    }

    public String getExcuseContent() {
        return excuseContent;
    }

    public void setExcuseContent(String excuseContent) {
        this.excuseContent = excuseContent;
    }
}
