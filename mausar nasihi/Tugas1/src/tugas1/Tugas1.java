package tugas1;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int[] angka = new int[7];
        int kcl=999;
        int bsr=0;
        int jml=0;
		
        for (int i=1; i<=angka.length; i++)
        {
          System.out.print("Masukan Nilai ke-"+i+" = ");
          angka[i-1] = inputUser.nextInt();
		  
          if(angka[i-1]<kcl)
              kcl=angka[i-1];
		  
          if(angka[i-1]>bsr)
              bsr=angka[i-1];
		  
          jml+=angka[i-1];

        }
        float rata=jml/angka.length;
		
        System.out.println("Nilai terkecil = "+kcl);
        System.out.println("Nilai terbesar = "+bsr);
        System.out.println("Nilai rata-rata = "+rata);
		
        for (int i=1; i<=angka.length; i++)
        {  
          System.out.print(angka[i-1]+" ");
        }
        System.out.println(" ");
    }
     
}
