package com.example.retrofit2_my_study;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("findRentalOffice")
    Call<List<Post>> getPosts();
}
