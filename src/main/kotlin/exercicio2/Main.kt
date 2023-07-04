package exercicio2
fun main() {
    println("Digite seu nome: ")
    val nome= readln()
    gerarMensagemNome(nome)
}


fun gerarMensagemNome(nome: String){
    println("Meu nome é $nome")
}