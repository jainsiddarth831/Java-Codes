public class polymorphism
{
    public void car()
    {
        System.out.println("This is a car");
    }
}
// we make new class micra which inherits the property of this class
public class micra extends polymorphism {
    public void car() {
        System.out.println("This is Micra car");
    }

}
// we make another new class baleno which do the same thing
public class baleno extends polymorphism
{
    public void car()
    {
        System.out.println("This is Baleno car");
    }
}
// now we make the main class
public class main
{
    public static void main(String[]args)
    {
        polymorphism car = new polymorphism();
        polymorphism micra = new micra();
        polymorphism baleno = new baleno();
        car.car();
        micra.car();
        baleno.car();
    }
}
