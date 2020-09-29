package com.example.hotelmanagementapp.retrofit

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST;
import java.util.*

interface INodeJS {
    @POST("register")
    @FormUrlEncoded
    fun registerUser(@Field("username") username: String,
                     @Field("password") password:String,
                     @Field("role") role: String,
                     @Field("fullname") fullname: String
    )

    @POST("login")
    @FormUrlEncoded
    fun loginUser(@Field("username") username: String,
                  @Field("password") password:String)
}