import java.util.Scanner;

/**
 * Pemilihan2Percobaan203
 */
public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
    Scanner input03 = new Scanner(System.in);
    
    float sudut1, sudut2, sudut3, totalsudut ;

    System.out.println("Masukan sudut pertama");
    sudut1 = input03.nextFloat();
    System.out.println("Masukan sudut kedua");
    sudut2 = input03.nextFloat();
    System.out.println("Masukan sudut ketiga");
    sudut3 = input03.nextFloat();

    totalsudut = sudut1 + sudut2 + sudut3;

    if (totalsudut == 180) 
    {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
         {
            System.out.println("Segitiga tersebut adalah segita siku siku");
         }
         else if ((sudut1 == 60) && (sudut2 == 60 ) && (sudut3 == 60))
         {
            System.out.println("Segitiga tersebut adalah segitiga sama sisi ");
         }
         else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut3 == sudut1))
         {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
         }
         else
         {
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
         }

    } 
    else
    {
        System.out.println("Bukan segitiga");
    }
   }
}
