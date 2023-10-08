import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lima {
 public static void main(String[] args) {
   System.out.println("======= Galih M Ichsan Training Moment ============");
   //input
   int n; //Penduduk
   int m; //Calon Legislatif 
   Random random = new Random(); //Random data
   Scanner scanner = new Scanner(System.in);
   //Input n(penduduk) dan m(calon legislatif)
   System.out.print("Masukkan total penduduk : ");
   n = scanner.nextInt();
   System.out.print("Masukkan jumlah Calon Legislatif : ");
   m = scanner.nextInt();

   int pilihan_n[] = new int[n]; //untuk menampung data pemilihan secara random
   int all_suara[] = new int[m+1]; //untuk menampung data total suara berdasarkan nomor legislatif
   String[] output = new String[m+1]; //untuk menampung data yang sudah diolah untuk dikeluarkan / diprint
   
   for(int i=0; i<(n) ;i++){
      pilihan_n[i] = random.nextInt(m+1);
      for(int j=0; j<=m ; j++){
         if (pilihan_n[i] == j) {
            all_suara[j] ++ ;
         }
      }
   }
   for(int j=0; j<=m; j++){
      double hasilPersen;
      hasilPersen = ((all_suara[j]*100)/n);
      DecimalFormat df = new DecimalFormat("0.00");
      String persen = df.format(hasilPersen);
      if(j == 0){
         output[j] = "Golput \'"+j+"\': " + all_suara[j] + " Suara ("+ persen +"%)";
 
      }else{
         output[j] = "Calon no. urut \'"+j+"\': " + all_suara[j] + " Suara ("+ persen +"%)";
      }
  }
   Arrays.sort(output);
   for(int k=0; k<output.length; k++){
      System.out.println(output[k]);
   }
 }   
}
