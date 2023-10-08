import java.util.Scanner;

public class satu {
    public static void main(String[] args) {

        System.out.println("======= Galih M Ichsan Training Moment ============");
        int jumlahInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        jumlahInput = scanner.nextInt();
        int angka[] = new int[jumlahInput];
        //Ambil data sebanyak N
        for(int i=0; i<jumlahInput; i++){
            System.out.print("Masukkan Angka ke \'"+(i+1)+"\'' :");
            angka[i] = scanner.nextInt();
        }
        //Menjumlahkan data
        for(int j=0; j<angka.length; j++){
            int jumlah = 0;
            for(int k=0; k<=j; k++){
                String nAngka = Integer.toString(angka[k]);
                //Menambahkan tanda + untuk data ke 2 - n
                if (k!=0) {
                    System.out.print(" + ");
                    System.out.print(nAngka);
                }else{
                    System.out.print(nAngka);
                }
                jumlah += angka[k];
            }
            if (j != 0) {
                System.out.println(" = "+jumlah);
            }else{
                System.out.println();
            }
            
            
        }   
    }
    
}