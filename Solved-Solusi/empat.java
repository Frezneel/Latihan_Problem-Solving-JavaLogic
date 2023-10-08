import java.util.Scanner;

public class empat {
    //SELESAI
    public static void main(String[] args) {
        int n;
        int x;
        int output;
        System.out.println("======= Galih M Ichsan Training Moment ============");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah halaman : ");
        n = scanner.nextInt();
        System.out.print("Nilai x pada halaman : ");
        x = scanner.nextInt();

        if (x<= 2) {
            System.out.println("Lebar Cover bagian depan");
        }else if(n-x <= 2){
            System.out.println("Lebar Cover bagian belakang");
        }else{
            output =(x/2)+(x%2);
            if (output==0) {
                System.out.println("X pada lembar ke : "+output);
            }else{
                System.out.println("X pada lembar ke : "+(output));
            }
        }
        

    }
}
