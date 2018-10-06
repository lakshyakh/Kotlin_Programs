fun main(args: Array<String>) {
    val a = (Math.random()*100).toInt()
    println("The no. is $a ")
    val b = 2
    if(a % b == 0){
        println("Its even")
    }
    else{
        println("Its odd")
    }
}