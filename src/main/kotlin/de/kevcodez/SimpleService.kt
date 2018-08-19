package de.kevcodez

class SimpleService {

    fun simpleMethod(boolean: Boolean?): Int {
        return when {
            boolean == null -> -1
            boolean -> 1
            else -> 0
        }
    }

    fun uncoveredMethod() {
        println("foo")
    }
}

fun main(args: Array<String>) {
    val simpleService = SimpleService()

    println(simpleService.simpleMethod(true))
    simpleService.uncoveredMethod()
}