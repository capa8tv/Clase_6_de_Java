
package tallerjava6;

public class TallerJava6 {

   
    public static void main(String[] args) 
    {
        // 23 56 34 56 78 
        //posiciones 
        //índice, en java comienzan a contar de cero
        //la cantidad de posiciones representa el largo del arreglo
        //crear un arreglo unidimensional de forma normal
        int matriz[] = new int[5];
        //System.out.println("el largo de matriz es "+ matriz.length);
        matriz[0]=23;
        matriz[1]=56;
        matriz[2]=34;
        matriz[3]=56;
        matriz[4]=78;
        //crear un arreglo unidimensional con llaves
        int matriz2[]={45,565,676,432,2345,676,432,2345,212};
        //System.out.println(matriz[4]);
        System.out.println("----------------recorro con for----------------");
        for(int i=0;i<matriz.length;i++)
        {
            System.out.println("valor= "+matriz[i]);
        }
        System.out.println("----------------recorro con foreach----------------");
        for(int m : matriz2 )
        {
            System.out.println("valor ="+m);
        }
        
    }
    
}
