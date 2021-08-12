package com.goboitumelo.clearScore.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.goboitumelo.clearScore.model.ClearScoreResponse
import com.goboitumelo.clearScore.repository.CreditScoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreditScoreViewModel
@Inject
constructor(private val repository: CreditScoreRepository) : ViewModel() {

    private val _response = MutableLiveData<ClearScoreResponse>()
    val clearscoreResponse: LiveData<ClearScoreResponse>
        get() = _response


    init {
        getCreditScore()
    }

    private fun getCreditScore() = viewModelScope.launch {
        repository.getCreditScore().let { response ->

            if (response.isSuccessful) {
                _response.postValue(response.body())
            } else {
                Log.d("tag", "getScoreData Error: ${response.code()}")
            }
        }
    }


}













