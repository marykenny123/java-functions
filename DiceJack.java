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

        System.out.println("P fv elige números entre 1 y 6, ambos incluídos.");
        System.out.print("P fv teclea cada número separado por un espacio y dar a intro:\t");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (isLessThanOne(num1, num2, num3) == true) {
            System.out.println("NÚMERO ERRÓNEO");
            System.exit(-1);
        } else if (isHigherThanSix(num1, num2, num3) == true) {
            System.out.println("NÚMERO ERRÓNEO");
            System.exit(-1);
        }
        int sumNumbers = num1 + num2 + num3;

        scanner.nextLine();
        System.out.println("¿Quieres jugar a lanzar a los dados? Teclea s para sí o n para no y dar a intro.");
        String reply = scanner.nextLine();
        if (!(reply.equals("s") || (reply.equals("S")))) {              //|| (reply.equals("no")))) {
            System.exit(-1);
        } else {
            int diceNum1 = rollDice();
            int diceNum2 = rollDice();
            int diceNum3 = rollDice();
            System.out.println(diceNum1 + " " + diceNum2 + " " + diceNum3);
            int sumDice = diceNum1 + diceNum2 + diceNum3;
            System.out.println("La suma de los números de los dados es:\t" + sumDice);
            System.out.println("La suma de tus números es:\t" + sumNumbers);
            if ((userWon(sumNumbers, sumDice) == true)) {
                System.out.println("¡Enhorabuena, has ganado!");
            } else {
                System.out.println("¡Lástima, has perdido!");
            }
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

    public static boolean userWon (int sumNumbers, int sumDiceRolls) {
        if ((sumNumbers >= sumDiceRolls) && (((sumNumbers - sumDiceRolls)) <= 5)) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Function name: rollDice
     *
     * @return (int)
     * <p>
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    public static int rollDice() {
        int min = 1;
        int max = 6;
        int i = 0;
        int randomNum1 = min + (int)(Math.random() * ((max - min) + 1));
        return randomNum1 ;
    }

}

