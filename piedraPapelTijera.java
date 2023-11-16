import java.util.Scanner;


public class piedraPapelTijera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int puntajeMaximo = 0;
        int puntajeCPU = 0;
        int puntajeUsuario = 0;
        while (puntajeMaximo <= 100) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("\tIngrese su eleccion:\n1-Piedra\n2-Papel\n3-Tijera");
            int eleccionUsuario = teclado.nextInt();
            if (eleccionUsuario == 1) {
                System.out.println("Escogiste Piedra");
            } else if (eleccionUsuario == 2) {
                System.out.println("Escogiste Papel");
            } else if (eleccionUsuario == 3) {
                System.out.println("Escogiste Tijera");
            } else {
                System.out.println("Ingreso Incorrecto, 10 puntos menos de puntaje");
                puntajeUsuario -= 10;
            }
            int eleccionCPU = (int) (Math.random() * 3 + 1);
            if (eleccionCPU == 1) {
                System.out.println("CPU escogió Piedra");
            } else if (eleccionCPU == 2) {
                System.out.println("CPU escogió Papel");
            } else if (eleccionCPU == 3) {
                System.out.println("CPU escogió Tijera");
            }

            if (eleccionUsuario == 1 && eleccionCPU == 1) {
                System.out.println("Empate");
                puntajeMaximo += 10;
            }
            if (eleccionUsuario == 1 && eleccionCPU == 2) {
                System.out.println("Gana CPU");
                puntajeMaximo += 10;
                puntajeCPU += 100;
            }
            if (eleccionUsuario == 1 && eleccionCPU == 3) {
                System.out.println("Usted Gana!");
                puntajeMaximo += 10;
                puntajeUsuario += 100;
            }
            if (eleccionUsuario == 2 && eleccionCPU == 1) {
                System.out.println("Usted Gana!");
                puntajeMaximo += 10;
                puntajeUsuario += 100;
            }
            if (eleccionUsuario == 2 && eleccionCPU == 2) {
                System.out.println("Empate");
                puntajeMaximo += 10;
            }
            if (eleccionUsuario == 2 && eleccionCPU == 3) {
                System.out.println("Gana CPU");
                puntajeMaximo += 10;
                puntajeCPU += 100;
            }
            if (eleccionUsuario == 3 && eleccionCPU == 1) {
                System.out.println("Gana CPU");
                puntajeMaximo += 10;
                puntajeCPU += 100;
            }
            if (eleccionUsuario == 3 && eleccionCPU == 2) {
                System.out.println("Usted Gana!");
                puntajeMaximo += 10;
                puntajeUsuario += 100;
            }
            if (eleccionUsuario == 3 && eleccionCPU == 3) {
                System.out.println("Empate");
                puntajeMaximo += 10;
            }
        }
        if (puntajeUsuario > puntajeCPU){
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("GANASTE LA PARTIDA!!\n" + "Usuario: " +  puntajeUsuario + " PUNTAJES.\n" + "CPU: " + puntajeCPU + " PUNTAJES.");
            System.out.println("--------------------------------------------------------------------------------------");
        }else {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("PERDISTE LA PARTIDA!!\n" + "Usuario: " +  puntajeUsuario + " PUNTAJES.\n" + "CPU: " + puntajeCPU + " PUNTAJES.");
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
}


