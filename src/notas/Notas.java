/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] notas=new int[4];
        int[] copia=new int [4];
        int[] carnet=new int[4];
        Scanner entrada=new Scanner(System.in); 
        for(int i=0;i<notas.length;i++)
        {
        System.out.print("Ingrese carnet del alumno: ");
        carnet[i]=entrada.nextInt();
        System.out.print("Ingrese nota: ");
        notas[i]=entrada.nextInt();
        copia[i]=notas[i];
            System.out.println();
        }
    Ordenamiento(notas);
    Mostrar(notas, carnet,copia);  
    }
public static int[] Ordenamiento(int arreglo[])
{
int aux;
for(int i=0;i<arreglo.length;i++)
{
   for(int j=0;j<arreglo.length;j++)
   {
   if(arreglo[i]>arreglo[j])
   {
   aux=arreglo[i];
   arreglo[i]=arreglo[j];
   arreglo[j]=aux; 
   }
   }
}
return arreglo;
}
public static void Mostrar(int arreglo[], int nombres[],int copia[])
{
for(int i=0;i<arreglo.length;i++)
{
    for(int j=0;j<copia.length;j++)
    {
    if(arreglo[i]==copia[j])
    {
       System.out.println("Carnet alumno: "+nombres[j]); 
       System.out.println("NOTA: " +arreglo[i]);    
    }
    }
} 
}
}
