package com.trantordev.traveltripleexchange.model

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MoneyExchangeCalculatorTest{

    lateinit var calculator: MoneyExchangeCalculator

    @Before
    fun setup() {
        calculator = MoneyExchangeCalculator()
    }

    @Test
    fun testCalculateTips() {

        val baseEx = MoneyExchange(
            baseMoney = 1.0,
            moneyOne = 3.90,
            moneyTwo = 0.88,
            baseMoneyLabel = "US$",
            moneyOneLabel = "R$",
            moneyTwoLabel = "Euro")

        listOf(
            baseEx.copy(originalValue = 1.0, calculatedValueOne = 3.90, calculatedValueTwo = 0.88),
            baseEx.copy(originalValue = 100.0, calculatedValueOne = 390.00, calculatedValueTwo = 88.00),
            baseEx.copy(originalValue = 333.33, calculatedValueOne = 1299.99, calculatedValueTwo = 293.33)
        ).forEach {
            Assert.assertEquals(it, calculator.calculate(
                it.originalValue,
                it.baseMoney,
                it.moneyOne,
                it.moneyTwo,
                it.baseMoneyLabel,
                it.moneyOneLabel,
                it.moneyTwoLabel))
        }


    }


}