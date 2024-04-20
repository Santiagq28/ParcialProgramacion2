package parcial.parcialprogramacion2;


public class Vehiculo {
    String tipo;
    int c_carga;
    int carga;
    String conductor;
    boolean paquete;

    public Vehiculo(String tipo, int c_carga,int carga, String conductor) {
        this.tipo = tipo;
        this.c_carga = c_carga;
        this.conductor = conductor;
        this.carga = carga;
        this.paquete = false;
    }

    public Vehiculo(String tipo, int c_carga) {
        this.tipo = tipo;
        this.c_carga = c_carga;
        this.carga = 0;
        this.conductor = "Sin_Información";
        this.paquete = false;
    }

    public String getTipo() {
        return tipo;
    }

    public int getC_carga() {
        return c_carga;
    }

    public void setC_carga(int c_carga) {
        this.c_carga = c_carga;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public boolean isPaquete() {
        return paquete;
    }

    public void setPaquete(boolean paquete) {
        this.paquete = paquete;
    }
    
    
    
    public void ingresarPaquete(int c){
        if((c+carga)>c_carga){
            System.out.println("Capacidad insuficiente.");
        }
        else{
            carga += c;
            System.out.println("Paquetes ingresados.");
        }
    }
    public void retirarPaquete(int c){
        if(c>carga){
            System.out.println("Paquetes insuficiente.");
        }
        else{
            carga -= c;
            System.out.println("Paquetes retirados.");
        }
    }
    
    
}
