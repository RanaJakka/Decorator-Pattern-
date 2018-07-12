package com.rana.decorator

import com.rana.decorator.core.Tea
import com.rana.decorator.decorator.Items.Milk
import com.rana.decorator.decorator.Items.Sugar

fun main(args:Array<String>){

    var tea=Tea()
    var milk=Milk(tea)
    var sugar=Sugar(milk)


    System.out.print("The content of the tea is:"+sugar.addPowder()+"\n")
    System.out.print("The price of the tea is:"+sugar.priceWithPoweder()+"\n")
    System.out.print("The info of the tea is:"+sugar.info()+"\n")



}
