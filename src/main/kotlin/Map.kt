fun main(){
    val map = mapOf(1 to "jack", 2 to "jhon", 3 to "jeepy")
    println(map)

    println("Map Keys: "+map.keys )

    println("Map Values: "+map.values )

    // Find size
    println("The size of the map is: "+map.size)
    println("The size of the map is: "+map.count())

    // Contains Key / Value
    if (map.containsKey(3)) {
        println("Yes, it contains key ")
    } else {
        println("No, it does not contain key ")
    }
    val value ="jack"
    if (map.containsValue(value)) {
        println("Yes, it contains value $value")
    } else {
        println("No, it does not contain value $value")
    }

    //MutableMap
 val student= mutableMapOf<Int,String>()
 student.put(1,"priya")
    student.put(2,"piya")
    student.put(3,"jhon")
    student.put(4,"jack")

    println(student)
    println(student.get(4))
    println(student.get(10))
}
