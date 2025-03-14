package com.example.retrofitdemo.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<User>>  // Example API call
}