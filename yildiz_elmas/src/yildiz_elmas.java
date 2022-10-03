import java.util.Scanner;

public class yildiz_elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // artan yıldız sayısı ve sol tarafındaki boşluğa göre algoritma oluşturuldu
        for (int i = 0; i<=n; i++){
            for (int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // Üst taraftaki algoritmanın tam tersi işletildi
        for (int i = n-1; i>0; i--) {
            for (int j =1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
