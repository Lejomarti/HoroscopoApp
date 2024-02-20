package com.alejo.horoscopoapp.domain.model

import com.alejo.horoscopoapp.R

sealed class HoroscopeInfo(val name:Int, val img:Int) {
    object Aries:HoroscopeInfo(R.drawable.aries,R.string.aries)
    object Taurus:HoroscopeInfo(R.drawable.tauro,R.string.taurus)
    object Gemini:HoroscopeInfo(R.drawable.geminis,R.string.gemini)
    object Cancer:HoroscopeInfo(R.drawable.cancer,R.string.cancer)
    object Leo:HoroscopeInfo(R.drawable.leo,R.string.leo)
    object Virgo:HoroscopeInfo(R.drawable.virgo,R.string.virgo)
    object Libra:HoroscopeInfo(R.drawable.libra,R.string.libra)
    object Scorpio:HoroscopeInfo(R.drawable.escorpio,R.string.scorpio)
    object Sagittaurus:HoroscopeInfo(R.drawable.sagitario,R.string.sagittarius)
    object Capricorn:HoroscopeInfo(R.drawable.capricornio,R.string.capricorn)
    object Aquarius:HoroscopeInfo(R.drawable.aquario,R.string.aquarius)
    object Pisces:HoroscopeInfo(R.drawable.piscis,R.string.pisces)
}

