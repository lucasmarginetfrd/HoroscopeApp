package com.epicjugador.horoscoapp.data.providers

import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Aquarius
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Aries
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Cancer
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Capricorn
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Gemini
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Leo
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Libra
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Pisces
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Sagittarius
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Scorpio
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Taurus
import com.epicjugador.horoscoapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}