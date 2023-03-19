package com.example.class3demo2.model;

import com.google.gson.annotations.SerializedName;

public class WeatherSearchResult {
    @SerializedName("current_weather")
    WeatherDetails currentWeather;

    public WeatherDetails getCurrentWeather() {
        return currentWeather;
    }

    public void setCurrentWeather(WeatherDetails currentWeather) {
        this.currentWeather = currentWeather;
    }
}
