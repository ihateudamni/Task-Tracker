package com.figueroadaniel.tasktracker

import java.text.SimpleDateFormat
import java.util.*

object FechaHelper {
    const val FORMATO_FECHA = "dd/MM/yyyy"

    fun fechaActual(): String {
        val sdf = SimpleDateFormat(FORMATO_FECHA)
        return sdf.format(Date())
    }
}
