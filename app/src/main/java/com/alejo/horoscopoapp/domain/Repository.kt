package com.alejo.horoscopoapp.domain

import com.alejo.horoscopoapp.data.network.response.PredictionResponse
import com.alejo.horoscopoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String): PredictionModel?
}