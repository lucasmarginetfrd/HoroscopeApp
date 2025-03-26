package com.epicjugador.horoscoapp.domain.usecase

import com.epicjugador.horoscoapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)
}