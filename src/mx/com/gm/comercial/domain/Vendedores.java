
package mx.com.gm.comercial.domain;

//Solo necesito que herede dos de sus atributos, aunque la venta al completo va referida a uno de los vendedores del Local Comercial
public class Vendedores extends Ventas {

    public Vendedores() {
    }

    public Vendedores(int fechaVenta, int numeroVendedor, int codigo, int cantidadVendidaProducto, int formaPago) {
        super(fechaVenta, numeroVendedor, codigo, cantidadVendidaProducto, formaPago);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('}');
        return sb.toString();
    }
   
    
    
}
