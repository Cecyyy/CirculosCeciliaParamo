public class Circulo {

        private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea (){
        double area;
        area=(3.1416*Math.pow(radio,2));
        return area;
    }
    public double calcularDiametro(){
        double diametro;
        diametro=(radio*2);
        return diametro;



    }

    public double calcularCircunferencia(){
        double circunferencia;
        circunferencia=3.1416*(2*radio);
        return circunferencia;

    }
    public Circulo(){
        System.out.println("No sirvo para nada :(");
    }

    @Override
    public String toString() {
        return "El circulo tiene un radio de " + radio +
                "\n El area del circulo es "+calcularArea()+

                "\n El diametro del circulo es "+calcularDiametro()+
                "\n La circunferencia del circulo es de "+calcularCircunferencia();

    }
}
