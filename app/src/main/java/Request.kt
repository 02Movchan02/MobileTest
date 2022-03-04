package ru.movchan.myapplication

import retrofit2.Call
import retrofit2.http.*

interface Request {
    @POST("user/login")
    fun getAuth(@Body hashMap:HashMap<String,String>): Call<login>

    @GET("feelings")
    fun getFeel():Call<feelings>
    @GET("quotes")
    fun getQuotes():Call<quotes>
}