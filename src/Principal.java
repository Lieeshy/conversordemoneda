import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;

        while (opcion != 8) {
            System.out.println("******************");
            System.out.println("Bienvenidos al conversor de monedas\n");
            System.out.println("Ingresa la conversión que deseas realizar:\n");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Convertir otra moneda");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = lectura.nextInt();
            lectura.nextLine(); // limpia el buffer

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }

        lectura.close();
    }
}
