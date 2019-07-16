package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitHubService {
        @GET("/v2/everything")
        Call<DataModelCall> listRepos(@Query("q") String q,
                                        @Query("from") String from,
                                        @Query("sortBy") String sortBy,
                                        @Query("sources") String source,
                                        @Query("apiKey") String apiKey);
    }
