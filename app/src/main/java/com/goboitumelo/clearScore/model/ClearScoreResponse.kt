package com.goboitumelo.clearScore.model

import java.io.Serializable

data class ClearScoreResponse(
    val accountIDVStatus: String,
    val creditReportInfo: CreditReportInfo,
    val dashboardStatus: String,
    val personaType: String,
    val coachingSummary: CoachingSummary,
    val augmentedCreditScore: String ?=null
) : Serializable