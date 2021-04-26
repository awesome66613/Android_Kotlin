package com.example.androidwithkotlin.repository

import com.example.androidwithkotlin.model.Weather


interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}