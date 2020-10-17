package com.aj.trendingrepositorieskotlin.webservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroInstance {

    companion object {
        var BASE_URL = "https://private-anon-6a9567592f-githubtrendingapi.apiary-mock.com/"
        fun getRetroClient(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }


}