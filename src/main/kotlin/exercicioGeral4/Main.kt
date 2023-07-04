package exercicioGeral4

fun main() {
    println("Quantos alunos você deseja ver a média: ")
    val quantidade= readln().toInt()

    val alunos= arrayOfNulls<String>(quantidade)
    val notas=Array(quantidade){DoubleArray(3)}

    for(i in 0 until quantidade){
        println("Digite o nome do aluno ${i + 1}:")
        alunos[i] = readLine()

        for (y in 0 until 3){
            println("Digite a nota da prova ${y + 1} para o aluno ${i + 1}:")
            notas[i][y]= readln().toDouble()
        }
    }
    for (i in 0 until quantidade) {
        val media = calcularMedia(notas[i])
        println("Aluno: ${alunos[i]}, Média: $media")
    }
}
fun calcularMedia(notas: DoubleArray): Double {
    var soma = 0.0
    for (nota in notas) {
        soma += nota
    }
    return soma / notas.size
}






