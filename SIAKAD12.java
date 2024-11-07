import java.util.Scanner;
public class SIAKAD12{
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jmlSiswa = input.nextInt();
        System.out.println();
        System.out.print("Masukkan jumlah Mata kuliah: ");
        int jmlMatkul = input.nextInt();

        int[][] nilai= new int[jmlSiswa][jmlMatkul];

        for (int i=0; i < nilai.length; i++){
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa =0;

            for (int j =0; j < nilai[i].length; j++){
                System.out.print("Nilai mata kulliah " + (j+1) + ": ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata: " + totalPerSiswa/3);
            System.out.println();
        }
        System.out.println("=========================================");
        System.out.println("Rata rata Nilai setiap Mata Kuliah: ");

        for(int j =0; j < jmlMatkul; j++){
            double totalPerMatkul =0;

            for(int i = 0; i < jmlMatkul; i++){
                totalPerMatkul += nilai[i][j];
            };
        System.out.println("Mata Kuliah " +(j+1) + ": " + totalPerMatkul/4);
        }
    }
    
}