package com.example.weatherrecycletest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_weather_forecast.view.*

class WeatherAdapter : RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    private val dataset = mutableListOf<WeatherForecastData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_weather_forecast, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset.get(position)
        holder.itemView.apply {
            city_name.text = item.city
            temperature.text = item.temperature.toString()
        }
    }

    fun updateDataset(newData: List<WeatherForecastData>) {
        dataset.clear()
        dataset.addAll(newData)
        notifyDataSetChanged()
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v)

}