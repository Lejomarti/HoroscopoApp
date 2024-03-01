package com.alejo.horoscopoapp.domain.usecase

import com.alejo.horoscopoapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(sign: String) = repository.getPrediction(sign)

}