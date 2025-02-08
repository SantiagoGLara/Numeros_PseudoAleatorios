public class Principal {
    public static void main(String[] args) throws Exception {
        //hacer programa con UI para numeros pseudoaleatorios
       // NumeroPseudoaleatorio numero = new CuadradosMedios();
        CuadradosMedios numero1 = new CuadradosMedios();
        numero1.setNumero(5735.0);
        System.out.println(numero1.generarNumero());
        VentanaPrincipal ventana= new VentanaPrincipal();
        //VentanaGeneracion ventana1= new VentanaGeneracion();
        
    }
}
