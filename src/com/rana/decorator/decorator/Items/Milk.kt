package com.rana.decorator.decorator.Items

import com.rana.decorator.Beverage
import com.rana.decorator.decorator.BeverageDecorator

class Milk(beverage: Beverage) : BeverageDecorator(beverage) {
    override fun addPowder(): String {
        return super.addPowder()+" Added Milk"
    }

    override fun priceWithPoweder(): Double {
        return super.priceWithPoweder()+2.50
    }

    override fun info(): String {
        return super.info()+"Then added boiled milk to it.\n"
    }
}