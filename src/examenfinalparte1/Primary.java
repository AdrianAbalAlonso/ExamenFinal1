package examenfinalparte1;

import java.io.IOException;

public class Primary {

    public static void main(String[] args) throws IOException {
        CallBuilder2parameters();
        
        CallBuilder1paremeter();
        
        CallBuilderLeast1();
    }
//introduced into method CallBuilderLeast1 the builder least 1 to parameter you enter
    private static void CallBuilderLeast1() {
        Secundary mn = new Secundary();
        int nn = mn.ValueToAccesBuilders;
        System.out.println("Es: " + nn);
    }
//introduced into method CallBuilder1parameter the builder output a paremeter you enter
    private static void CallBuilder1paremeter() {
        Secundary nm = new Secundary(10);
        int m = nm.ValueToAccesBuilders;
        System.out.println("Es: " + m);
    }
//introduced into method CallBuilder2parameter the builder sum 2 parameters you enter
    private static void CallBuilder2parameters() {
        Secundary obj = new Secundary(10, 20);
        int n = obj.ValueToAccesBuilders;
        System.out.println("Es: " + n);
    }
}
