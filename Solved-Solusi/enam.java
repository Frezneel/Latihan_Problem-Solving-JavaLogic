import java.util.Random;
import java.util.Scanner;

public class enam {
    public static void main(String[] args) {
        System.out.println("======= Galih M Ichsan Training Moment ============");
        // Gacha Player yang menang
        // Memasukkan bobot nilai 
        // -------------
        // | 3 | 5 | 3 |
        // -------------
        // | 5 | 8 | 5 |
        // -------------
        // | 3 | 5 | 3 |
        // -------------
        int[]bobot = {3,5,3,5,8,5,3,5,3};
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        String player = "";
        // memastikan input data sesuai player A dan Player B dengan huruf besar atau kecil
        // menggunakan while agar dapat berulang sampai input dimasukkan dengan benar
        while (repeat) {
            System.out.print("Tentukan Player Andalanmu, Pilih Player \nA atau Player B => ");
            player = scanner.nextLine();
            if (player.equals("A")|| player.equals("a")
                || player.equals("B") || player.equals("b")) {
                repeat = false;
            }else{
                System.out.println("Pilihan tidak valid!");
            }

        }
        // merandom posisi angka pada kotak, dimana posisi tersebut diarahkan pada nilai bobot
        // urutan angka kotak
        // 1   2   3
        // 4   5   6
        // 7   8   9
        Random angka = new Random();
        int total_a = 0;
        int total_b = 0;
        // Membuat perulangan, dimana berfungsi untuk 3x putaran permainan 
        for(int i =0; i<3; i++){
            System.out.println("============================");
            int p_a = angka.nextInt(9)+1;
            int p_b = angka.nextInt(9)+1;
            System.out.println("Round "+(i+1)+" => A="+ p_a+", B="+p_b);
            // Mengambil nilai bobot berdasarkan posisi dan menjumlahkannya setelah ke round berikutnya
            total_a += bobot[p_a-1];
            total_b += bobot[p_b-1];
            System.out.println("Nilai A="+ total_a+", B="+total_b);
        }
        System.out.println("============================");
        // Membuat rule kemenangan untuk nilai player yang telah dipilih
        if(player.equals("A")|| player.equals("a")){
            if (total_a<total_b) {
                    System.out.println("Anda Kalah, Player B Menang");
                }
                else if(total_a==total_b){
                    System.out.println("Player A dan Player B Draw");
                }else{
                    System.out.println("Anda Menang, Player B kalah");
                }
        }
        else if(player.equals("B") || player.equals("b")){
            if (total_a>total_b) {
                    System.out.println("Anda Kalah, Player A Menang");
                }
                else if(total_a==total_b){
                    System.out.println("Player A dan Player B Draw");
                }else{
                    System.out.println("Anda Menang, Player A kalah");
                }
        }else{
            System.out.println("Terjadi kesalahan inisial player input !!");
        }

    }
}
