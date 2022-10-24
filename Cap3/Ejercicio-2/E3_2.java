import java.util.Random;


public class E3_2 {
     
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[5][5];
        inicializar(matrizNumeros);
        visualizar(matrizNumeros);
       
    }
 
    static void inicializar(int[][] matriz)
    {
         Random r = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = r.nextInt(25) + 1; 
            }
        }
    }
     
    static void visualizar(int[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}