package com.example.anonymous.catering.network;

import com.example.anonymous.catering.response.ResponseRoute;
import com.example.anonymous.catering.Value;
import com.example.anonymous.catering.models.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    // https://maps.googleapis.com/maps/api/directions/json?origin=Cirebon,ID&destination=Jakarta,ID&api_key=YOUR_API_KEY


    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();

    @GET("view.php")
    Call<Value> view();

    @GET("json")
    Call<ResponseRoute> request_route(
            @Query("origin")String origin,
            @Query("destination") String destination,
            @Query("api_key") String api_key
    );
}
