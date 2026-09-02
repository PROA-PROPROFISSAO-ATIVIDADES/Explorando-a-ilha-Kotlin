package `when`

fun grade(x: Int): String{
    return when {
        x in 1..4 -> "Reprovado"
        x == 5 -> "Recuperação"
        x in 6..10 -> "Aprovado"
        else -> "Nota invalida"
    }
}