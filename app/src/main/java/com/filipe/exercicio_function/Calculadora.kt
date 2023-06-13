package com.filipe.exercicio_function

class Calculadora {
}

fun main() {
    calculadora(2,10,::soma)
    calculadora(10,5,::multi)

}

fun calculadora(val1: Int, val2: Int, operacao : (Int, Int) -> Unit){
    operacao(val1,val2)
}