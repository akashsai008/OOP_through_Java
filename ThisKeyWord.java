import java.util.*;
class ThisKeyWord
{
    int a=10;
    ThisKeyWord()
    {
        this(10,20); //accessing constructor using this
        System.out.println(this.z(10,20)); //accessing method using this
        System.out.println(this.a); //accessing variable using this
    }
    ThisKeyWord(int x,int y)
    {
        System.out.println(x+" "+y);
    }
    int z(int x,int y)
    {
        return x+y;
    }
    public static void main(String args[])
    {
        ThisKeyWord obj=new ThisKeyWord();
    }
}