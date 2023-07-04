package exercicio3

fun main(){
    println("Qual seu peso: ")
    val peso= readln().toDouble()
    println("Qual sua altura: ")
    val altura= readln().toDouble()
    CalculandoImc(peso, altura)
}

fun CalculandoImc(peso:Double,altura: Double){
   val imc = peso / (altura * altura);
    println("Seu imc: $imc")
    val valorFormatado = "%.2f".format(imc)
    println("Seu imc: $valorFormatado")
    when{
        imc < 18.5 -> println("Abaixo do peso")

        imc < 25 -> println("Peso normal")

        imc < 30 -> println("Sobrepeso")

        imc < 35 ->  println("Obesidade Grau I")

        imc < 40 ->  println("Obesidade Grau II (severa)")

        else ->  println("Obesidade Grau III (mórbida)")
    }
}