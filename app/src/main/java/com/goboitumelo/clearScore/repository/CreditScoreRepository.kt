package com.goboitumelo.clearScore.repository

import com.goboitumelo.clearScore.api.ApiService
import javax.inject.Inject

class CreditScoreRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getCreditScore() = apiService.getCreditScore()
}
