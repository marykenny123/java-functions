import java.sql.SQLOutput;
import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {


        /* 
        Reglas del juego:
        - El usuario debe escoger 3 números entre 1 y 6 (incluidos).
        - El usuario debe lanzar los dados una vez, el resultado serán 3 números aleatorios.

        ¿Cuándo gana el usuario?:
        - Cuando la suma de los números escogidos es mayor a la suma de los dados lanzados
        - Y cuando la diferencia entre los dos números anteriores es menor de 5

        ej. 
        - Usuario escoge los números: 1 3 5 (la suma es 9)
        - Usuario lanza dados y salen los números: 3 1 3 (la suma es 7)
        - 9 es mayor a 7 y la diferencia entre los dos números es menor a 5. El usuario gana.

        Requisitos no funcionales (atributos de calidad):
        - Definir las 4 funciones descritas abajo.
        - En el método main escribir el programa (usar condicionales, reusar las funciones creadas, pedir al usuario que
                   ingrese datos y recogerlos).
      
        Pasos:
        - Pedir al usuario que escoja 3 números.
        - Si el usuario escoge un número fuera del rango, salir del programa (mira en los recursos system exit).
        - Si los números son correctos, pedir al usuario si desea lanzar dados.
        - Si el usuario dice que no, salir del programa.
        - Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        - Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        - Imprimir si el usuario ganó o perdió.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("You should choose numbers between 1 and 6.");
        System.out.print("Pls enter 1st number and press enter:\t");
        byte num1 = scanner.nextByte();

        System.out.print("Pls enter 2nd number and press enter:\t");
        byte num2 = scanner.nextByte();

        //System.exit(-1);

        System.out.print("Pls enter 3rd number and press enter:\t");
        byte num3 = scanner.nextByte();

        if (isLessThanOne(num1, num2, num3) == true) {
            System.exit(-1);
        } else if (isHigherThanSix(num1, num2, num3) == true) {
            System.exit(-1);
        }


        scanner.nextLine();
        System.out.println("Do you want to throw the dice? yes or no");
        String reply = scanner.nextLine();
        if (!(reply.equals("yes"))) {              //|| (reply.equals("no")))) {
            System.exit(-1);
        } else {
            System.out.println(rollDice());
        }


    }


    /**
     * Function name: isLessThanOne
     *
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * <p>
     * Inside the function:
     * 1. check if numbers are less than 1
     */
    public static boolean isLessThanOne(int num1, int num2, int num3) {
        if ((num1 < 1) || (num2 < 1) || (num3 < 1)) {
            return true;
        } else {
            return false;
        }

    }


    /**
     * Function name: isHigherThanSix
     *
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * <p>
     * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    public static boolean isHigherThanSix(int num1, int num2, int num3) {
        if ((num1 > 6) || (num2 > 6) || (num3 > 6)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     *
     * Function name: userWon
     *
     * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return (boolean)
     *
     * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5. 
     */

    // Escribe tu código aquí


    /**
     * Function name: rollDice
     *
     * @return (int)
     * <p>
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    public static int rollDice() {
        int randomDiceNum = (int) (Math.random()* 1 * 7);
        System.out.println("random" + randomDiceNum);
        return randomDiceNum;


    }

}

