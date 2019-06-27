package com.edu.edunation.apiInterface;

import com.edu.edunation.models.Country;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by akashchandra on 11/23/17.
 */

public interface ApiInterface {

    @GET("all")
    Call<List<Country>> getData();

}
