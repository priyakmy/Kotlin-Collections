fun main() {
// Interegr
    var set = hashSetOf(1, 2, 3, 5, 9, 3, 2)
    println(set)

    var set2 = hashSetOf("Priya" , "singh","Piku")
    println(set2)

    // Check index value
    println(set2.size)
    println(set.contains(8))

    // add & Remove
    println(set.add(8))
    println(set.remove(2))
    println(set)

    //contain elements
    println("The set contains the element  or not?" +
            "   "+set.contains(5))

    println("The set contains the given elements or not?" +
    "   "+set2.containsAll(setOf(1,3,"priya","piku")))


    // Empty Set
    val seta = hashSetOf<String>()
    val setb =hashSetOf<Int>()


    //checking if set is empty or not
    println("seta.isEmpty() is ${seta.isEmpty()}")


    //checking if two hash sets are equal or not
    println("seta == setb is ${seta == setb}")
}
