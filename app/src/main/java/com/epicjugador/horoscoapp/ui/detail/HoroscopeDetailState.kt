package com.epicjugador.horoscoapp.ui.detail

import com.epicjugador.horoscoapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState {
    data object Loading:HoroscopeDetailState()
    data class Error(val error: String):HoroscopeDetailState()
    data class Success(val prediction: String, val sign:String, val horoscopeModel: HoroscopeModel):HoroscopeDetailState()
}