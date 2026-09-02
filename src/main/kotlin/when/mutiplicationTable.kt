package `when`

var table = arrayListOf<String>()

fun mutiplicationTable(){
    for(i in 1..10){
        val row = (1..10).joinToString(" ") { j -> "| $i x $j = ${i * j} |"}
        table.add(row)
    }
    showMutiplicationTable()
}

fun showMutiplicationTable(){
    for(row in table){
        println(row)
    }
}