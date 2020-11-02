package tictactoe

import java.util.*

fun main() {

//   val scanner = Scanner(System.`in`)

    val array = readLine()
    if (array == null || array.length < 9) {
        return
    }
    println("---------")
    print("| ")
    val a = array.slice(0..2)
    for (i in a) {
        print("$i ")
    }
    print("|")
    println()
    print("| ")
    val b = array.slice(3..5)
    for (i in b) {
        print("$i ")
    }
    print("|")
    println()
    print("| ")
    val c = array.slice(6..8)
    for (i in c) {
        print("$i ")
    }
    print("|")
    println()
    println("---------")


}

