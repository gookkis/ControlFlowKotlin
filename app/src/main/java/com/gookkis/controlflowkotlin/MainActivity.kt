package com.gookkis.controlflowkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var tipeBool: Boolean = false

    var intA: Int = 15
    var intB: Int = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Control Flow IF
        tipeBool = intA > intB
        if (tipeBool) {
            println("Nilai A ${intA.toString()} > Nilai B ${intB.toString()}")
        } else {
            println("Nilai B yang lebih besar.")
        }

        //Control Flow when
        var x = 1

        when (x) {
            1 -> println("x == 1")
            2 -> println("x == 2")
            else -> { // Note the block
                println("x is neither 1 nor 2")
            }
        }

        when (x) {
            in 1..10 -> println("x antara 1 - 10")
            in 10..20 -> println("x antara 10 - 20")
            else -> println("none of the above")
        }

        var arrayAngka = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var arrayString = arrayOf("satu", "dua", "tiga")

        println("Jumlah elemen dalam arrayString adalah ${arrayString.size}")

        for (item in arrayAngka) {
            if (item % 2 != 0)
                println(item.toString())
        }

        for (item in arrayString) {
            println(item)
        }

        var y = 10

        while (y >= 0) {
            println("nilai y adalah $y")
            y--
        }

        do {
            println("nilai x adalah $x")
            x++
        } while (x < 5)


    }
}
