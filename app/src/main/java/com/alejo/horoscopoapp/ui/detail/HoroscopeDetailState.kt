package com.alejo.horoscopoapp.ui.detail

sealed class HoroscopeDetailState {
    data object Loading: HoroscopeDetailState() //estado sin parametros. un data object
    data class Error(val error: String): HoroscopeDetailState() //necesita parametro. data class
    data class Success(val data:String):HoroscopeDetailState()
}

