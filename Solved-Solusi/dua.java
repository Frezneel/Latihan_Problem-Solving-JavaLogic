import java.util.Scanner;

//SELESAI
public class dua {
    public static void main(String[] args) {
        System.out.println("======= Galih M Ichsan Training Moment ============");
        String username = "";
        String output1 = "valid";
        String output2 = "invalid";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        username = scanner.nextLine();
        if(username.length() <= 5 || username.length() >=10){
            System.out.print(output2);
        }
        else{
            boolean simbol = true;
            for(char karakter : username.toCharArray()){
                if(!(Character.isLetterOrDigit(karakter)|| karakter=='_')){
                    simbol = false;
                    break;
                }
            }
            if (simbol) {
                System.out.print(output1);
            }else{
                System.out.println(output2);
            }
        }
    }
}
