import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);


        /*
        Integer edad = teclado.nextInt();
        Integer edad = teclado.nextInt();
        Integer edadPerro = edad * 7;
        System.out.println("Su perro en edad humana tendria: " + edadPerro);


        System.out.println("Ingrese una distancia en millas: ");
        double millas = teclado.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println("La distancia en Kilometros es: " + kilometros);


        System.out.println("Ingrese precio original del producto: ");
        float precioOriginal = teclado.nextFloat();
        System.out.println("Ingrese porcentaje del descuento: ");
        float descuento = teclado.nextFloat();
        float precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final del producto es de: " + precioFinal);


        System.out.println("Ingrese monto total de la cuenta: ");
        float totalCuenta = teclado.nextFloat();
        System.out.println("Ingrese porcentaje de propina: ");
        float porcentajePropina = teclado.nextFloat();
        float propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("La propina será de: " + propina);
        */

        Integer numeroAleatorio = (int) (Math.random() * 10);
        System.out.println("Adivine un numero: ");
        int ingresoUsuario = teclado.nextInt();
        if(ingresoUsuario == numeroAleatorio){
            System.out.println("Acerto!");
        }else{
            System.out.println("Incorrecto, el numero era: " + numeroAleatorio);
        }
    }
}
