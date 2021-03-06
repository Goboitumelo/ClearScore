package com.goboitumelo.clearScore.model

import java.io.Serializable

data class CreditReportInfo(
    val score: Int,
    val scoreBand: Int,
    val clientRef: String,
    val status: String,
    val maxScoreValue: Int,
    val monthsSinceLastDefaulted: Int,
    val hasEverDefaulted: Boolean,
    val monthsSinceLastDelinquent: Int,
    val hasEverBeenDelinquent: Boolean,
    val percentageCreditUsed: Int,
    val percentageCreditUsedDirectionFlag: Int,
    val changedScore: Int,
    val currentShortTermDebt: Int,
    val currentShortTermNonPromotionalDebt: Int,
    val currentShortTermCreditLimit: Int,
    val currentShortTermCreditUtilisation: Int,
    val changeInShortTermDebt: Int,
    val currentLongTermDebt: Int,
    val currentLongTermNonPromotionalDebt: Int,
    val currentLongTermCreditLimit:Int ?= null,
    val currentLongTermCreditUtilisation: Int ?= null,
    val changeInLongTermDebt : Int,
    val numPositiveScoreFactors: Int,
    val numNegativeScoreFactors: Int,
    val equifaxScoreBand: Int,
    val equifaxScoreBandDescription: String,
    val daysUntilNextReport: Int
) : Serializable