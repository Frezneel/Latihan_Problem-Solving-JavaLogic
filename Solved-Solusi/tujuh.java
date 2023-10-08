import java.util.Scanner;

public class tujuh {
    public static void main(String[] args) {
        System.out.println("======= Galih M Ichsan Training Moment ============");
        Scanner scanner = new Scanner(System.in);
        //Tinggal menambahkan item yang ingin di cleaner
        String[] cleaner = {",","\'","\"","@","/","&","(",")"};
        System.out.println("Masukkan Kalimat yang ingin dibersihkan !!");
        String input = scanner.nextLine();
        System.out.println("Sebelum : " + input);

        /*//Terlalu Panjang
        // Menghapus ,
        String output = input.replace(",", "");
        // Menghapus ' kutip satu
        output = output.replace("\'", "");
        // Menghapus " kutip dua
        output = output.replace("\"", "");
        // Menghapus @ anotasi
        output = output.replace("@", "");
        // Menghapus / garis miring
        output = output.replace("/", "");
        // Menghapus & dan
        output = output.replace("&", "");
         System.out.println("Sesudah : " + output); */

        //Menggunakan Looping agar code lebih sederhana
        String output = input;
        for(int i=0; i<cleaner.length; i++){
            output = output.replace(cleaner[i], " ");
        }
        System.out.println("Sesudah : "+ output);

    }
    
}
