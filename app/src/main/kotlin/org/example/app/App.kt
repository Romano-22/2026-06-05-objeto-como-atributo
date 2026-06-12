package org.example.app

fun main() {

    val polinomio: Polinomio
    polinomio = Polinomio ()
    println(polinomio.toString())

    val cuadratica: Cuadratica
    cuadratica = Cuadratica()
    println(cuadratica.toString())

    val cuadratica2: CuadraticaMejor
    cuadratica2 = CuadraticaMejor()
    println(cuadratica2.toString())

    println(Persona("pepe", "honguito", Fecha(8,6,2026)))  

    var objeto: Polinomio
    objeto = Cuadratica()
    println(objeto)
    objeto = CuadraticaMejor()
    println(objeto)

    val lista = ArrayList <Polinomio>()
    
    lista.add(Cuadratica())
    lista.add(Polinomio())
    lista.add(CuadraticaMejor())
    
    for (var p: lista){
        println(p)
    }
    

}