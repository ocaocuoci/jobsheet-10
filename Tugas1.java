import java.util.Scanner;
public class Tugas1{
    public static void main (String [] args){
        Scanner input =new Scanner(System.in);

        double rataResponden =0, rataKeseluruhan = 0, rataPertanyaan;
        double totalNilai=0;
        int nilai;

        int [][] survey = new int[10][6];

        for (int i = 0; i < survey.length; i++){
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < survey[i].length; j++){
                System.out.print("Input nilai dari 1-5 untuk pertanyaan ke-" + (j + 1) + ": ");
                    nilai = input.nextInt();
                    survey[i][j] = nilai;
                    rataResponden += nilai;
                    totalNilai += nilai;
           
            }
            rataResponden /= survey[i].length;       
            System.out.println("Rata rata Responden: " + rataResponden);
            System.out.println();
        }
        for(int j = 0; j < survey[0].length; j++ ){
            rataPertanyaan =0;

            for(int i =0; i < survey.length; i++){
                rataPertanyaan += survey[i][j];
            }
            rataPertanyaan /= survey.length;
            System.out.println("Rata rata pertanyaan ke-" + (j + 1) + ": " + rataPertanyaan);
        }
        System.out.println();
        rataKeseluruhan = totalNilai / (survey.length * survey[0].length);
        System.out.println("Rata rata keselurusan " + rataKeseluruhan);

    }
}