package com.aj.trendingrepositorieskotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.aj.trendingrepositorieskotlin.models.webmodels.Repositories
import com.aj.trendingrepositorieskotlin.viewmodels.RepositoriesViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel = ViewModelProviders.of(this).get(RepositoriesViewModel::class.java)

        viewModel.getRepositoriesListObserver()
            ?.observe(this, object : Observer<List<Repositories?>?> {
                override fun onChanged(t: List<Repositories?>?) {
                    if (t != null) {
                        Toast.makeText(applicationContext, "Success" + t.size, Toast.LENGTH_SHORT)
                            .show()
                    } else {
                        Toast.makeText(applicationContext, "error", Toast.LENGTH_SHORT).show()
                    }
                }

            })

        viewModel.makeApiCall()


    }

}