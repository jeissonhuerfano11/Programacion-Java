/*Este programa es un mini juego para que el usuario pueda encontrar el numero secreto entre 1 y 20 en varios intentos
Obejtivo del programa es poder usar todo lo aprendido en condicionales y bucles de java*/
import java.util.Scanner;
import java.util.Random;

public class NumeroSecreto {

    public static void main(String[] args) {
        
        //Puntos de guardado
        Scanner Scanner = new Scanner(System.in);
        Random Random = new Random();
        
        //Iniciamos el numero secreto entre 1 y 20
        int NumeroSecreto = Random.nextInt(20) + 1;

        //Variables del Juego
        int Intento = 0;
        int ContadorIntentos = 0;
        boolean Adivinado = false;

        //Comienzo del mini juego
        System.out.println("______________________________________________________________________________");
        System.out.println("                                                                               ");
        System.out.println("////////¡Bienvenido al mini juego de encuentra el numero de 1 a 20!////////");
        System.out.println("//////Estoy pensando un numero y lo tienes que adivinar en varios intentos//////");
        System.out.println("_______________________________________________________________________________");

        //Bucle while
        while(Intento != NumeroSecreto ){
            
            //Incremento de contabilizador de intentos
            ContadorIntentos++;
            System.out.println("____________________________________________________");
            System.out.println("Intento #" + ContadorIntentos + " ingresa tu numero: ");
            Intento = Scanner.nextInt();

            //condicional anidado
            if(Intento == NumeroSecreto){
                boolean Adivinado1 = false;
            } else{
                if(Intento < NumeroSecreto){
                    System.out.println("demasiado bajo, sigue intentando");
                } else{
                    if(Intento > NumeroSecreto){
                        System.out.println("Demasiado alto, sigue intentando");
                    }
                }
            }

        }
        //Resultado del mini juego
        System.out.println("_____________________________________");
        System.out.println("¡felicitaciones, encontraste el numero secreto!: " +NumeroSecreto);
        System.out.println("Te tomo " + ContadorIntentos + " intentos ");
        System.out.println("_____________________________________________");

    }
  
}
