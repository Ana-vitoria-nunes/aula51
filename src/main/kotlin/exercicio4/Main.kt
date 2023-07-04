package exercicio4

fun main(){
    println("Digite a base do retângulo:")
    val base = readln().toDouble()
    println("Digite a altura do retângulo:")
    val altura = readln().toDouble()

   calcularAreaRetangulo(base, altura)
}

fun calcularAreaRetangulo(base: Double, altura: Double) {
    val area= base * altura
    println("A área do retângulo é: $area")

}

