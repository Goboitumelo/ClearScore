package com.goboitumelo.clearScore.api

import com.goboitumelo.clearScore.model.ClearScoreResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("endpoint.json")
    suspend fun getCreditScore(): Response<ClearScoreResponse>

}