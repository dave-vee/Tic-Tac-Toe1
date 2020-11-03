package tictactoe


import kotlin.math.abs

fun main() {
    var symbol = charArrayOf('a')
    print("Enter cells: "); symbol = readLine()!!.toCharArray()
    println()
    var nrO = 0
    var nrX = 0
    println("---------")
    println("| ${symbol[0]} ${symbol[1]} ${symbol[2]} |")
    println("| ${symbol[3]} ${symbol[4]} ${symbol[5]} |")
    println("| ${symbol[6]} ${symbol[7]} ${symbol[8]} |")
    println("---------")

    for (i in 0..symbol.lastIndex){
        if (symbol[i] == 'X') nrX++
        if (symbol[i] == 'O') nrO++
    }
    if(abs(nrX-nrO)>=2) {
        println("Impossible")
        return
    }
    // TRIPLE X AND TRIPLE O
    if (symbol[6] == symbol[7] && symbol[7]==symbol[8] && symbol[6]=='X'){
        if (symbol[0] == symbol[1] && symbol[1]==symbol[2] && symbol[0]=='O'){
            print("Impossible")
            return
        }
        if (symbol[3] == symbol[4] && symbol[4]==symbol[5] && symbol[3]=='O'){
            print("Impossible")
            return
        }
    }
    if (symbol[3] == symbol[4] && symbol[4]==symbol[5] && symbol[3]=='X'){
        if (symbol[0] == symbol[1] && symbol[1]==symbol[2] && symbol[0]=='O'){
            print("Impossible")
            return
        }
        if (symbol[6] == symbol[7] && symbol[7]==symbol[8] && symbol[6]=='O'){
            print("Impossible")
            return
        }
    }
    if (symbol[0] == symbol[1] && symbol[1]==symbol[2] && symbol[0]=='X'){
        if (symbol[3] == symbol[4] && symbol[4]==symbol[5] && symbol[3]=='O'){
            print("Impossible")
            return
        }
        if (symbol[6] == symbol[7] && symbol[7]==symbol[8] && symbol[6]=='O'){
            print("Impossible")
            return
        }
    }

    if (symbol[0] == symbol[3] && symbol[3]==symbol[6] && symbol[0]=='X'){
        if(symbol[1] == symbol[4] && symbol[4]==symbol[7] && symbol[1]=='O'){
            print("Impossible")
            return
        }
        if(symbol[2] == symbol[5] && symbol[5]==symbol[8] && symbol[2]=='O'){
            print("Impossible")
            return
        }
    }
    if (symbol[1] == symbol[4] && symbol[4]==symbol[7] && symbol[1]=='X'){
        if (symbol[0] == symbol[3] && symbol[3]==symbol[6] && symbol[0]=='O'){
            print("Impossible")
            return
        }
        if (symbol[2] == symbol[5] && symbol[5]==symbol[8] && symbol[2]=='O'){
            print("Impossible")
            return
        }
    }
    if (symbol[2] == symbol[5] && symbol[5]==symbol[8] && symbol[2]=='X'){
        if (symbol[0] == symbol[3] && symbol[3]==symbol[6] && symbol[0]=='O'){
            print("Impossible")
            return
        }
        if (symbol[1] == symbol[4] && symbol[4]==symbol[7] && symbol[1]=='O'){
            print("Impossible")
            return
        }
    }

    //X OR O WINS


    if (symbol[1] == symbol[4] && symbol[4]==symbol[7] && symbol[1]=='X'){
        print("X wins")
        return
    }
    else if(symbol[1] == symbol[4] && symbol[4]==symbol[7] && symbol[1]=='O') {
        print("O wins")
        return
    }
    if (symbol[3] == symbol[4] && symbol[4]==symbol[5] && symbol[3]=='X'){
        print("X wins")
        return
    }
    else if(symbol[3] == symbol[4] && symbol[4]==symbol[5] && symbol[3]=='O') {
        print("O wins")
        return
    }

    if (symbol[0] == symbol[3] && symbol[3]==symbol[6] && symbol[0]=='X'){
        print("X wins")
        return
    }
    else if(symbol[0] == symbol[3] && symbol[3]==symbol[6] && symbol[0]=='O') {
        print("O wins")
        return
    }

    if (symbol[0] == symbol[1] && symbol[1]==symbol[2] && symbol[0]=='X'){
        print("X wins")
        return
    }
    else if (symbol[0] == symbol[1] && symbol[1]==symbol[2] && symbol[0]=='O') {
        print("O wins")
        return
    }
    if (symbol[6] == symbol[7] && symbol[7]==symbol[8] && symbol[6]=='X'){
        print("X wins")
        return
    }
    else if (symbol[6] == symbol[7] && symbol[7]==symbol[8] && symbol[6]=='O') {
        print("O wins")
        return
    }
    if (symbol[2] == symbol[5] && symbol[5]==symbol[8] && symbol[2]=='X') {
        print("X wins")
        return
    }
    else if (symbol[2] == symbol[5] && symbol[5]==symbol[8] && symbol[2]=='O') {
        print("O wins")
        return
    }
    if (symbol[0] == symbol[4] && symbol[4]==symbol[8] && symbol[0]=='X') {
        print("X wins")
        return
    }
    else if (symbol[0] == symbol[4] && symbol[4]==symbol[8] && symbol[0]=='O') {
        print("O wins")
        return
    }
    if (symbol[6] == symbol[4] && symbol[4]==symbol[2] && symbol[0]=='X') {
        print("X wins")
        return
    }
    else if (symbol[6] == symbol[4] && symbol[4]==symbol[2] && symbol[0]=='O') {
        print("O wins")
        return
    }
    if(symbol[1]=='_'||symbol[2]=='_'||symbol[3]=='_'||symbol[4]=='_'||symbol[5]=='_'||symbol[6]=='_'||symbol[7]=='_'||symbol[8]=='_'){
        print("Game not finished")
        return
    }
    else print("Draw")


}


