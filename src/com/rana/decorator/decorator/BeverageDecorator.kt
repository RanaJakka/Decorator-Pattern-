package com.rana.decorator.decorator

import com.rana.decorator.Beverage

abstract class BeverageDecorator(var beverage:Beverage):Beverage {
    override fun addPowder(): String {
        return beverage.addPowder()
    }

    override fun priceWithPoweder(): Double {
       return beverage.priceWithPoweder()
    }

    override fun info(): String {
      return beverage.info()
    }
}