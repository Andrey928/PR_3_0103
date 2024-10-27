import kotlin.math.*
fun main() {
    //1.
    val myAge = 20
    val isTeenager = myAge in 13..19
    //2.
    val theirAge = 30
    val bothTeenagers = isTeenager && (theirAge in 13..19)
    //3.
    val reader = "Ваше Имя" // Замените на ваше имя
    val author = "Richard Lucas"
    val authorIsReader = reader == author
    //4.
    val readerBeforeAuthor = reader < author
    //5.
    val myAge2 = 20
    if (myAge2 in 13..19) {
        println("Подросток")
    } else {
        println("Не подросток")
    }
    //6.
    val answer = if (myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)
    //7.
    var counter = 0
    while (counter < 10) {
        println("counter равен $counter")
        counter++
    }
    //8.

    var roll: Int
    do {
        roll = (0..5).random()
        counter++
    } while (roll !=5)
    println("После $counter бросков, roll равен $roll")
    //9.
    val range = 1..10
    for (i in range) {
        println(i * i)
    }
    //10.
    for (i in range) {
        println(Math.sqrt(i.toDouble()))
    }


}