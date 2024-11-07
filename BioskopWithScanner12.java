import java.util.Scanner;
public class BioskopWithScanner12{
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);


        int baris, kolom;
        String nama, next;
        String[][] penonton =new String[4][2];

        System.out.println("PILIHAN MENU");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Masukkan pilihan menu (1-3): ");
        int pilihan = input.nextInt();

        switch(pilihan){
            case 1:
            System.out.print("Masukkan nama: ");
            nama = input.nextLine();
            input.nextLine();

            System.out.print("Masukkan baris: ");
            baris = input.nextInt();

            System.out.print("Masukkan kolom: ");
            kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya?? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }

            case 2:
            for (int i = 0; i < penonton.length; i++){
                System.out.println("Penonton pada baris ke-" + (i +1) + ": " String.join(", ", penonton[i]));
            }


        }

    
    }
}