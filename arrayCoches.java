import java.util.Scanner;

public class arrayCoches {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        String[] coches = new String[4]; 

        System.out.println("Por favor, introduce tus mejores coches:");

        for (int k = 0; k < coches.length; k++) {
            System.out.print("Coche " + (k + 1) + ": ");
            coches[k] = Teclado.nextLine(); 
        }
        System.out.println("tus mejores coches  son:");
        for (String coche : coches) {
            System.out.println(coche);
        
        }

        
    }
    }

