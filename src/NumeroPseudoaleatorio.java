public abstract class NumeroPseudoaleatorio {
    double numero;
    
    public NumeroPseudoaleatorio(){

    };
    public NumeroPseudoaleatorio(double num){
        this.numero=num;

    };
    //si hay que hacer varios metodos, eliminar este, o hacerlo sin parametro
    public abstract double generarNumero(double num);
    public abstract double generarNumero();

}
