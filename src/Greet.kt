fun main(args : Array<String>){
    println("Hello Kotlin");

    var arpit=Alien();
    arpit.name="vashisht";
    println("Name of alien is: "+arpit.name);

    val kotlin =Alien();
    kotlin.name="chintu";
    println("Name of alien is: "+kotlin.name);
    //kotlin=Alien();  --> we cannot reassign final object . val act as final in kotlin


    arpit=Alien();
    println("Name of alien is: "+arpit.name);


}
