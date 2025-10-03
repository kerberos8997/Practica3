package practica4;

import java.util.ArrayList;
import java.util.Scanner;

public class Dinamica {

    // Lista dinámica de Strings (ArrayList)
    static ArrayList<String> lista = new ArrayList<>();

    public static void agregar(String valor) {
        lista.add(valor);
    }

    public static void mostrar() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Valor posición " + i + ": " + lista.get(i));
        }
    }

    public static void eliminar(int indice) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else if (indice < 0 || indice >= lista.size()) {
            System.out.println("Índice fuera de rango. Tamaño actual: " + lista.size());
        } else {
            String valor = lista.remove(indice);
            System.out.println("Eliminado: " + valor);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) {
            System.out.println("\n==== MENÚ ====");
            System.out.println("1) Agregar valor");
            System.out.println("2) Mostrar valores");
            System.out.println("3) Eliminar valor");
            System.out.println("4) Salir");
            System.out.print("Elige una opción: ");
            String opcion = sc.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.print("Ingresa el valor a agregar: ");
                    String valor = sc.nextLine();
                    agregar(valor);
                    System.out.println("Agregado: " + valor);
                    break;

                case "2":
                    mostrar();
                    break;

                case "3":
                    System.out.print("Ingresa el índice a eliminar: ");
                    String entrada = sc.nextLine();
                    try {
                        int indice = Integer.parseInt(entrada);
                        eliminar(indice);
                    } catch (NumberFormatException e) {
                        System.out.println("Índice inválido: escribe un número entero.");
                    }
                    break;

                case "4":
                    bandera = false;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }sc.close();


    }
}