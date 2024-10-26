import java.util.Scanner;

public class Principal {
        public static void main(String[] args) {
            ConsultaMoneda consulta = new ConsultaMoneda();
            Scanner scanner = new Scanner(System.in);
            Moneda moneda = consulta.buscarMoneda("USD"); // Obtener tipos de cambio con USD como base

                // Tipos de cambio requeridos
                double usdToArs = moneda.conversion_rates().get("ARS");
                double usdToBrl = moneda.conversion_rates().get("BRL");
                double usdToCop = moneda.conversion_rates().get("COP");
            System.out.println(usdToArs);

                // Opciones de conversión
                System.out.print("""
                        Seleccione una conversión: 
                        1) Dólar => Peso Argentino
                        2) Peso Argentino => Dólar
                        3) Dólar => Real Brasileño
                        4) Real Brasileño => Dólar
                        5) Dólar => Peso Colombiano
                        6) Peso Colombiano => Dólar
                        *********************************
                        """);

                // Se inician las Excepciones
                try {
                    // Se guarda la opcion elegida por el usuario
                    int opcion = scanner.nextInt();
                    // Evaluamos si la opcion es valida, si no lo es se muestra un mensaje pertinente
                    if (opcion < 1 || opcion > 6){
                        System.out.println("Opcion invalida. Programa detenido.");
                        return;
                    }
                    // Solicita la cantidad de dinero que se quiere convertir
                    System.out.println("Ingrese la cantidad a convertir:");
                    // Se guarda la cantidad de dinero
                    double cantidad = scanner.nextDouble();
                    // Inicializamos la variable que almacenera el resultado obtenido por cualquier opcion de conversion
                    double resultado = 0;
                    // Inicailizamos la variable para guardar las iniciales de las monedas, para poder colocarlas en el mensaje final del resultado
                    String siglas = "";
                    switch (opcion) {
                        case 1:
                            // Se realiza la operacion de conversio, asi con cada uno de los casos
                            resultado = cantidad * usdToArs; // USD a ARS
                            siglas = " [ARS]";
                            break;
                        case 2:
                            resultado = cantidad / usdToArs; // ARS a USD
                            siglas = " [USD]";
                            break;
                        case 3:
                            resultado = cantidad * usdToBrl; // USD a BRL
                            siglas = " [BRL]";
                            break;
                        case 4:
                            resultado = cantidad / usdToBrl; // BRL a USD
                            siglas = " [USD]";
                            break;
                        case 5:
                            resultado = cantidad * usdToCop; // USD a COP
                            siglas = " [COP]";
                            break;
                        case 6:
                            resultado = cantidad / usdToCop; // COP a USD
                            siglas = " [USD]";
                            break;
                    }
                    // Se muestra el resultado de la conversion con sus iniciales pertinentes
                    System.out.println("Resultado de la conversión: " + resultado + siglas);
                } catch (Exception e) {
                    // Mostramos un mensaje cuando los usuarios ingresan un valor que no sea numerico
                    System.out.println("Ingresa solamente valores numericos!");
                    System.out.println("Programa finalizado.");
                }
            // Mensaje de finalizacion
            System.out.println("Programa finalizado.");
        }
    }