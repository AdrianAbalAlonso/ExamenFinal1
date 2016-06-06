package examenfinalparte1;

public class Secundary {
//the variable must be private type to protect the code
    public int i;
    /**
     * builder with parameters , you need get in main class  values to value1 and value2.
     * @param value1 int type
     * @param value2 int type
     */
    public Secundary(int value1, int value2) {
        i = sum(value1, value2);
    }

    public Secundary(int value1) {
        i = sum(value1, value1);
    }

    public Secundary() {
        i = -1;
    }
/**
 * Method to sum the values 
 * @param valueToSum1
 * @param valueToSum2
 * @return the sum to valueToSum1 and valueToSum2
 */
    public int sum(int valueToSum1, int valueToSum2) {
        return valueToSum1 + valueToSum2;
    }
}
