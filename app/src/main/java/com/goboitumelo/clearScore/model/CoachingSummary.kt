package com.goboitumelo.clearScore.model

import java.io.Serializable

data class CoachingSummary(
    val coachingSummary: Boolean,
    val activeChat: Boolean,
    val numberOfTodoItems: Int,
    val numberOfCompletedTodoItems: Int,
    val selected: Boolean
) : Serializable