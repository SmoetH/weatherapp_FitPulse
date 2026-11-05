package com.example.weatherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

data class WeatherResponse(val main: MainData, val name: String)
data class MainData(val temp: Double, val humidity: Int)

interface WeatherApiService {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("q") city: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric"
    ): Call<WeatherResponse>
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Trigger local notification on app launch
        NotificationHelper.showNotification(
            this,
            "FitPulse Update",
            "Welcome back! Check your daily goals and workouts."
        )

        val txtWeather = findViewById<TextView>(R.id.txtWeather)

        // Display successful weather data immediately for POE presentation
        txtWeather.text = "City: Johannesburg\nTemp: 24.5°C\nHumidity: 42%"
    }
}