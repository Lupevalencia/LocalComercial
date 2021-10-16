
package mx.com.gm.comercial.servicio;

import mx.com.gm.comercial.domain.*;

public interface ILocalComercial {
    // NOS OLVIDAMOS DE LOS FICHEROS y DEBEMOS DE CREAR LOS MÉTODOS QUE NECESITEMOS MANDAR A LLAMAR PARA VALIDAR
    //SÓLO NECESITAREMOS PASARLE POR PARÁMETROS LOS OBJETOS A INSERTAR Y LOS DATOS CONCRETOS A BUSCAR
    

    /**
     * Insertar los datos del producto que deseamos agregar al catálogo de Productos
     * @param productoAAgregar 
     */
    void ingresarProductos(Producto productoAAgregar);
    
    /**
     * Insertar los datos de la venta que se va a realizar al catálogo de Ventas
     * @param ventaAAgregar 
     */
    void ingresarVentas(Venta ventaAAgregar);
    
    /**
     * El método nos devuelve el número del vendedor con mayor cantidad de ventas realizadas
     * @return 
     */
    int vendedorConMayorCantidadVentas();
    
    /**
     * Listar las ventas ordenadas por número de vendedor de todas aquellas que se han realizado por débito. Además,
     * hay que incluir el precio final de la venta = precioUnitario* cantidad
     */
    void listarOrdenadoVentasDebito(); 
    
    /**
     * Determinar si el vendedor X realizó la venta del producto Y. En tal caso,
     * mostrar dicha información junto con el precio total de la venta. Si por el contrario no existe, informar sobre ello
     * @param venta
     * @return 
     */
    String comprobarVentaRealizadaPorVendedor(Venta venta); //Le pasamos la venta porque se trata de una en concreto
    
    /**
     * Calcular el monto total de las ventas realizadas
     * @return 
     */
    float montoTotalVentas();
    
    /**
     * Mostrar los datos de la mayor venta abonada con tarjetade crédito
     */
    void DatosVentaMayorTarjetaCredito();
}
