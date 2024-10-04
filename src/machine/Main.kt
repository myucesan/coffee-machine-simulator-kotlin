package machine
const val WATER = 200
const val MILK = 50
const val BEANS = 15

fun main() {
    val noOfCofee = readln().toInt()
    println("For $noOfCofee cups of coffee you will need:")
    println("${noOfCofee * WATER} ml of water")
    println("${noOfCofee * MILK} ml of milk")
    println("${noOfCofee * BEANS} ml of beans")
}
