fun main(args: Array<String>) {
    var x = 0
    var a = 1

    println("Enter terms you want in the series: ")
    var n = readLine()!!.toInt()
    println(x)
    println(a)
    for(i in 0..n-2){
        var sum = a+x
        println(sum)
        x = a
        a = sum
    }
}