package exercicioGeral3

fun main(){
    println("Digite o nome do vendedor:")
    val nome = readln()
    println("Digite o salário fixo do vendedor:")
    val salarioFixo = readln().toDouble()
    println("Digite o total de vendas efetuadas pelo vendedor:")
    val totalVendas = readln().toDouble()
    CalcularComissao(nome,salarioFixo,totalVendas)

}

fun CalcularComissao(nome: String, salario: Double,vendas: Double){
    val comissao=vendas*0.15
    val salarioFinal=salario+comissao

    println("$nome seu salario final com a comissão é de R$ $salarioFinal")

}





