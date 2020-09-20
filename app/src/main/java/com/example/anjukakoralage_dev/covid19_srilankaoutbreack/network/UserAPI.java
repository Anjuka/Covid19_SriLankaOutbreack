package com.example.anjukakoralage_dev.covid19_srilankaoutbreack.network;

import com.example.anjukakoralage_dev.covid19_srilankaoutbreack.model.CovidData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserAPI {

    @GET("/api/get-current-statistical")
    Call<CovidData> getCovidData();
}
