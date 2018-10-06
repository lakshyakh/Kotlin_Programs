fun main(args: Array<String>) {
    println("Enter First Value")
    val a = readLine()!!.toInt()
    println("Enter Second Value")
    val b = readLine()!!.toInt()
    println("Enter Third Value")
    val c = readLine()!!.toInt()
    println("Enter Fourth Value")
    val d = readLine()!!.toInt()
    val arr = listOf(a,b,c,d)
    for (i in arr){
        if ((i % 2).equals(0)){
            println("$i is even")
        }
        else{
            println("$i is odd")
        }
    }
}