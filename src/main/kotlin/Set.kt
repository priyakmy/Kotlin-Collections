fun main(){
    var evennumbers = setOf(2,4,6,8,10,20,22,22)

    for(evennumber in evennumbers){

}
    println(evennumbers)

    // Functions
    println(evennumbers.size)
    println(evennumbers.indexOf(10))


    val index1 = evennumbers.indexOf(1)
    println("The first index of number is $index1")

    val index2 = evennumbers.lastIndexOf(1)
    println("The last index of number is $index2")

    val index3 = evennumbers.last()
    println("The last index of the list is $index3")

    val index4 = evennumbers.first()
    println("The first index of the list is $index4")


    // Functions
    println("The number of element in the set is: "+evennumbers.count())
    println("The maximum element in the set is: "+evennumbers.max())
    println("The minimum element in the set is: "+evennumbers.min())
    println("The sum of the elements in the set is: "+evennumbers.sum())
    println("The average of elements in the set is: "+evennumbers.average())


        //creating an empty set of strings
        val seta = setOf<String>()
        //creating an empty set of integers
        val setb =setOf<Int>()


        //checking if set is empty or not
        println("seta.isEmpty() is ${seta.isEmpty()}")



        //checking if two sets are equal or not
        println("seta == setb is ${seta == setb}")

        println(seta)


}
