package com.alejo.horoscopoapp.data.network.response

import com.alejo.horoscopoapp.BuildConfig.BASE_URL
import com.alejo.horoscopoapp.data.RepositoryImpl
import com.alejo.horoscopoapp.data.core.interceptors.AuthInterceptor
import com.alejo.horoscopoapp.data.network.HoroscopeApiService
import com.alejo.horoscopoapp.domain.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient:OkHttpClient): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(authInterceptor: AuthInterceptor):OkHttpClient{

        val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient
            .Builder()
            .addInterceptor(interceptor)
            .addInterceptor(authInterceptor)
            .build()
    }

    @Provides
    fun provideHoroscopeApiService(retrofit: Retrofit):HoroscopeApiService{
        return retrofit.create(HoroscopeApiService::class.java)
    }

    //cuando se llame este rep. se va a devolver un apoService.
    //el apiServices del tipo horoscopeApiservice lo recibimos del provide a arriba
    @Provides
    fun provideRepository(apiService:HoroscopeApiService):Repository{
        return RepositoryImpl(apiService)
    }

}