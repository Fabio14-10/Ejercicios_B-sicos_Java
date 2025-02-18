
package ejerciciofactura;


public class EjercicioFactura {


    public static void main(String[] args) {
        Factura obj = new Factura();
        boolean aux=obj.tomarDatos();
        System.out.println("Estado del cliente: "+aux);
        Factura.calcularDatos(0, 0);

        if (Estudiante==1){
            
            double Total=PrecioUni*CantidadComprada;
            double Descuento=Total*0.13;
            double Pago=Total+Descuento;
        System.out.println("El producto es "+Producto);
        System.out.println("La cantidad Comprada es "+CantidadComprada);
        System.out.println("El precio unitario es de: "+PrecioUni);
        System.out.println(NombreCliente+" "+"El total de la factura es "+Total);
        System.out.println("El impuesto dado por ser Estudiante es de el 13%");
        System.out.println(NombreCliente+" "+"El total de la factura con su respectivo descuento es "+Pago);
            
        }
        else {
            double Total1=PrecioUni*CantidadComprada;
            double Descuento1=Total1*0.05;
            double Pago1=Total1+Descuento1;
        System.out.println("El producto es "+Producto);
        System.out.println("La cantidad Comprada es "+CantidadComprada);
        System.out.println("El precio unitario es de: "+PrecioUni);
        System.out.println(NombreCliente+" "+"El total de la factura es "+Total1);
        System.out.println("El impuesto dado por no ser Estudiante es de el 5%");
        System.out.println(NombreCliente+" "+"El total de la factura con su respectivo descuento es "+Pago1);
    }
   }
    public EjercicioFactura(){
        System.out.println("Hola, como estas? Esta es tu factura:");
    }
}
