package SecondDayPart2

fun main(args: Array<String>)
{
    //Primary Constructor

    var a=Human("Arpit")
    a.think()
}

class Human constructor(var naam:String="User")//give default value if we dont pass anything this would come
{
    var name: String= naam
    fun think()
    {
        println("Kotlin is Amazinggggg $name")
    }
}
/*
Also a valid way if we dont have any access specifier like public private
class Human (var naam:String)
{
    var name: String= naam
    fun think()
    {
        println("Kotlin is Amazinggggg $name")
    }
}
 */
