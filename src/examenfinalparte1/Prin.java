package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        CallBuilder2parameters();
        
        CallBuilder1paremeter();
        
        CallBuilderLeast1();
    }

    private static void CallBuilderLeast1() {
        Secundary mn = new Secundary();
        int nn = mn.ValueToAccesBuilders;
        System.out.println("Es: " + nn);
    }

    private static void CallBuilder1paremeter() {
        Secundary nm = new Secundary(10);
        int m = nm.ValueToAccesBuilders;
        System.out.println("Es: " + m);
    }

    private static void CallBuilder2parameters() {
        Secundary obj = new Secundary(10, 20);
        int n = obj.ValueToAccesBuilders;
        System.out.println("Es: " + n);
    }
}
