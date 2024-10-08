public class Conversor {

    public double distancia;
    public String unidad1;

    public Conversor(double distancia, String unidad1) {
        this.distancia = distancia;
        this.unidad1 = unidad1;
    }

    public void convertir(String unidad2) {
        if (unidad2 == "kilómetros") {
            this.distancia = this.distancia / 100;
            System.out.println("Son " +this.distancia +" kilómetros");
        } if (unidad2 == "centímetros") {
            this.distancia = this.distancia * 100;
            System.out.println("Son " +this.distancia +" centímetros");
        } else if (unidad2 != "kilómetros" || unidad2 != "centímetros")
            System.out.println("Error no es posible convertir esta unidad");
    }
}


