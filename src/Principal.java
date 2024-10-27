import java.text.DecimalFormat;
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

            // Se inician las Excepciones
            try {
            while (true){
                // Opciones de conversión
                System.out.println("""
                        *************************************************
                        Sea bienvenido/a al Conversor de Moneda =]:
                         
                        1) Dólar => Peso Argentino
                        2) Peso Argentino => Dólar
                        3) Dólar => Real Brasileño
                        4) Real Brasileño => Dólar
                        5) Dólar => Peso Colombiano
                        6) Peso Colombiano => Dólar
                        7) Salir
                        Elija una opcion valida:
                        *************************************************
                        """);

                    // Se guarda la opcion elegida por el usuario
                    int opcion = scanner.nextInt();
                    // Evaluamos si la opcion es valida, si no lo es se muestra un mensaje pertinente
                    if (opcion < 1 || opcion > 7){
                        System.out.println("Opcion invalida.");
                        System.out.println("Programa Finalizado.");
                        return;
                    // Si la opcion es 7 se sale del sistema
                    } else if(opcion == 7){
                        System.out.println("Saliendo del sistema.");
                        System.out.println("Programa Finalizado.");
                        return;
                    }

                    // Solicita la cantidad de dinero que se quiere convertir
                    System.out.println("Ingrese el valor que deseas convertir:");
                    // Se guarda la cantidad de dinero
                    double cantidad = scanner.nextDouble();
                    // Inicializamos la variable que almacenera el resultado obtenido por cualquier opcion de conversion
                    double resultado = 0;
                    // Inicailizamos la variable para guardar las iniciales de las monedas, para poder colocarlas en el mensaje final del resultado
                    String siglasConversion = "";
                    String siglasBase = "";
                    switch (opcion) {
                        case 1:
                            // Se realiza la operacion de conversio, asi con cada uno de los casos
                            resultado = cantidad * usdToArs; // USD a ARS
                            siglasBase = " [USD]";
                            siglasConversion = " [ARS]";
                            break;
                        case 2:
                            resultado = cantidad / usdToArs; // ARS a USD
                            siglasBase = " [ARS]";
                            siglasConversion = " [USD]";
                            break;
                        case 3:
                            resultado = cantidad * usdToBrl; // USD a BRL
                            siglasBase = " [USD]";
                            siglasConversion = " [BRL]";
                            break;
                        case 4:
                            resultado = cantidad / usdToBrl; // BRL a USD
                            siglasBase = " [BRL]";
                            siglasConversion = " [USD]";
                            break;
                        case 5:
                            resultado = cantidad * usdToCop; // USD a COP
                            siglasBase = " [USD]";
                            siglasConversion = " [COP]";
                            break;
                        case 6:
                            resultado = cantidad / usdToCop; // COP a USD
                            siglasBase = " [COP]";
                            siglasConversion = " [USD]";
                            break;
                    }
                    // Se muestra el resultado de la conversion con sus iniciales pertinentes
                    System.out.println("El valor " + cantidad + siglasBase + " corresponde al valor final de =>>> " + String.format("%.2f",resultado) + siglasConversion);
                }
            } catch (Exception e) {
                // Mostramos un mensaje cuando los usuarios ingresan un valor que no sea numerico
                System.out.println("Ingresa solamente valores numericos!");
                System.out.println("Programa Finalizado.");
            }
        }
    }