package skladanie_lancuchow;

import java.io.*;
public class NewClass {

    public static void main(String[] args)
        throws IOException
    {
        String a, b; //a i b to lancuchy

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("System sklada 2 lancuchy.");

        System.out.println("\npodaj pierwszy lancuch: ");
        a = br.readLine();

        System.out.println("podaj drugi lancuch: ");
        b = br.readLine();

        System.out.println(a + " + " + b + " = " + a.concat(b));
        System.out.println(b + " + " + a + " = " + b.concat(a));

        if (a.equals(b))
            System.out.println("\nskladanie dwoch ROWNYCH lancuchow jest przemienne.");
        else
            System.out.println("\nskladanie dwoch ROZNYCH lancuchow nie jest przemienne.");
    }
}

