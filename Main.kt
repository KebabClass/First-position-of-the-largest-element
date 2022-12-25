fun main() {

    var largestNum = Int.MIN_VALUE
    var position = 0
    var index = 0


    var line = readLine()
    while (line != null) {
        val number = line.toInt()

        if (number > largestNum) {
            largestNum = number
            position = index + 1
        }

        line = readLine()
        index++
    }

    println("$largestNum $position")
}
