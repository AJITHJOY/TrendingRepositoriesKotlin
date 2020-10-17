package com.aj.trendingrepositorieskotlin.models.webmodels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Repositories {

    @SerializedName("author")
    @Expose
    private val author: String? = null

    @SerializedName("name")
    @Expose
    private val name: String? = null

    @SerializedName("avatar")
    @Expose
    private val avatar: String? = null

    @SerializedName("url")
    @Expose
    private val url: String? = null

    @SerializedName("description")
    @Expose
    private val description: String? = null

    @SerializedName("language")
    @Expose
    private val language: String? = null

    @SerializedName("languageColor")
    @Expose
    private val languageColor: String? = null

    @SerializedName("stars")
    @Expose
    private val stars: Int? = null

    @SerializedName("forks")
    @Expose
    private val forks: Int? = null

    @SerializedName("currentPeriodStars")
    @Expose
    private val currentPeriodStars: Int? = null

    @SerializedName("builtBy")
    @Expose
    private val builtBy: List<BuiltBy>? = null

}