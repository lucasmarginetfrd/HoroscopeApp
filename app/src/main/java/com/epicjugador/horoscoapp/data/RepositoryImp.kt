package com.epicjugador.horoscoapp.data

import android.util.Log
import com.epicjugador.horoscoapp.data.network.HoroscopeApiService
import com.epicjugador.horoscoapp.domain.Repository
import com.epicjugador.horoscoapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImp @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("err", "Error ${it.message}") }

        return null
    }
}