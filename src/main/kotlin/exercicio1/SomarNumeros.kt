package exercicio1

class SomarNumeros(val numero: Int) {

    fun somatoria() {
        var soma = 0.0
        for (i in 1..numero) {
            soma += i
        }
        println("A somatória de 1 até $numero é: $soma")

    }
}