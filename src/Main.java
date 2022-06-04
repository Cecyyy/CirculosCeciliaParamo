public class Main {
    public static void main(String[] args) {
        Circulo ObjetoRedondosSinServir=new Circulo();
        Circulo objetoRedondo= new Circulo(5);
        System.out.println("El area es: "+objetoRedondo.calcularArea());
        System.out.println("El diametro es: "+objetoRedondo.calcularDiametro());
        System.out.println("La circunferencia es: "+objetoRedondo.calcularCircunferencia());
        System.out.println(objetoRedondo.toString());
    }
}

