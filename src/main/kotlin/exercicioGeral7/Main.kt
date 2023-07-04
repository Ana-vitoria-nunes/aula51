package exercicioGeral7

fun main() {
    println("Qual o preço do seu produto:")
    val preco = readln().toDouble()
    println("Quantos porcento de acressimo você deseja aplicar: ")
    val acressimo = readln().toDouble()
    CalcularAcressimo(preco, acressimo)

}
fun CalcularAcressimo(preco: Double, acressimo:Double) {

    val valorVenda = preco * (acressimo / 100)
    val valorFinal=valorVenda+preco
    println("O valor de venda é: R$ $valorFinal")

}






