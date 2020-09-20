package com.example.anjukakoralage_dev.covid19_srilankaoutbreack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CovidData {

    @SerializedName("hospital_data")
    @Expose
    private ArrayList<CovidDataList> covidDataLists;

    @SerializedName("success")
    @Expose
    private Boolean success;

    @SerializedName("message")
    @Expose
    private String message;

    public CovidData(ArrayList<CovidDataList> covidDataLists, Boolean success, String message) {
        this.covidDataLists = covidDataLists;
        this.success = success;
        this.message = message;
    }

    public ArrayList<CovidDataList> getCovidDataLists() {
        return covidDataLists;
    }

    public void setCovidDataLists(ArrayList<CovidDataList> covidDataLists) {
        this.covidDataLists = covidDataLists;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

