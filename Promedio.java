import java.util.Scanner;

public class Promedio {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese primer numero: ");
        Float primerNumero = teclado.nextFloat();
        System.out.println("Ingrese segundo numero: ");
        Float segundoNumero = teclado.nextFloat();
        System.out.println("Ingrese tercer numero: ");
        Float tercerNumero = teclado.nextFloat();
        Float promedio = (primerNumero + segundoNumero + tercerNumero) / 3;
        System.out.println("Promedio:" + promedio);
    }
}
