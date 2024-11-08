import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next = "y";
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("PILIHAN MENU");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Masukkan pilihan menu (1-3): ");
            int pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                while (next.equalsIgnoreCase("y")) {
                    System.out.print("Masukkan nama penonton: ");
                    nama = input.nextLine();

                    System.out.print("Masukkan baris (0-3): ");
                    baris = input.nextInt();

                    System.out.print("Masukkan kolom (0-1): ");
                    kolom = input.nextInt();
                    input.nextLine();

                    if (baris >= 0 && baris < 4 && kolom >= 0 && kolom < 2) {
                        if (penonton[baris][kolom] == null) {
                            penonton[baris][kolom] = nama;
                            System.out.println("Data penonton berhasil diinput!");
                        } else {
                            System.out.println("Kursi sudah terisi!");
                        }
                    } else {
                        System.out.println("Kursi tidak tersedia!");
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "null") + " ");
                    }
                    System.out.println();
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan yang di-input tidak valid!");
            }
        }
        input.close();
    }
}
