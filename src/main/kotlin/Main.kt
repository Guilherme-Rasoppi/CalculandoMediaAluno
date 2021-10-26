fun main(args: Array<String>) {

    print("Digite o nome do aluno: ")
    var nome = readLine()!!.toString()

    print("Digite a nota do aluno no 1° Bimestre: ")
    var nota1 = readLine()!!.toDouble()

    print("Digite a nota do aluno no 2° Bimestre: ")
    var nota2 = readLine()!!.toDouble()

    print("Digite a nota do aluno no 3° Bimestre: ")
    var nota3 = readLine()!!.toDouble()

    print("Digite a nota do aluno no 4° Bimestre: ")
    var nota4 = readLine()!!.toDouble()

    var totalNotas = nota1 + nota2 + nota3 + nota4
    var media = totalNotas/4

    if (media < 4){
        println("Reprovado")
    }else if (media >= 4 && media <= 5){
        println("Regular")
    }else if (media > 5 && media <= 8){
        println("Boa média")
    }else if(media > 8 && media <= 10){
        println("Excelente")
    }else{
        println("Média inválida")
    }

    println("\n O aluno $nome, teve a média dos Bimestres: " +
            "$media")


}