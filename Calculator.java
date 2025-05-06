public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        System.out.println(add(12,7));;
        System.out.println(subtract(15,5));
        System.out.println(multiply(5,6));
        System.out.println(divide(35,7));
    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */
    public static double add(double number1, double number2) {
        double sum = number1 + number2;
        return sum;
    }
    

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */
   public static double subtract (double number1, double number2) {
        double subtraction = number1 - number2;
        return subtraction;
    }
    

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */
    public static double multiply (double number1, double number2) {
        double multiply = number1 * number2;
        return multiply;
    }
    

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */
    public static double divide (double number1, double number2) {
        double divide = number1 / number2;
        return divide;
    }
    

}
