fun main(args: Array<String>) {
    println("Hello World!")

    fun function(a: Int, b: Int) : Int {

        var x = a
        var y = b

        while (y != 0) {
            val temp = y
            y = x % y
            x = temp
        }
        return x
    }

    println("Iki sayinin en buyuk ortak boleni: ${function(2, 4)}")
}