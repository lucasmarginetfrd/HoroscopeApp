package com.epicjugador.horoscoapp.domain

import com.epicjugador.horoscoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?
}