package com.filipe.exercicio_function

class ListaString {
}

fun main(){
    var nomes = listOf("Ana","Marina","Perola","Alice").map {
        ("Olá $it")
    }.forEach{
        println(it)
    }



}