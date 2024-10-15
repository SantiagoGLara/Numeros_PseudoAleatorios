public class CuadradosMedios extends NumeroPseudoaleatorio{

    int calculo;
    double numero;
    String intercambio;
    public CuadradosMedios(){
        super();
        numero=0.0;
        calculo=0;
        intercambio="";
        
    }
    public CuadradosMedios(Double num){
        super(num);
        calculo=0;
        intercambio="";
    }

    
    public double generarNumero(double num){
        //calculo= (int) Math.pow(num, 2);
        return num;
    }
    //genera un numero pseudoaleatorio, decimal. para manipular con iteraciones multiplicar x10,0000S
    public double generarNumero(){
        calculo=(int)Math.pow(numero, 2);
        
        if(calculo<10000000 && calculo>1000000){
            intercambio=String.format("%8d",calculo);
            intercambio="0."+intercambio.substring(2,6).trim();
        }
        else if(calculo<1000000){
            intercambio=String.format("%8d",calculo);
            intercambio="0."+intercambio.substring(2,6).trim();

        }
        else{
            intercambio=String.valueOf(calculo);
            intercambio="0."+intercambio.substring(2,6).trim();
        }
        
        numero=Double.parseDouble(intercambio);
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    public double getNumero(){
        return numero;
    }
}
