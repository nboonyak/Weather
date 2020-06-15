package com.example.weatherrecycletest.model

data class ForecastResponce(
    val city: City,
    val cnt: Int,
    val cod: String,
    val list: List<Forecast>,
    val message: Int
)