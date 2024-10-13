public class CuadradosMedios extends NumeroPseudoaleatorio{

    int numero;
    public CuadradosMedios(){
        super();
        numero=0;
    }
    public CuadradosMedios(int num){
        this.numero=num;
    }

    
    public int generarNumero(int num){
        num= (int) Math.pow(num, 2);
        return num;
    }

    public int generarNumero(){
        numero=(int)Math.pow(numero, 2);
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
}
