package Main;

import java.util.Scanner;
import Logica.Operaciones;

public class Principal{
    public static void main(String[] args){          
        Operaciones frank = new Operaciones();
        Scanner sc=new Scanner(System.in);
        int opcion, n1, n2;
        double resul;
        boolean opc= true;
        while(opc){
            System.out.println("*****Menú*****");
            System.out.println("Seleccione una opción");
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicación");
            System.out.println("[4] División");
            System.out.println("[5] Salir");          
            opcion = sc.nextInt();
            
            if (opcion ==5){
                System.out.println("Finalizada :C");
                break;
            }else {
                switch (opcion){
                    case 1: 
                        System.out.println("Ingrese el primer número");
                        n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        n2 = sc.nextInt();
                        resul = frank.suma(n1, n2);
                        System.out.println("Resultado de la suma es: " + resul);
                        break;
                    case 2:
                        System.out.println("Ingrese el primer número");
                        n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        n2 = sc.nextInt();
                        resul = frank.resta(n1, n2);
                        System.out.println("Resultado de la resta es: " + resul);
                        break;
                    case 3:
                        System.out.println("Ingrese el primer número");
                        n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        n2 = sc.nextInt();
                        resul = frank.multiplicacion(n1, n2);
                        System.out.println("Resultado de la multiplicación es: " + resul);
                        break;
                    case 4:
                        System.out.println("Ingrese el primer número");
                        n1 = sc.nextInt();
                        System.out.println("Ingrese el segundo número");
                        n2 = sc.nextInt();
                        resul = frank.division(n1, n2);
                        System.out.println("Resultado de la división es: " + resul);
                        break;
                        
                    default:
                        System.out.println("Ahorita no Joven...");
                }
            }
        }               
    }
}


