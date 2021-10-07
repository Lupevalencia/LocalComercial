
package mx.com.gm.comercial.domain;


public class Ventas {
    int fechaVenta;  //  nº con 6 cifras. Ejemplo 061021 día,mes,año
    int numeroVendedor; //numeros del 1-100
    int codigo;
    int cantidadVendidaProducto;
    int formaPago;  // Efectivo: 0 ; Débito: 1 ; Tarjeta: 2
    float precioFinalVenta; //necesito este atributo aunque esto tiene que calcularlo con el precio del producto y no pidiéndoselo al usuario por teclado

    public Ventas() {
    }

    public Ventas(int fechaVenta, int numeroVendedor, int codigo, int cantidadVendidaProducto, int formaPago) {
        this.fechaVenta = fechaVenta;
        this.numeroVendedor = numeroVendedor;
        this.codigo = codigo;
        this.cantidadVendidaProducto = cantidadVendidaProducto;
        this.formaPago = formaPago;
    }
    
    

    public Ventas(int fechaVenta, int numeroVendedor, int codigo, int cantidadVendidaProducto, int formaPago,float precioFinalVenta) {
        this.fechaVenta = fechaVenta;
        this.numeroVendedor = numeroVendedor;
        this.codigo = codigo;
        this.cantidadVendidaProducto = cantidadVendidaProducto;
        this.formaPago = formaPago;
        this.precioFinalVenta = precioFinalVenta;
    }

    public int getFechaVenta() {
        return this.fechaVenta;
    }

    public void setFechaVenta(int fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getNumeroVendedor() {
        return this.numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "Ventas{" + "fechaVenta=" + fechaVenta + ", numeroVendedor=" + numeroVendedor + ", codigo=" + codigo + ", cantidadVendidaProducto=" + cantidadVendidaProducto + ", formaPago=" + formaPago + ", precioFinalVenta=" + precioFinalVenta + '}';
    }

   

    
    
}
