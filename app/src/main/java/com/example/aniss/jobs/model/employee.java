package com.example.aniss.jobs.model;

/**
 * Created by PC on 3/17/2018.
 */
public class employee {
    String title ,companyName,date;

    public employee() {

    }

    public employee(String title, String companyName, String date) {
        this.title = title;
        this.companyName = companyName;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}