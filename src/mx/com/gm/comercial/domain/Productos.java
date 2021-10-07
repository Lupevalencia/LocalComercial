
package mx.com.gm.comercial.domain;


public class Productos {
    int codigo;
    String descripcion;
    float precioUnitario;

    public Productos() {
    }

    public Productos(int codigo, String descripcion, float precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "Productos{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precioUnitario + '}';
    }
    
    
    
}
