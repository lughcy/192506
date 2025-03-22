import java.util.Scanner;

public class ClubSecreto {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = consola.nextInt();
        System.out.println(edad);
        if (edad>=18) {
            System.out.println("Edad suficiente ");
        }else{
            System.out.println("Edad insuficiente ");
        } 
        System.out.println("Escribe la clave utra secreta: ");
        int claveSecreta = consola.nextInt();
        System.out.println(claveSecreta);
        if (claveSecreta==1234){
            System.out.println("La clave es correcta");
        }
        else{
            System.out.println("La clave es incorrecta");
            
        }
        System.out.println("Di la frase secreta: ");
        String fraseSecreta = consola.nextLine();
        String Uno = "La matriz vive";
        
        if (fraseSecreta==Uno){
            System.out.println(fraseSecreta);
        } else{
            System.out.println("La frase es incorrecta ");

        }
            
        }

        }
