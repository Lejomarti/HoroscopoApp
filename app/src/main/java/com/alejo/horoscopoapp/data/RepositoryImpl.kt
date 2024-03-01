package com.alejo.horoscopoapp.data

import android.util.Log
import com.alejo.horoscopoapp.data.network.HoroscopeApiService
import com.alejo.horoscopoapp.data.network.response.PredictionResponse
import com.alejo.horoscopoapp.domain.Repository
import com.alejo.horoscopoapp.domain.model.PredictionModel
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("mensajito", "Ha ocurrido un error: ${it.message}") }
        return null

    }
}