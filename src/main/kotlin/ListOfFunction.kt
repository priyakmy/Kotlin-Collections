fun main(){
    // We change it's element later
    var list = mutableListOf(2,4,7,6,8)

    println(list)

    // itrate through loop

    //method 1
    for (lists in list) {

        println("Elements through looop: $lists")
    }
    // method 2
    for (i in 0 until list.size) {
        print("${list[i]} ")
    }
    println()

    val firstNumber = list[0] // returns 2
    val lastNumber = list[list.size - 1] // returns 8

    println(firstNumber)
    println(lastNumber)
    println("Total number of elements in List is: ${list.size}")

    // Sorting in list
    println("In Descending order: ${list.sortedDescending()}")

    println("In Ascending order: ${list.sorted()}")

    // contains function
    val res = list.contains(0)

    if (res)
        println("The list contains 0")
    else
        println("The list does not contain 0")


}
