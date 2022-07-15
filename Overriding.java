class A
{
    public int a;
    public int siddharth()
    {
        return 4;
    }

    public void method1()
    {
        System.out.println("Method 1 of class A");
    }
}
class B extends A
{
    @Override
    public void method1()
    {
        System.out.println("Method 1 of class B");
    }

    public void method2()
    {
        System.out.println("Method 2 of class B");
    }
}
public class Overriding
{
    public static void main(String[]args)
    {
        A b = new A();
        b.method1();
    }

}
