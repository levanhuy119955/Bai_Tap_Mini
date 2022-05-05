import java.util.Scanner;

public class Cau04 {
    public static void main(String[] args) {
//        Viết chương trình thực hiện:
//
//        Liệt kê 10 số nguyên tố đầu tiên
//        Liệt kê các số nguyên tố nhỏ hơn 10

            int n = 10;
            System.out.println(n + " " + "So nguyen to dau tien la : ");
            int dem = 0;
            int i = 2;
            while (dem < n) {
                if (Number(i)) {
                    System.out.print(i + " ");
                    dem++;
                }
                i++;
            }
        }

    public static boolean Number(int n) {
        if (n < 2) {
            return false;
        }
        int Interger = (int)Math.sqrt(n);
        for (int i = 2; i <= Interger; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
