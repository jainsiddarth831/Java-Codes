import java.util.ArrayList;

public class Genric_basic
{
        public static void main(String[]args)
        {
            ArrayList<Integer> array = new ArrayList();
            array.add(23);
            array.add(12);
            array.add(1);

            int a = array.get(2);
            System.out.println(a);
        }
}
