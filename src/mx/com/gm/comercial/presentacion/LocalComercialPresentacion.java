
package mx.com.gm.comercial.presentacion;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;
import mx.com.gm.comercial.domain.*;
import java.text.SimpleDateFormat;


public class LocalComercialPresentacion {
    public static void main(String[] args) throws ParseException {
        var opcion = -1;
        var scanner = new Scanner(System.in);
       
      while(opcion != 0){
            System.out.println("Elige una opcion : \n"
                    
            + "1. Ingrese los datos de los productos a la venta que dispone dicho local.\n"
            + "2. Ingrese los datos de las ventas registradas.\n"
            + "3. Determinar cuál fue el vendedor que realizó la mayor cantidad de ventas.\n"
            + "4. Generar un listado, ordenado por número de vendedor, de todas las ventas realizadas por débito.\n"
            + "5. Determinar si el vendedor X realizó una venta del producto Y.\n"
            + "6. Determinar el monto total de ventas realizadas"
            + "7. Mostrar los datos de la venta de mayor importe abonada con tarjeta de crédito"
            + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            
            switch (opcion) {
                case 1:  //HACER VALIDACIONES CORRESPONDIENTESY
                    //El id no se pide por teclado, es autoincremento
                    System.out.println("Introduce el codigo del producto: ");
                    String codigoProductoString = scanner.nextLine();
                    int codigoProducto = Integer.parseInt(codigoProductoString);
                    
                    System.out.println("Introduce la descripcion del producto: ");
                    String descripcionProducto = scanner.nextLine();
                    
                    System.out.println("Introduce el precio del producto: ");
                    String precioProductoString = scanner.nextLine();
                    float precioUnitarioProducto = Float.parseFloat(precioProductoString);
                    
                    Producto productoAAgregar = new Producto(codigoProducto,descripcionProducto,precioUnitarioProducto);
                    
                    break;   
                case 2:
                    //El id no se pide por teclado, es autoincremento
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.println("Introduce la fecha de Venta del producto: ");
                    String fechaVentaString = scanner.nextLine();
                    Date fechaVenta = formato.parse(fechaVentaString);
                    
                    System.out.println("Introduce el número del vendedor del producto: "); //No puede introducir un número superior al número máximo de vendedores que haya
                                                                                           //Ni valores nulos o negativos
                    String numeroVendedorString = scanner.nextLine();
                    int numeroVendedor = Integer.parseInt(numeroVendedorString);
                    
                    System.out.println("Introduce el codigo del producto: ");
                    String codigoString = scanner.nextLine();
                    int codigo = Integer.parseInt(codigoString);
                    // AQUÍ DEBEMOS DE VALIDAR QUE EXISTE EL PRODUCTO QUE SE DESEA VENDER EN EL LOCAL COMERCIAL
                    
                    System.out.println("Introduce la cantidad vendida de este producto: ");
                    String cantidadVendidaString = scanner.nextLine();
                    int cantidadVendidaProducto = Integer.parseInt(cantidadVendidaString);
                     
                    System.out.println("Introduce la forma de pago de este producto: "); // Sólo validos: 0,1,2
                    String formaPagoString = scanner.nextLine();
                    int formaPago = Integer.parseInt(formaPagoString );
                    
                    Venta ventaAAgregar = new Venta(fechaVenta,numeroVendedor,codigo,cantidadVendidaProducto,formaPago);
                    
                    break;
                case 3:
                    //Devolver el número del vendedor que realizó mayor cantidad de ventas
                    break;
                case 4:
                    //Listado ordenado por nº vendedor de las ventas realizadas por débito. (PrecioFinal= precioUnitario* cantidadVendidaProducto)
                    break;
                case 5:
                    // Devuelve el resultado de buscar un vendedor y una venta determinada, si existe, la mostramos junto con su PrecioFinal y sino, mostramos mensaje error 
                    break;
                case 6:
                    // Devuelve el monto total de ventas realizadas por los vendedores
                    break;
                case 7:
                    //Devuelve los datos de la venta de mayor importe de la venta abonada con tarjeta de crédito
                    break;
                case 0:
                    System.out.println("Hasta pronto!!");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;                   
                
            }
        }
    }
}

