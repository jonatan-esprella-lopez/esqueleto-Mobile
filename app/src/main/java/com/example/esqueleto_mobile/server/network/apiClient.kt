package com.example.esqueleto_mobile.server.network

import com.example.modulo2kotlin.data.model.RickAndMortyResponse
import retrofit2.Response
import retrofit2.http.GET

interface apiClient {
    @GET("character")
    suspend fun getAllCharacters(): Response<RickAndMortyResponse>
}