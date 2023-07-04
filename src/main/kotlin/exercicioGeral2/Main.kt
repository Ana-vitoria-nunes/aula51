package exercicioGeral2

fun main(){

    println("Digite a quantidade de números:")
    val quantidade = readln().toInt()

    val numeros = DoubleArray(quantidade)

    for (i in 0 until  quantidade) {
        println("Digite o número ${i + 1}:")
        numeros[i] = readln().toDouble()
    }
    encontrarMenorNumero(numeros)

}
fun encontrarMenorNumero(numeros: DoubleArray) {
    var menor = numeros[0]
    for (i in 1 until numeros.size) {
        if (numeros[i] < menor) {
            menor = numeros[i]
        }
    }
    println("O menor número digitado é: $menor")
}

