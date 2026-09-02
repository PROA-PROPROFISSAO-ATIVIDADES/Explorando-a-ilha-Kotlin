package `when`

val items = arrayListOf<String>("Inicio", "Meio", "Fim", "Recomeço");

fun mostrarMenu(list: ArrayList<String>){
    for((index, value) in items.withIndex()){
        println("${index + 1}. $value")
    }
}

fun menu(){
    mostrarMenu(items)
    println("Digite um valor entre: 1 a ${items.size}")
    val escolha = readln().toInt()

    when(escolha){
        in 1..(items.size) -> println("Opção selecionada ${items[escolha - 1]}")
        else -> println("Opção Invalida")
    }
}