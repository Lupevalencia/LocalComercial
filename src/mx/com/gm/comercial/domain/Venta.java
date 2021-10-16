
package mx.com.gm.comercial.domain;

import java.util.Date;


public class Venta {
    int idVenta;
    Date fechaVenta;  //  nº con 6 cifras. Ejemplo 061021 día,mes,año
    int numeroVendedor; //numeros del 1-100
    int codigoProducto;
    int cantidadVendidaProducto;
    int formaPago;  // Efectivo: 0 ; Débito: 1 ; Tarjeta: 2
    float precioFinalVenta; //necesito este atributo aunque esto tiene que calcularlo con el precio del producto y no pidiéndoselo al usuario por teclado

    public Venta() {
    }

    public Venta(Date fechaVenta, int numeroVendedor, int codigoProducto, int cantidadVendidaProducto, int formaPago) {
        this.fechaVenta = fechaVenta;
        this.numeroVendedor = numeroVendedor;
        this.codigoProducto = codigoProducto;
        this.cantidadVendidaProducto = cantidadVendidaProducto;
        this.formaPago = formaPago;
    }    
    
    public Venta(int idVenta, Date fechaVenta, int numeroVendedor, int codigoProducto, int cantidadVendidaProducto, int formaPago, float precioFinalVenta) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.numeroVendedor = numeroVendedor;
        this.codigoProducto = codigoProducto;
        this.cantidadVendidaProducto = cantidadVendidaProducto;
        this.formaPago = formaPago;
        this.precioFinalVenta = precioFinalVenta;
    }    

    public int getIdVenta() {
        return this.idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getNumeroVendedor() {
        return this.numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public int getCodigo() {
        return this.codigoProducto;
    }

    public void setCodigo(int codigo) {
        this.codigoProducto = codigoProducto;
    }

    public int getCantidadVendidaProducto() {
        return this.cantidadVendidaProducto;
    }

    public void setCantidadVendidaProducto(int cantidadVendidaProducto) {
        this.cantidadVendidaProducto = cantidadVendidaProducto;
    }

    public int getFormaPago() {
        return this.formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    public float getPrecioFinalVenta() {
        return this.precioFinalVenta;
    }

    public void setPrecioFinalVenta(float precioFinalVenta) {
        this.precioFinalVenta = precioFinalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + ", numeroVendedor=" + numeroVendedor + ", codigoProducto=" + codigoProducto + ", cantidadVendidaProducto=" + cantidadVendidaProducto + ", formaPago=" + formaPago + ", precioFinalVenta=" + precioFinalVenta + '}';
    }   
    
}
