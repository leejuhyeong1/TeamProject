package com.example.accountkotlin

abstract class Account(accountNumber:String,balance:Int = 0){
    val accountNumber =accountNumber
    var balance = balance
        protected set(newBalance){
            println("${balance}->${newBalance}")
            field= newBalance
        }
    override fun toString():String{
        return "${accountNumber}  : ${balance}"
    }
    abstract fun aMonthHasPassed()
}