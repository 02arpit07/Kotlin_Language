@file:JvmName("First")
package FirstDay;
import java.util.*;

fun main(args: Array<String>){
    var a:Int=5
    var b: Int=7
    var result=a+b
    println("The sum of ${a} and $b is $result")

    var obj=Alien();
    obj.name="Arpit";
    println("The name pf alien is ${obj.name}")

    //if else
    result=if(a>b)//We can write if condition in this way also which is if else in form of expression
    {
        a

    }
    else{
        b
    }
    println(result)

    var nullhandle:Alien?=Alien()
    nullhandle=null
    println(nullhandle?.name)

    //in java we use switch case when comparing multiple cases in switch cases we require to put break after every case
    //that does not make any sense , so here in kotlin we use when expression

    var num1: Int=8
    when(num1)
    {
        1 -> println("One")
        2 -> println("Twooo")
        3 -> println("Threeee")
        else -> println("please enter something relevant")
    }

    var num4:Int=2
   var answer:String= when(num4)
    {
        1 -> "One"
        2 -> "Twooo"
        3 -> "Threeee"
        else -> "please enter something relevant"
    }
    print("str is $answer")

    println()
    println()
    println("Looopss")

    //Range
    var nums=1..10
    for(a in nums)
    {
        print("$a ")
    }
    println()

    var nums3=10 downTo 1  // or we can write it as 10.downTo(1) , downTo is method of Int class
    for(b in nums3)
    {
        print("$b ")
    }
    println();

    var nums4=1 until 10
    for(a in nums4)
    {
        print("$a ")
    }
    println()


    var nums5=1 until 26
    for(a in nums5.reversed()) //nums5 is of type range
    {
        print("$a ")
    }
    println()

    println("Total count in the above range is"+nums5.count())

    var alphaa='A' .. 'z'
    for(a in alphaa)
    {
        print("$a ")
    }
    println()

    //List
    var nums10= listOf(1,2,3,4)
    for((i,e) in nums10.withIndex())
    {
        println("$i:$e")
    }

    //Map
    var mappp=TreeMap<String,Int>()
    mappp["Arpit"]=20
    mappp["RAM"]=1000
    for((name,age)in mappp)
    {
        println("$name : $age")
    }

    //Function expression
    add(4,5)
    println(add1(10,11))
    println(add3(100,100))
    println("MAX NUMBER IS "+max(100,200))


    var finalAmt= calculateAmount(50)
    println(finalAmt)

    //String to integer

    var str: String="4"
     var num:Int=str.toInt()
    num++;
    println(" iNT TO String is "+num)
}
fun add(a:Int,b:Int)
{
    println(a+b)
}

fun add1(a:Int,b:Int): Int
{
    return a+b
}

fun add3(a:Int,b:Int):Int=a+b

fun max(a:Int,b:Int):Int=if(a>b) a else b

@JvmOverloads //This will create two methods and now we can have option to send one paramater from java runner class
fun calculateAmount(amt:Int,interest:Double=0.04):Int{
    return (amt+amt*interest).toInt();//after multiple it converts to double
}
