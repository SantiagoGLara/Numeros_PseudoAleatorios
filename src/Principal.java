public class Principal {
    public static void main(String[] args) throws Exception {
        //hacer programa con UI para numeros pseudoaleatorios
        NumeroPseudoaleatorio numero = new CuadradosMedios(8);
        System.out.println(numero.generarNumero());
        VentanaPrincipal ventana= new VentanaPrincipal();
        
    }
}
