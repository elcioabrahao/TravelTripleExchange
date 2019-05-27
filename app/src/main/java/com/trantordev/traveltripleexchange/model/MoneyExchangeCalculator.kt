package com.trantordev.traveltripleexchange.model

import java.math.RoundingMode

class MoneyExchangeCalculator {

    fun calculate(originalValue: Double, baseMoney: Double, moneyOne: Double, moneyTwo: Double,
    baseMoneyLabel: String, moneyOneLabel: String, moneyTwoLabel: String): MoneyExchange{

        val calculatedValueOne = (originalValue * moneyOne / baseMoney)
            .toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP)
            .toDouble()
        val calculatedValueTwo = (originalValue * moneyTwo / baseMoney)
            .toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP)
            .toDouble()

        return MoneyExchange(
            baseMoney=baseMoney,
            moneyOne=moneyOne,
            moneyTwo = moneyTwo,
            baseMoneyLabel = baseMoneyLabel,
            moneyOneLabel = moneyOneLabel,
            moneyTwoLabel = moneyTwoLabel,
            originalValue = originalValue,
            calculatedValueOne = calculatedValueOne,
            calculatedValueTwo = calculatedValueTwo)


    }

}