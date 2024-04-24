package org.example

fun main() {
    //1
    println("\n---------------------Punto 1----------------------\n")
    println("Ingresa un numero")
    val numeroFibonacci = readln().toInt()
    println("Equivalente en la secuencia fibonacci es: ${fibonacci(numeroFibonacci)}")


    println("\n---------------------Punto 2----------------------\n")
    println("Ingrese los grados Celsius para convertir a farenheit")
    val gradosCelsius = readln().toDouble()
    println("Grados Farenheit: ${ConversionTemperatura.celsiusToFarenheit(gradosCelsius)}")

    println("Ingrese los grados farenheit  para convertir a Celsius")
    val gradosFarenheit = readln().toDouble()
    println("Grados Celsius: ${ConversionTemperatura.farenheitToCelsius(gradosFarenheit)}")


    println("\n---------------------Punto 3----------------------\n")
//Falto el punto 3 :(

}


fun fibonacci(n: Int): Int {
    var num1 = 0
    var num2 = 1
    var aux = 0
    for (i in 1..<n) {
        num1 = num2
        num2 = aux
        aux = num1 + num2
    }
    return aux
}

//fun ordenarLista(lista: Array<Int>) {
//    var aux: Int = 0
//
//    for (i in 0..<lista.size) {
//        aux = 0
//        if (lista[i] > lista[i + 1]) {
//            aux = lista[i + 1]
//            lista[i + 1] = lista[i]
//            lista[i] = aux
//        }
//        println(lista[i])
//    }
//}