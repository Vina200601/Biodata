package com.example.biodata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("bins/1b8qfh")
    Call<List<penduduk>>getpenduduk();
}
