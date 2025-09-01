
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class trabajoSemanaTres {

    // metodo principal
    public static void main(String[] args) {

        // inicializacion del scanner para la entrada de datos del usuario
        Scanner sc = new Scanner(System.in);
       
        // inicializacion del random para generar el monto de la compra
        Random random = new Random();
       
        // inicializacion del DecimalFormat para dar formato a los numeros
        DecimalFormat formato = new DecimalFormat("#,###");

        
        // generacion aleatoria del monto y los km a recorrer
        
        // se suman 10000 para que el monto minimo sea 10,000 y no 0. y se agrega 90001 para que el maximo sea 70,000
        int montoCompra = 10000 + random.nextInt(60001); 

        // se suman 2 para que el minimo de km sean 2 y no 0. y se agrega 19 para que el maximo sea 20
        int km  = 2 + random.nextInt(19); 


        // para separar y dar un poco de claridad en la consola de salida
       System.out.println("\n--------------------------------------------------");

        // inicio del programa, con la peticion de Nombre, Apellido, edad y una cuenta de gmail valida.
        System.out.println("\nBienvenido(a) a la tienda de alimentos, para comenzar ingrese: ");
        
        System.out.println("\nSu Nombre y Apellido: ");

        String nombres = sc.nextLine();

        System.out.println("\nSu edad. (en numeros): ");

        int edad = sc.nextInt();
        sc.nextLine(); // Para capturar el enter precionado despues de ingresar un numero (nextInt)
        
        System.out.println("\nIngrese su cuenta de Gmail: ");
    
        String email = sc.nextLine();
        
        // ciclo while para validar que el email ingresado sea una cuenta de gmail
        while(!(email.contains("@")&& email.endsWith("gmail.com"))){
            System.out.println("\nCuneta de Gmail invalido, por favor ingrese una cuenta de Gmail valido para continuar con su compra.");
            
            System.out.println("\nIngrese su cuenta: ");
            email = sc.nextLine();
        };


        // mensaje de exito al registrar 
        System.out.println("\nExcelente, email registrado exitosamente, a continuacion se le mostrara el monto total de su compra de alimentos.");

        
        // Salida de datos del monto de la compra.
        System.out.println("\nEstimado cliente " + nombres + ", el monto total de su compra de alimentos es: $" + formato.format(montoCompra)   + " pesos.");
        
        
       // para guardar el costo de envio
        int costoEnvio;


        // Condicionales para calcular el costo de envio dependiendo del monto de la compra
        if (montoCompra >= 50000) {
            costoEnvio = 0; 
        System.out.println("\nEl costo de envío a su domicilio es gratis (por compras superiores a 50.000 pesos envio gratis). Distancia a recorrer: " + km + " km.");
        }// Envío gratis

        else if (montoCompra >= 25000) {

            costoEnvio = km * 150; // segun la logica del negocio.

            System.out.println("\nEl costo de envío a su domicilio es de: $" + formato.format(costoEnvio)  + " pesos. Distancia a recorrer: " + km + " km.");
        }

        else {
            costoEnvio = km * 300; // segun la logica del negocio.

            System.out.println("\nEl costo de envío a su domicilio es de: $" + formato.format(costoEnvio) + " pesos. Distancia a recorrer: " + km + " km.");    
        }
        
        // Calculo del monto total a pagar
        int totalPagar = montoCompra + costoEnvio;


        // Salida de datos del monto total a pagar con formato de miles
        System.out.println("\nEl monto total a pagar es: $" + formato.format(totalPagar) + " pesos.");

        
        
        //Peticion de entrada de datos por parte del usuario
        System.out.println("\nPara finalizar tu compra debes ingresar los siguentes datos para el trasporte: \n \nMarca del trasporte: ");
        
        // Variable de tipo String para almacenar los datos ingresados por el usuario
        String marca = sc.nextLine();

        System.out.println("\nModelo del trasporte deseado. (moto o auto): ");
        
        // Variable de tipo String para almacenar los datos ingresados por el usuario
        String modelo = sc.nextLine();

        System.out.println("\nCilindrada del trasporte?. ( en caso de motos: 150, 200, 250, etc..), ( en caso de auto: 1200, 1300, 1600 etc..): ");
        
         // Variables de tipo double para almacenar los datos ingresados por el usuario
        int cilindrada = sc.nextInt();
        // Para capturar el enter precionado despues de ingresar un numero (nextInt)
        sc.nextLine();

        System.out.println("\nTipo de combustible. (93, 95, diesel): ");
        
        // Variables de tipo String para almacenar los datos ingresados por el usuario,(es string porque puede ser diesel)  
        String combustible = sc.nextLine();

        System.out.println("\nCapacidad max de pasajeros. (En numero): ");
        
        // Variables de tipo int para almacenar los datos ingresados por el usuario
        int maxPasajeros = sc.nextInt();

        //Cierre del scanner
        sc.close();

       //Salida de datos con formato placeholders (%s String, %d int, %f double o float)
       System.out.printf("\nGracias por comprar con nosotros, los datos de tu compra son los siguientes: " +
        
       // se usa \n y + para hacer saltos de linea y concatenar respectivamente
       "\n\nNombre, Apellido y edad del cliente : %s , %d años" +
       "\n\nEl monto total de su compra es: " + formato.format(montoCompra) +
       "\n\nEl costo del envio a su domicilio es: " + formato.format(costoEnvio) +
       "\n\nEL monto total a pagar es: " + formato.format(totalPagar)+
       "\n\nLa marca del trasporte que ha ingresado es :  %s " +
       "\n\nEl modelo del trasporte que ha ingresado es : %s " +
       "\n\nLa cilindrada del trasporte que ha ingresado es : %d " +
       "\n\nEl tipo de combustible es : %s " +
        "\n\nTiene una capacidad de : %d " +
        // se remplaza %s, %d, %f por las variables nombres, edad, marca, modelo, cilindrada, combustible, maxPasajeros respectivamente
        "\n\n------------ muchas gracias!! hasta la proxima. ------------",nombres, edad, marca, modelo, cilindrada, combustible, maxPasajeros);
        
    }
}