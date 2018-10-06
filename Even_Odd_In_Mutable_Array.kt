fun main(args: Array<String>) {


    print("Enter the no. of values you want to check : ")
    val n = readLine()!!.toInt()

    val arr = arrayListOf<Int>()
    for (i in n downTo 1){
        print("Enter the Value : ")
        val a = readLine()!!.toInt()
        arr.add(a)
    }

    for(i in arr){
        if((i % 2).equals(0) )
            println("$i is even")
        else
            println("$i is odd")
    }
}