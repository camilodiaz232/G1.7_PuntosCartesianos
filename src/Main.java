import java.util.Scanner;

public class Main {

    public static void main (String []args){
        // Creacion de las variables
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;

        //Objeto de lectura de los valores
        Scanner lectura = new Scanner(System.in);

        //Captura de Coordenadas del primer punto
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.println("valor de x: ");
        x1 = Double.parseDouble(lectura.next());
        System.out.println("valor de y: ");
        y1 = Double.parseDouble(lectura.next());

        //Captura de Coordenades del segundo punto
        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.println("valor de x: ");
        x2 = Double.parseDouble(lectura.next());
        System.out.println("valor de y: ");
        y2 = Double.parseDouble(lectura.next());

        //Presentacion de los resultados
        System.out.println("La distancia entre los puntos es: "+calcularDistancia(x1,y1,x2,y2));
        System.out.println("La pendiente de la recta es: "+calcularPendiente(x1,y1,x2,y2));

    }
    // Funcion para calcular la distancia entre los puntos
    public static double calcularDistancia (double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(y2-y1,2)+Math.pow(x2-x1,2));
    }
    // Funcion para calcular la pendiente de la recta
    public static double calcularPendiente (double x1, double y1, double x2, double y2){
        return (y2-y1)/(x2-x1);
    }
}
