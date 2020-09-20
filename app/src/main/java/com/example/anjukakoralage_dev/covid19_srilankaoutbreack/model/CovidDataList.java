package com.example.anjukakoralage_dev.covid19_srilankaoutbreack.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CovidDataList {

    /** "hospital_data": [
     {
     "id": 1,
     "hospital_id": 1,
     "cumulative_local": 1030,
     "cumulative_foreign": 76,
     "treatment_local": 2,
     "treatment_foreign": 0,
     "created_at": "2020-09-11 13:23:54",
     "updated_at": null,
     "deleted_at": null,
     "cumulative_total": 1106,
     "treatment_total": 2,**/

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("hospital_id")
    @Expose
    private int hospital_id;

    @SerializedName("cumulative_local")
    @Expose
    private int cumulative_local;

    @SerializedName("cumulative_foreign")
    @Expose
    private int cumulative_foreign;

    @SerializedName("treatment_local")
    @Expose
    private int treatment_local;


    public CovidDataList(int id, int hospital_id, int cumulative_local, int cumulative_foreign, int treatment_local) {
        this.id = id;
        this.hospital_id = hospital_id;
        this.cumulative_local = cumulative_local;
        this.cumulative_foreign = cumulative_foreign;
        this.treatment_local = treatment_local;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int hospital_id) {
        this.hospital_id = hospital_id;
    }

    public int getCumulative_local() {
        return cumulative_local;
    }

    public void setCumulative_local(int cumulative_local) {
        this.cumulative_local = cumulative_local;
    }

    public int getCumulative_foreign() {
        return cumulative_foreign;
    }

    public void setCumulative_foreign(int cumulative_foreign) {
        this.cumulative_foreign = cumulative_foreign;
    }

    public int getTreatment_local() {
        return treatment_local;
    }

    public void setTreatment_local(int treatment_local) {
        this.treatment_local = treatment_local;
    }
}
