import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner teclado = new Scanner(System.in);


        /*
        Integer edad = teclado.nextInt();
        Integer edad = teclado.nextInt();
        Integer edadPerro = edad * 7;
        System.out.println("Su perro en edad humana tendria: " + edadPerro);


        System.out.println("Ingrese una distancia en millas: ");
        Double millas = teclado.nextDouble();
        Double kilometros = millas * 1.60934;
        System.out.println("La distancia en Kilometros es: " + kilometros);


        System.out.println("Ingrese precio original del producto: ");
        Float precioOriginal = teclado.nextFloat();
        System.out.println("Ingrese porcentaje del descuento: ");
        Float descuento = teclado.nextFloat();
        Float precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final del producto es de: " + precioFinal);


        System.out.println("Ingrese monto total de la cuenta: ");
        Float totalCuenta = teclado.nextFloat();
        System.out.println("Ingrese porcentaje de propina: ");
        Float porcentajePropina = teclado.nextFloat();
        Float propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("La propina será de: " + propina);


        Integer numeroAleatorio = (int) (Math.random() * 10);
        System.out.println("Adivine un numero: ");
        Integer ingresoUsuario = teclado.nextInt();
        if(ingresoUsuario == numeroAleatorio){
            System.out.println("Acerto!");
        }else{
            System.out.println("Incorrecto, el numero era: " + numeroAleatorio);
        }



        System.out.println("Ingrese Primer Numero: ");
        Float primerNumero = teclado.nextFloat();
        System.out.println("Ingrese Segundo Numero: ");
        Float segundoNumero = teclado.nextFloat();
        System.out.println("Ingrese Tercer Numero: ");
        Float tercerNumero = teclado.nextFloat();



        if (primerNumero > segundoNumero && primerNumero > tercerNumero) {
            if (segundoNumero > tercerNumero){
                System.out.println(tercerNumero + " es menor");
            }else{
                System.out.println(segundoNumero + " es menor");
            }
            System.out.println(primerNumero + " es mayor");
        }else{
                if(segundoNumero > tercerNumero){
                    if(tercerNumero > primerNumero){
                        System.out.println(primerNumero + " es menor");
                    }else{
                        System.out.println(tercerNumero + " es menor");
                    }
                    System.out.println(segundoNumero + " es mayor");
                }else{
                    if (segundoNumero > primerNumero){
                        System.out.println(primerNumero + " es menor");
                    }else{
                        System.out.println(segundoNumero + " es menor");
                    }
                    System.out.println(tercerNumero + " es mayor");
                }
            }

        System.out.println("Ingrese pais: ");
        String pais = teclado.nextLine();
        String busquedaUsuarioFormateada =  pais.replace(" ","+");
        String link = "https://www.google.com/maps/search/" + busquedaUsuarioFormateada;
        System.out.println(link);



        System.out.println("Ingrese palabra para buscar en Google: ");
        String busquedaUsuario = teclado.nextLine();
        String busquedaUsuarioForm =  busquedaUsuario.replace(" ","+");
        String linkio = "https://www.google.cl/search?q=" + busquedaUsuarioForm;
        System.out.println(linkio);


        System.out.println("Ingrese numero telefonico para llamar: ");
        String telefonoALlamar = teclado.nextLine();
        //String busquedaUsuarioForm =  telefonoALlamar.replace(" ","+");
        String linkio = "https://api.whatsapp.com/send?phone=" + telefonoALlamar;
        System.out.println(linkio);


        //import java.util.Scanner;

        //public class CuentoInteractivo {

            //public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("¡Bienvenido al cuento interactivo!");
                System.out.println("Eres un valiente aventurero en busca de un tesoro legendario.");

                System.out.println("Capítulo 1: El Comienzo");
                System.out.println("Te encuentras en una encrucijada en el bosque. ¿Tomarás el camino de la izquierda o el de la derecha?");
                String decision = scanner.nextLine();

                if (decision.equalsIgnoreCase("izquierda")) {
                    System.out.println("Has elegido el camino de la izquierda. Te encuentras con un río. ¿Nadarás a través de él o buscarás un puente?");
                    decision = scanner.nextLine();

                    if (decision.equalsIgnoreCase("nadar")) {
                        System.out.println("Nadas valientemente a través del río y llegas a la otra orilla ileso.");
                    } else if (decision.equalsIgnoreCase("puente")) {
                        System.out.println("Encuentras un puente seguro y cruzas el río sin problemas.");
                    } else {
                        System.out.println("Decisión no válida. ¡Te pierdes en el bosque y el cuento termina!");
                        return;
                    }
                } else if (decision.equalsIgnoreCase("derecha")) {
                    System.out.println("Has elegido el camino de la derecha. Te encuentras con una cueva. ¿Entrarás en la cueva o continuarás por el camino?");
                    decision = scanner.nextLine();

                    if (decision.equalsIgnoreCase("entrar")) {
                        System.out.println("Exploras la cueva y encuentras una antigua espada mágica. ¡Has mejorado tus habilidades!");
                    } else if (decision.equalsIgnoreCase("continuar")) {
                        System.out.println("Sigues por el camino y te encuentras con un grupo de bandidos. ¿Lucharás o intentarás esquivarlos?");
                        decision = scanner.nextLine();

                        if (decision.equalsIgnoreCase("luchar")) {
                            System.out.println("Derrotas a los bandidos con tu valentía y sigues tu camino.");
                        } else if (decision.equalsIgnoreCase("esquivar")) {
                            System.out.println("Intentas esquivar a los bandidos, pero te descubren. ¡Tienes que luchar!");
                        } else {
                            System.out.println("Decisión no válida. ¡Los bandidos te atrapan y el cuento termina!");
                            return;
                        }
                    } else {
                        System.out.println("Decisión no válida. ¡Te pierdes en el bosque y el cuento termina!");
                        return;
                    }
                } else {
                    System.out.println("Decisión no válida. ¡Te pierdes en el bosque y el cuento termina!");
                    return;
                }

                System.out.println("Capítulo 2: La Cima de la Montaña");
                System.out.println("Has llegado a la base de una alta montaña. ¿Escalarás la montaña o buscarás un camino alrededor?");
                decision = scanner.nextLine();

                if (decision.equalsIgnoreCase("escalar")) {
                    System.out.println("Escalas la montaña con éxito y llegas a la cima, donde encuentras el tesoro legendario. ¡Eres un héroe!");
                } else if (decision.equalsIgnoreCase("camino alrededor")) {
                    System.out.println("Encuentras un camino alrededor de la montaña, pero te enfrentas a un dragón. ¿Lucharás o intentarás persuadir al dragón?");
                    decision = scanner.nextLine();

                    if (decision.equalsIgnoreCase("luchar")) {
                        System.out.println("Luchas valientemente contra el dragón y, aunque herido, obtienes el tesoro legendario.");
                    } else if (decision.equalsIgnoreCase("persuadir")) {
                        System.out.println("Utilizas tus habilidades de persuasión y logras convencer al dragón de que te deje pasar. ¡Obtienes el tesoro!");
                    } else {
                        System.out.println("Decisión no válida. ¡El dragón se enfurece y el cuento termina!");
                        return;
                    }
                } else {
                    System.out.println("Decisión no válida. ¡Te pierdes en la montaña y el cuento termina!");
                    return;
                }

                System.out.println("¡Felicidades! Has completado la aventura y obtenido el tesoro legendario.");
                */
        int i = 0;
        while (i <= 100) {
            System.out.println(i+ 1);
            i += 1;
        }
    }
}








