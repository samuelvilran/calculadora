package com.example.hola_mundo

import java.math.RoundingMode
import java.util.Date
import kotlin.math.sqrt


enum class Operations(var simbolo: String) {
    ADD("+" ),
    SUB("-"),
    TIMES("*"),
    DIV("/"),
    SQRT("\u221a");
}



data class Operation(
    var operator: String, var cant1: Double, var cant2: Double, var resp: Double) {

    var dispositivo: String? = "Android"
    var timestamp: String? = Date().toString()
    fun calcular() : Double {
        var res = 0.0
        when (operator) {

            Operations.ADD.toString() -> res = cant1 + cant2
            Operations.SUB.toString() -> res = cant1 - cant2
            Operations.TIMES.toString()-> res = cant1 * cant2
            Operations.DIV.toString() -> res = (cant1 / cant2).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
            Operations.SQRT.toString() -> res = sqrt(cant1).toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
        }
        resp = res
        return res
    }

}

