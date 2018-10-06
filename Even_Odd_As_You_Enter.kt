fun main(args: Array<String>) {

    println("Enter the no. of values you want to check : ")
    val n = readLine()!!.toInt()

    val arr = arrayListOf<Int>()
    for (i in n downTo 1){
        println("Enter the Value")
        val a = readLine()!!.toInt()
        arr.add(a)
        println("The no. is $a")
        if((a % 2).equals(0) )
            println("$a is even")
        else
            println("$a is odd")
    }
}