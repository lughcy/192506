import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Nombre vendedor: ");
        String nombreVendedor = consola.nextLine();

        System.out.print("Cantidad de productos vendidos:");
        int productosVendidos = consola.nextInt();

        System.out.print("Ingrese valor producto 1:");
        int productoUno = consola.nextInt();

        System.out.print("Ingrese valor producto 2:");
        int productoDos = consola.nextInt();

        System.out.print("Ingrese valor producto 3:");
        int productoTres = consola.nextInt();

        System.out.print("Ingrese valor producto 4:");
        int productoCuatro = consola.nextInt();

        System.out.print("Ingrese valor producto 5:");
        int productoCinco = consola.nextInt();

        System.out.print("Ingrese valor producto 6:");
        int productoSeis = consola.nextInt();

        System.out.print("Ingrese valor producto 7:");
        int productoSiete = consola.nextInt();

        double sumaUno = 0;

        if (productoUno >= 100000) {
            sumaUno = sumaUno + (productoUno * 0.10);
        } else {
            sumaUno = sumaUno + (productoUno * 0.05);
        }

        if (productoDos >= 100000) {
            sumaUno = sumaUno + (productoDos * 0.10);
        } else {
            sumaUno = sumaUno + (productoDos * 0.05);
        }

        if (productoTres >= 100000) {
            sumaUno = sumaUno + (productoTres * 0.10);
        } else {
            sumaUno = sumaUno + (productoTres * 0.05);
        }

        if (productoCuatro >= 100000) {
            sumaUno = sumaUno + (productoCuatro * 0.10);
        } else {
            sumaUno = sumaUno + (productoCuatro * 0.05);
        }

        if (productoCinco >= 100000) {
            sumaUno = sumaUno + (productoCinco * 0.10);
        } else {
            sumaUno = sumaUno + (productoCinco * 0.05);
        }

        if (productoSeis >= 100000) {
            sumaUno = sumaUno + (productoSeis * 0.10);
        } else {
            sumaUno = sumaUno + (productoSeis * 0.05);
        }

        if (productoSiete >= 100000) {
            sumaUno = sumaUno + (productoSiete * 0.10);
        } else {
            sumaUno = sumaUno + (productoSiete * 0.05);
        }

        double totalVentas = productoUno + productoDos + productoTres + productoCuatro + productoCinco + productoSeis + productoSiete;
        double salarioTotal = (sumaUno + 1000000);

        System.out.println("\tVendedor: " + nombreVendedor);
        System.out.println("\tTotal ventas: " + totalVentas);
        System.out.println("\tComisiones: " + sumaUno);
        System.out.println("\tCantidad de productos vendidos: " + productosVendidos);
        System.out.println("\tSalario total: " + salarioTotal);
    }
}
