package com.alejo.horoscopoapp.ui.horoscope


import com.alejo.horoscopoapp.data.providers.HoroscopeProvider
import com.alejo.horoscopoapp.motherobject.horoscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    @MockK (relaxed = true)
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel

    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewModel is created the horoscopes are loaded`(){
        //Given
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        //When
        val horoscopes = viewModel.horoscope.value

        //Then
        assertTrue(horoscopes.isNotEmpty())

    }


}