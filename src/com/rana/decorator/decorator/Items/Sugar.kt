package com.rana.decorator.decorator.Items

import com.rana.decorator.Beverage
import com.rana.decorator.decorator.BeverageDecorator

class Sugar(beverage: Beverage): BeverageDecorator(beverage) {

    override fun addPowder(): String {
        return super.addPowder()+" Added Sugar"
    }

    override fun priceWithPoweder(): Double {
        return super.priceWithPoweder() +1.50
    }

    override fun info(): String {
        return super.info()+"Then added sugar.\n"
    }
}