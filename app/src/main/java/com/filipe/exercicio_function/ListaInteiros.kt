package com.filipe.exercicio_function

class ListaInteiros {
}

fun main() {
    val n = 99
    val numbers = MutableList(n) { 0 }

    for (i in numbers.indices) {
        numbers[i] = i + 1
    }
    val numerosPares= numbers.filter{it %2 == 0}.forEach {
        println(it)
    }

}