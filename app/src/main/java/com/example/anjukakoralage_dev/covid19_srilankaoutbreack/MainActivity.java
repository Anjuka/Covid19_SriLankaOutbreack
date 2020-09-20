package com.example.anjukakoralage_dev.covid19_srilankaoutbreack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import com.example.anjukakoralage_dev.covid19_srilankaoutbreack.model.CovidData;
import com.example.anjukakoralage_dev.covid19_srilankaoutbreack.model.CovidDataList;
import com.example.anjukakoralage_dev.covid19_srilankaoutbreack.network.RestApiClient;
import com.example.anjukakoralage_dev.covid19_srilankaoutbreack.network.UserAPI;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.example.anjukakoralage_dev.covid19_srilankaoutbreack.configuration.APIConstants.BASE_URL;

public class MainActivity extends AppCompatActivity {

    private UserAPI service;
    private ArrayList<CovidDataList> covidDataLists;
    private RestApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    100);
        }

        client = new RestApiClient(BASE_URL);

        //get Covid Cases details
        getCovidData(client);
    }

    private void getCovidData(RestApiClient client) {
        service = client.buildApi();
        Call<CovidData> call = service.getCovidData();
        call.enqueue(new Callback<CovidData>() {
            @Override
            public void onResponse(Call<CovidData> call, Response<CovidData> response) {
                if (response.isSuccessful()){
                    //success
                    covidDataLists = response.body().getCovidDataLists();
                    Log.d("TAG", "onResponse: " + covidDataLists.size());
                }
            }

            @Override
            public void onFailure(Call<CovidData> call, Throwable t) {
                Log.d("TAG", "onFailure: " + t.getMessage());
            }
        });
    }
}
