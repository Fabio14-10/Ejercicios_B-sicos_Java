
package ejerciciofactura;
import java.util.Scanner;

public class Factura {

    String Saludo = "Hola, como estas? Bienvenido!!";
    public Factura(){   
    }
    
    public boolean tomarDatos(){
        System.out.println(Saludo);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el nombre del cliente");
        String NombreCliente=sc.nextLine();
        System.out.println("Digite el producto a comprar");
        String Producto=sc.nextLine();
        System.out.println("Digite la cantidad a comprar");
        int Cantidad=sc.nextInt();
        System.out.println("Digite el precio de dicho producto");
        int PrecioUni=sc.nextInt();
        System.out.println(NombreCliente+" "+"Eres estudiante?"
                + "Si(1)"
                + "No(2)");
        int Estudiante=sc.nextInt();
            if (Estudiante==1){
            
            double Total=PrecioUni*Cantidad;
            double Descuento=Total*0.13;
            double Pago=Total+Descuento;
        
        Factura.calcularDatos(Cantidad, PrecioUni);
        return false;
    }
    public static void calcularDatos (int datoCantidad, int datoPrecioUni) {

}

    }
    public void mortarResultados(){
        System.out.println();
    }
    
}
