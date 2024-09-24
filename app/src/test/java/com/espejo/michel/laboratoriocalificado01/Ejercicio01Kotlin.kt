package com.espejo.michel.laboratoriocalificado01

class Ejercicio01Kotlin {
    // Método para contar la frecuencia de caracteres en una palabra
    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        // Crear un mapa mutable para almacenar la frecuencia de cada carácter
        val frecuencia = mutableMapOf<Char, Int>()

        // Iterar sobre cada carácter en la palabra
        for (caracter in palabra) {
            // Verificar si el carácter ya está en el mapa
            if (frecuencia.containsKey(caracter)) {
                // Incrementar el conteo del carácter
                frecuencia[caracter] = frecuencia[caracter]!! + 1
            } else {
                // Agregar el carácter al mapa con un conteo inicial de 1
                frecuencia[caracter] = 1
            }
        }

        // Devolver el mapa con la frecuencia de cada carácter
        return frecuencia
    }
}

// Ejemplo de uso
fun main() {
    val ejercicio = Ejercicio01Kotlin()
    val resultado = ejercicio.contarFrecuencia("hello")
    println(resultado) // Salida esperada: {h=1, e=1, l=2, o=1}
}