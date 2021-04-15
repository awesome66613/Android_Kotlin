package com.example.androidwithkotlin.repository

import com.example.androidwithkotlin.model.Weather
import com.example.androidwithkotlin.model.getRussianCities
import com.example.androidwithkotlin.model.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}