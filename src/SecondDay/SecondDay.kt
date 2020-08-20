package SecondDay

import java.lang.NumberFormatException
import java.math.BigInteger


fun main(args:Array<String>)
{

    //Exception handling
    var str :String ="4a"
    var num:Int=0
    try{
        num=str.toInt();
    }
    catch (e: NumberFormatException)
    {
        println("Give proper input")
    }
    finally {
        println("   Closing of connections")
    }

    num++
    println(num)

    //In kotlin try is also an expression, we can return something

    var str1="4xcvb"
    var num1:Int =try {
        str1.toInt()
    }
    catch (e:NumberFormatException){
        -1
        //This means it returns  -1 if an exception is occured/
    }
    println(num1)

    //Extension Functions
    var a1=Alien()
    a1.skills="java"
    a1.show()

    var a2=Alien()
    a2.skills="kotlin"
    a2.show()

    //suppose we want an object getting created using a1 and a2 both,but
    //for that i need to make plus function in Alien,but i  dont want to touch the source code
    // then i will use extension function and create it here but it will be part of alien class

    var a3=a1.plus(a2)
    a3.show()

    //Infix function --> this is english like syntax--> for this just apply infix in front of it.
    var a4=a1 plus a2
    a4.show()

    //operator overloading
    //limited set of operator which we can use for operator overloading +,-,!,++,--,+,-,*,/,%,..
    //to make this work apply operator in front of plus function
    var a5=a1 + a2
    a5.show()

    //Recursion
    //factorial example
    //We have used biginteger class for very learge numbers
    var i=BigInteger("70")
    //for 70000 we get  stack overflow.
    println(fact(i))

    //Tail recursion
    var nummm=BigInteger("70000")
    println(facttailrec(nummm,BigInteger.ONE))





}
//This func is Extension function
//we have to write Alien. in front of plus--> cool we are done
operator infix fun Alien.plus(a:Alien):Alien
{

    var newAlien=Alien()
    //here this.skills is for a1 which is calling this method
    //and a is the a2 object
    newAlien.skills=this.skills+" "+a.skills
    return newAlien
}

fun fact(x:BigInteger):BigInteger
{
    if(x==BigInteger.ZERO)
    {
        return BigInteger.ONE
        //return BigInteger("1") Alternative
    }


    return x*fact(x- BigInteger.ONE)//5*4!->4*3!
}

tailrec fun facttailrec(x:BigInteger,result:BigInteger):BigInteger
{
    if(x==BigInteger.ZERO)
    {
        return result

    }


    return facttailrec(x- BigInteger.ONE,x*result)//5*4!->4*3!
}
