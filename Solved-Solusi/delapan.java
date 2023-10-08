import java.util.Scanner;

public class delapan {
    public static void main(String[] args) {
        System.out.println("======= Galih M Ichsan Training Moment ============");
        //Deret angka Dinamis 
        // 0 1 2
        // 3 4 5
        // 6 7 8
        int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] ambilAngka={};
        Scanner scanner = new Scanner(System.in);
        
        // Looping input 1 Pola
        boolean loopInput1 = true;
        String pilihan1="";
        while (loopInput1 == true) {
            System.out.println("Masukkan pola : ");
            System.out.println(" x | + | - ");
            System.out.print("Jawab : ");
            pilihan1 = scanner.nextLine();
            pilihan1 = pilihan1.toLowerCase();
            if (pilihan1.equals("x")) {
                ambilAngka = new int[]{angka[0], angka[4], angka[8], angka[2], angka[4], angka[6]};
                loopInput1 = false;
            }else if(pilihan1.equals("+")){
                ambilAngka = new int[]{angka[1], angka[4], angka[7], angka[3], angka[4], angka[5]};
                loopInput1 = false;
            }else if(pilihan1.equals("-")){
                ambilAngka = new int[]{angka[3], angka[4], angka[5]};
                loopInput1 = false;
            }else{
                System.out.println("Pola tidak dikenali");
            }    
        }

        // Looping input 2 Action
        boolean loopInput2 = true;
        String pilihan2="";
        
        while (loopInput2 == true) {
            System.out.println("Masukkan Action : ");
            System.out.println(" x | + | - ");
            System.out.print("Jawab : ");
            pilihan2 = scanner.nextLine();
            pilihan2 = pilihan2.toLowerCase();
            if (pilihan2.equals("x")) {
                int total=1;
                String penejasan="";
                for(int i=0; i<ambilAngka.length ; i++){
                    total*=ambilAngka[i];
                    if (ambilAngka.length>4) {
                        if (i==0 || i==3) {
                            penejasan+="("+ambilAngka[i]+" x ";}
                        else if (i==(1*3)-1){
                            penejasan+=ambilAngka[i]+") x ";}
                        else if(i==ambilAngka.length-1){
                            penejasan+=ambilAngka[i]+")";
                        }
                        else {
                            penejasan+=ambilAngka[i]+" x ";
                        }
                    }else{
                        if (i==(ambilAngka.length-1)) {
                        penejasan+=ambilAngka[i];    
                        }else{
                        penejasan+=ambilAngka[i]+" x ";};
                    }
                }
                System.out.print("Penjelasan: ");
                System.out.println(penejasan+" = "+total);                
                loopInput2 = false;
            }else if(pilihan2.equals("+")){
                int total=0;
                String penejasan="";
                for(int i=0; i<ambilAngka.length ; i++){
                    total+=ambilAngka[i];
                    if (ambilAngka.length>4) {
                        if (i==0 || i==3) {
                            penejasan+="("+ambilAngka[i]+" + ";}
                        else if (i==(1*3)-1){
                            penejasan+=ambilAngka[i]+") + ";}
                        else if(i==ambilAngka.length-1){
                            penejasan+=ambilAngka[i]+")";
                        }
                        else {
                            penejasan+=ambilAngka[i]+" + ";
                        }
                    }else{
                        if (i==(ambilAngka.length-1)) {
                        penejasan+=ambilAngka[i];    
                        }else{
                        penejasan+=ambilAngka[i]+" + ";};
                    }
                }
                System.out.print("Penjelasan: ");
                System.out.println(penejasan+" = "+total);                
                loopInput2 = false;
            }else if(pilihan2.equals("-")){
                int total=0;
                String penejasan="";
                for(int i=0; i<ambilAngka.length ; i++){
                    total-=ambilAngka[i];
                    if (ambilAngka.length>4) {
                        if (i==0 || i==3) {
                            penejasan+="("+ambilAngka[i]+" - ";}
                        else if (i==(1*3)-1){
                            penejasan+=ambilAngka[i]+") - ";}
                        else if(i==ambilAngka.length-1){
                            penejasan+=ambilAngka[i]+")";
                        }
                        else {
                            penejasan+=ambilAngka[i]+" - ";
                        }
                    }else{
                        if (i==(ambilAngka.length-1)) {
                        penejasan+=ambilAngka[i];    
                        }else{
                        penejasan+=ambilAngka[i]+" - ";};
                    }
                }
                System.out.print("Penjelasan: ");
                System.out.println(penejasan+" = "+total);                
                loopInput2 = false;
            }else{
                System.out.println("Pola tidak dikenali");
            }    
        }
    }
    
}
