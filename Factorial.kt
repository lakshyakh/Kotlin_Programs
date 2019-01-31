fun main(args: Array<String>) {
    println("Enter the number for the factorial")
    var x = readLine()!!.toInt()
    for( i in x-1 downTo 1 ){
        x = x * i
    }
    println(x)
}