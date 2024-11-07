import java.util.Scanner;
public class Tugas1{
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);

        double rataResponden = 0;
        double rataPertanyaan = 0;
        double rataKeseluruhan = 0;
        int nilai;

        int [][] survey = new int[10][6];

        for (int i = 0; i < survey.length; i++){
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < survey[i].length; j++){
                System.out.print("Input nilai dari 1-5 untuk pertanyaan ke-" + (j + 1) + ": ");
                    nilai = input.nextInt();

           
            }
            rataResponden += survey.length;
            double rataResponden /= survey[i].length;       
            System.out.println("Rata rata Responden: " + rataResponden);
        }
    }
}