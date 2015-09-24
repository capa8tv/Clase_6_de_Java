
package tallerjava6;


public class Arreglo_Bidimensional {
    public static void main(String[] args) 
    {
        //arreglos bidimensional o matrices
        String matriz[][]=new String[2][5];
        
        matriz[0][0]="Chile";
        matriz[0][1]="Perú";
        matriz[0][2]="Bolivia";
        matriz[0][3]="Argentina";
        matriz[0][4]="Uruguay";
        
        matriz[1][0]="Colombia";
        matriz[1][1]="Venezuela";
        matriz[1][2]="Ecuador";
        matriz[1][3]="Costa Rica";
        matriz[1][4]="Méxicos";
        System.out.println("----------------recorro con for----------------");
        for(int i=0;i<matriz.length;i++)//recorremos las filas
        {
            for(int c=0;c <matriz[i].length;c++)//recorremos las columnas
            {
                System.out.println("La fila "+i+" la columna "+c+" valor "+matriz[i][c]);
            }
        }
        System.out.println("----------------recorro con foreach----------------");
        for(String[] columnas : matriz)//recorremos las filas
        {
            for(String dato : columnas)
            {
                System.out.println("valor  "+dato);
            }
        }
    }
}
