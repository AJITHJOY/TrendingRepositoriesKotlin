package com.aj.trendingrepositorieskotlin.webservice

import com.aj.trendingrepositorieskotlin.models.webmodels.Repositories
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("repositories")
    fun getRepositoriesList(): Call<List<Repositories?>?>?


}