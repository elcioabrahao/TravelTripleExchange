package com.trantordev.traveltripleexchange.model

data class MoneyExchange(
    val baseMoney: Double = 0.0,
    val moneyOne: Double = 0.0,
    val moneyTwo: Double = 0.0,
    val baseMoneyLabel: String="",
    val moneyOneLabel: String="",
    val moneyTwoLabel: String="",
    val originalValue: Double = 0.0,
    val calculatedValueOne: Double = 0.0,
    val calculatedValueTwo: Double = 0.0
)