import java.util.ArrayList;
import java.util.List;

public class LambdaFunctions {

    public static void main(String args[]) {

        final List<String> employees = new ArrayList();
        employees.add("Baljit");
        employees.add("Tejvir");
        employees.add("GHanendra");


        Printer p = s -> System.out.println(s+"");
        p.print("Hello World");
        p.print("to my world");


        Add add = (a, b) -> (a + b);
        p.print(add.add(10, 20));
        p.print(add.add(100, 200));

        StringLengthUtil stringLengthUtil= s->s.length();
        p.print(stringLengthUtil.getLength(employees.get(0)));


        Runnable r= ()-> {
            for(int u=0;u<10;u++)
            {
                p.print("Lambda Run Method" +" "+ u );
            }
        };

        Thread thread = new Thread(r);
        thread.start();
        for(int u=0;u<10;u++)
        {
            p.print("Main Method" +" "+ u );
        }




    }
}
