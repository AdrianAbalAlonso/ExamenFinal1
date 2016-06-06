package examenfinalparte1;

public class Secundary {
//the variable must be private type to protect the code
    public int ValueToAccesBuilders;
    /**
     * builder with parameters , you need get in main class  values to value1 and value2.
     * @param value1 int type
     * @param value2 int type
     */
    public Secundary(int value1, int value2) {
        ValueToAccesBuilders = sum(value1, value2);
    }
/**
 * builder with a once parameter,its illogical call the sum method in this builder , because you only enter once parameter.
 * @param value1 
 */
    public Secundary(int value1) {
        ValueToAccesBuilders = sum(value1, value1);
    }
/**
 * Este metodo lo voy a explicar en español mejor , cuando tu no metes nada por parametro , y este constructor resta 1 , dara -1 , como da en la salida
 */
    public Secundary() {
        ValueToAccesBuilders = -1;
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
