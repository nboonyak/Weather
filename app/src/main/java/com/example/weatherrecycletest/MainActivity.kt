package com.example.weatherrecycletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val weatherAdapter = WeatherAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        initUi()

    }

    private fun initUi() {
        val list = mutableListOf<WeatherForecastData>()
        for (i in 0..20) {
            list.add(WeatherForecastData(i, "Poltava"))
        }

        weather_recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        weather_recycler_view.adapter = weatherAdapter
        weatherAdapter.updateDataset(list)

    }
}