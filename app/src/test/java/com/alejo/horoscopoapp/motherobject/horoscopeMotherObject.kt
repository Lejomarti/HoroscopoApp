package com.alejo.horoscopoapp.motherobject

import com.alejo.horoscopoapp.data.network.response.PredictionResponse
import com.alejo.horoscopoapp.domain.model.HoroscopeInfo

object horoscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "cancer")

    val horoscopeInfoList = listOf(
        HoroscopeInfo.Aries,
        HoroscopeInfo.Taurus,
        HoroscopeInfo.Gemini,
        HoroscopeInfo.Cancer,
        HoroscopeInfo.Leo,
        HoroscopeInfo.Virgo,
        HoroscopeInfo.Libra,
        HoroscopeInfo.Scorpio,
        HoroscopeInfo.Sagittarius,
        HoroscopeInfo.Capricorn,
        HoroscopeInfo.Aquarius,
        HoroscopeInfo.Pisces)
}