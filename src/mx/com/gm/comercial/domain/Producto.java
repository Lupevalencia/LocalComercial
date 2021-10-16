
package mx.com.gm.comercial.domain;


public class Producto {
    int idProducto;
    int codigoProducto;
    String descripcion;
    float precioUnitario;

    public Producto() {
    }

    public Producto(int codigoProducto, String descripcion, float precioUnitario) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public Producto(int idProducto, int codigo, String descripcion, float precioUnitario) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }



    public int getCodigo() {
        return this.codigoProducto;
    }

    public void setCodigo(int codigo) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return this.precioUnitario;
    }

    public void setPrecio(float precio) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", codigoProducto=" + codigoProducto + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + '}';
    }


    
    
    
}
