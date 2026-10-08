public class App{
    public static void main(String args[]){

        //Instanciacion de variables
        int x = 6;
        int y = 3;
        int z = x + y;
        //Ejecucion del metodo runCalculator
        runCalculator(z);
    }
    //Metodo que realiza un calculo y lo imprime en consola
    private static void runCalculator(int z) {
        for(int i = 0; i < z; i++){
                System.out.println("Calculating:" + (i+1));
        }
    }
}