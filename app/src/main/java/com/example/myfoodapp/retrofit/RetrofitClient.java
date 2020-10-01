package com.example.myfoodapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//Retrofit is type-safe REST client for Android and Java
// which aims to make it easier to consume RESTful web services.

public class RetrofitClient {
    private static Retrofit retrofit;
    private static String BASE_URL = "http://androidappsforyoutube.s3.ap-south-1.amazonaws.com/foodapp/";

    public static Retrofit getRetrofitInstance(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
