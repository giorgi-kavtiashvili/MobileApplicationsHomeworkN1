fun main() {
    val A1=Point(x = 4, y = 6)
    val A2=Point(x = 8, y = 12)

    println(A1.toString())
    println(A1)

    println(A1==A2)
}


class Point(x:Int, y:Int) {
    var x: Int = x
    var y: Int = y

    override fun toString(): String {
        return "$x / $y"
    }

}





