package com.rana.decorator.core

import com.rana.decorator.Beverage

class Tea:Beverage {
    override fun addPowder(): String {

        return "Add Tea Powder"
    }

    override fun priceWithPoweder(): Double {
        return 5.00
    }

    override fun info(): String {
        return "Added Tea Powder with Cost of 5 Bugs. \n"
    }
}