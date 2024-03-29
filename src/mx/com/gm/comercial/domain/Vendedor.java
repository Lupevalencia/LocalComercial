
package mx.com.gm.comercial.domain;

//Solo necesito que herede dos de sus atributos, aunque la venta al completo va referida a uno de los vendedores del Local Comercial
public class Vendedor{
    int idVendedor;
    int numeroVendedor;
    String nombreVendedor;
    String dniVendedor;

    public Vendedor() {
    }

    public Vendedor(int numeroVendedor, String nombreVendedor, String dniVendedor) {
        this.numeroVendedor = numeroVendedor;
        this.nombreVendedor = nombreVendedor;
        this.dniVendedor = dniVendedor;
    } 
    
    public Vendedor(int idVendedor, int numeroVendedor, String nombreVendedor, String dniVendedor) {
        this.idVendedor = idVendedor;
        this.numeroVendedor = numeroVendedor;
        this.nombreVendedor = nombreVendedor;
        this.dniVendedor = dniVendedor;
    }

    public int getIdVendedor() {
        return this.idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getNumeroVendedor() {
        return this.numeroVendedor;
    }

    public void setNumeroVendedor(int numeroVendedor) {
        this.numeroVendedor = numeroVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getDniVendedor() {
        return this.dniVendedor;
    }

    public void setDniVendedor(String dniVendedor) {
        this.dniVendedor = dniVendedor;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "idVendedor=" + idVendedor + ", numeroVendedor=" + numeroVendedor + ", nombreVendedor=" + nombreVendedor + ", dniVendedor=" + dniVendedor + '}';
    }
    
    

   
    
    
}
