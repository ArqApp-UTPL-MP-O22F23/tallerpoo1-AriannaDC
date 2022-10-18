
package complejo;

import java.util.Scanner;

/**
 *
 * @author Arianna Vinueza
 */
public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float partereal;
        float parteimaginaria;

        Complejo parteUno;
        Complejo parteDos;
        Complejo resultado;

        System.out.print("Ingrese real 1 : ");
        partereal = input.nextFloat();
        System.out.print("Ingrese imaginario 1 : ");
        parteimaginaria = input.nextFloat();
        parteUno = new Complejo(partereal, parteimaginaria);

        System.out.print("Ingrese real 2 : ");
        partereal = input.nextFloat();
        System.out.print("Ingrese imaginario 2 : ");
        parteimaginaria = input.nextFloat();
        parteDos = new Complejo(partereal, parteimaginaria);
        int op;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Salir");
            System.out.print("Eleccion: ");
            op = input.nextInt();

            switch (op) {
                case 1:
                    resultado = parteUno.Suma(parteDos);
                    System.out.printf("a + b = %s\n",
                            resultado.toFloatString());
                    break;
                case 2:
                    resultado = parteUno.Resta(parteDos);
                    System.out.printf("a - b = %s\n",
                            resultado.toFloatString());
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("EL VALOR INGRESADO NO ES UNA OPCION");
                    System.out.println("INTENTELO DE NUEVO");
                    break;
            }
        } while (op != 4);

    }

}
