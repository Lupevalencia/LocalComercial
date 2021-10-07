
package mx.com.gm.comercial.servicio;

import mx.com.gm.comercial.domain.*;

public interface ILocalComercial {
    // NOS OLVIDAMOS DE LOS FICHEROS y DEBEMOS DE CREAR LOS MÉTODOS QUE NECESITEMOS MANDAR A LLAMAR PARA VALIDAR
    
    void ingresarProductos(Productos productoAAgregar);
    void ingresarVentas(Ventas ventaAAgregar);
    int vendedorConMayorCantidadVentas(Ventas venta); //dudo si le pasamos objeto vendedor ya que con ventas le estoy pasando todos sus atributos
    void listarOrdenadoVentasDebito(Ventas venta,Productos producto); // necesito pasarle el producto para que pueda calcular su precio final(precioUnitario* cantidad)
    String comprobarVentaRealizadaPorVendedor(Ventas venta); //Si existe debe de devolver también el precio final de la venta
    float montoTotalVentas(Ventas venta);
    void DatosVentaMayorTarjetaCredito(Ventas venta);
}
