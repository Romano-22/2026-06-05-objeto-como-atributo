package org.example.app

import org.example.app.Persona
import org.example.app.Fecha
import org.example.app.Polinomio

fun main() {
    val polinomio: Polinomio
    polinomio = Polinomio ()
    println(polinomio.toString())
    println(Persona("pepe", "honguito", Fecha(8,6,2026)))  
}