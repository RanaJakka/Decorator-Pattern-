package com.rana.decorator.core

import com.rana.decorator.Beverage

class Coffee:Beverage {

    override fun addPowder(): String {
        return "AddCoffee Powder"
    }

    override fun priceWithPoweder(): Double {
        return 10.00
    }

    override fun info(): String {
        return "Added Coffee powder which is $10 cost. \n"
    }
}