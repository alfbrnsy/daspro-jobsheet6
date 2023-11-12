import java.util.Scanner;

/**
 * Pemilihan2Percobaan303
 */
public class Pemilihan2Percobaan303 {
    public static void main(String[] args) {
    Scanner input03 = new Scanner(System.in);

    String kategori;
    int penghasilan, gajibersih;
    double pajak = 0;

    System.out.println("Masukan kategori :  ");
    kategori = input03.nextLine();
    System.out.println("Masukan besarnya penghasilan :  ");
    penghasilan = input03.nextInt();

    if (kategori.equalsIgnoreCase("Pekerja")) {
        if (penghasilan <= 2000000)
            pajak = 0.1;
        else if (penghasilan <= 3000000)
            pajak = 0.15;
        else
            pajak = 0.2;
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasil Bersih : " + gajibersih);

  } else if (kategori.equals("pebisnis")) {
        if (penghasilan <= 2000000) 
            pajak = 0.15;
        else if (penghasilan <= 3500000)
            pajak = 0.2;
        else
            pajak = 0.25;
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasil bersih : " + gajibersih);
    
      } else
        System.out.println("Masukan kategori salah");
        
    }
}
