package FirstDay;

public class Runner {
    //Here we will call function of kotlin FirstCode.kt from this java class
    //Even if we dont have any class over there, our file name will be used as Class name

    public  static void main(String[] args)
    {
        int result=First.add1(5,8);
        System.out.println(result);
        System.out.print(First.calculateAmount(50));
    }
}
