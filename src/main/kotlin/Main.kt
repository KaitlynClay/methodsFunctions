fun main(args: Array<String>) {

    println("Enter the number of the shape you would like to find the area of.")
    println("1. Triangle")
    println("2. Circle")
    println("3. Rectangle")
    println("4. Trapezoid")
    println("5. Quit")
    print("Your choice: ")
    var userInput = readln()!!.toInt()

    if (userInput == 1) {                            //triangle
        print("What is the height of the triangle: ")
        var h = readln()!!.toDouble()
        print("What is the width of the base of the triangle: ")
        var b = readln()!!.toDouble()
        var result: Double
        result = areaTriangle(h, b)
        println("Area = $result")
    }
    else if (userInput == 2) {                         //circle
        print("What is the radius of the circle: ")
        var r = readln()!!.toDouble()
        var result: Double
        result = areaCircle(r)
        println("Area = $result")
    } else if (userInput == 3) {                          //rectangle
        print("What is the width of the rectangle: ")
        var w = readln()!!.toDouble()
        print("What is the height of the rectangle: ")
        var h = readln()!!.toDouble()
        var result: Double
        result = areaRectangle(h, w)
        println("Area = $result")
    } else if (userInput == 4) {
        print("What is the length of the top of the trapezoid: ")
        var a = readln()!!.toDouble()
        print("What is the length of the bottom of the trapezoid: ")
        var b = readln()!!.toDouble()
        print("What is the height of the trapezoid: ")
        var h = readln()!!.toDouble()
        var result: Double
        result = areaTrapezoid(h, a, b)
        println("Area = $result")
    } else if (userInput == 5) {
        print("Have a nice day!")
    } else
        print("Please go back and choose one of the options.")


}


fun areaTriangle(
    h: Double = 0.0,
    b: Double = 0.0)
: Double{
    val ans = (b * h) / 2
    return ans
    return (b * h) / 2

}

fun areaCircle(
    r: Double = 0.0)
: Double{
    val ans = 3.14 * (r * r)
    return ans
    return 3.14 * (r * r)
}

fun areaRectangle(
    w: Double = 0.0,
    h: Double = 0.0)
: Double{
    val ans: Double = w * h
    return ans
    return w * h
}

fun areaTrapezoid(
    h: Double = 0.0,
    a: Double = 0.0,
    b: Double = 0.0)
: Double{
    val ans: Double = (a+b)/2 * h
    return ans
    return ((a+b)/2) * h
}