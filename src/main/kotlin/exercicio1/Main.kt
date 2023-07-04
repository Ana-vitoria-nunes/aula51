package exercicio1

fun main(){
    println("Digite um número: ")
    val numero = readLine()?.toIntOrNull()

    if ((numero != null) && (numero > 0)) {

       SomarNumeros(numero).somatoria()
    } else {
        println("Número inválido. Digite um número inteiro.")
    }


}
