package com.aj.trendingrepositorieskotlin.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aj.trendingrepositorieskotlin.models.webmodels.Repositories
import com.aj.trendingrepositorieskotlin.webservice.ApiInterface
import com.aj.trendingrepositorieskotlin.webservice.RetroInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoriesViewModel : ViewModel() {

    var repositoriesList: MutableLiveData<List<Repositories>> = MutableLiveData()

    fun getRepositoriesListObserver(): MutableLiveData<List<Repositories>>? {
        return repositoriesList
    }


    fun makeApiCall() {
        val retroInstance = RetroInstance.getRetroClient().create(ApiInterface::class.java)
        val call = retroInstance.getRepositoriesList()
        call!!.enqueue(object : Callback<List<Repositories?>?> {
            override fun onResponse(
                call: Call<List<Repositories?>?>,
                response: Response<List<Repositories?>?>
            ) {
                if (response.isSuccessful) {
                    repositoriesList.postValue(response.body() as List<Repositories>?)
                } else {
                    repositoriesList.postValue(null)
                }
            }

            override fun onFailure(call: Call<List<Repositories?>?>, t: Throwable) {
                repositoriesList.postValue(null)
            }
        })
    }
}

