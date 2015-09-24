package tallerjava6;

import java.util.ArrayList;

 

public class ArrayObjeto 
{
    public static void main(String[] args) 
    {
        ArrayList<String> matriz= new ArrayList<>();
        matriz.add("Chile");
        matriz.add("Perú");
        matriz.add("Colombia");
        matriz.add("Venezuela");
        matriz.add("Costa Rica");
        //flaite
        System.out.println("----------------recorro con for----------------");
        for(int i=0;i<matriz.size();i++)
        {
            System.out.println("valor = "+matriz.get(i));//matriz.get(i)== matriz[]  
        }
    }
}
