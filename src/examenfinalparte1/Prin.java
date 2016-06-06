package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Secundary obj = new Secundary(10, 20);
        int n = obj.i;
        System.out.println("Es: " + n);
        
        Secundary nm = new Secundary(10);
        int m = nm.i;
        System.out.println("Es: " + m);
        
        Secundary mn = new Secundary();
        int nn = mn.i;
        System.out.println("Es: " + nn);
    }
}
